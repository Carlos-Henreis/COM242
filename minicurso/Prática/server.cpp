#include <iostream>

#include <string>

#include <grpc++/grpc++.h>
#include <grpc/grpc.h>
#include <grpc++/server.h>
#include <grpc++/server_builder.h>
#include <grpc++/server_context.h>
#include <grpc++/security/server_credentials.h>


#include "Aplicacao.pb.h"
#include "Aplicacao.grpc.pb.h"

using std::cout;
using std::string;
using grpc::Server;
using grpc::ServerBuilder;
using grpc::ServerContext;
using grpc::ServerReader;
using grpc::ServerReaderWriter;
using grpc::ServerWriter;
using grpc::Status;



/*
*Implementando a interface de serviço gerada a partir de nossa definição de serviço 
*(faz o "trabalho" real de nosso serviço executando um servidor gRPC para ouvir os 
*edidos dos clientes e retornar as respostas do serviço.
*/

class serverImp final : public cliente::Service{

/*
*Neste caso, estamos implementando a versão síncrona, que fornece o nosso comportamento padrão do servidor gRPC. 
*Também é possível implementar uma interface assíncrona cliente::AsyncService, que permite que você personalize 
*ainda mais o comportamento de threading do seu servidor, embora não vejamos isso neste minicurso. 
*/

public:
	/*
	* serverImp implementa todos os nossos métodos de serviço definidos.
	*/
	/*
	* Note que o método somaVet parte da transmissão do lado do cliente, 
	* para que isso ocorra a método recebe um objeto ServerReader e uma 
	* única resposta. Usamos o método ReadReaderer(Read) para ler repetidamente
	* nos pedidos do nosso cliente até que não haja mais mensagens: o servidor 
	* precisa verificar o valor de retorno de Read () após cada chamada. Se for 
	* verdade, o fluxo ainda é bom e pode continuar a ler. Se for falso, o fluxo 
	* de mensagens terminou.
	*/
	Status somaVet(ServerContext* context, ServerReader<Vet>* reader, Num* num) override {
	    Vet v;
	    int vet_cont = 0;
	    cout << "Função invocada pelo cliente" << std::endl;
	    cout << "Vetor recebido" << std::endl;
	    while (reader->Read(&v)) {
			vet_cont+= v.n();
			cout << v.n() << std::endl;
	    }
	    
	    num->set_n(vet_cont);
	    cout << "valor de rotorno: " << vet_cont;
	    return Status::OK;
	}
	/*
	* Para o método é passado um objeto de ServerContext para o RPC, a solicitação 
	* de protocol buffer de Vet do cliente, e um protocol buffer de Num para preencher
	* com as informações de resposta. No método, setamos n de Num com as informações apropriadas 
	* e, em seguida, retornamos com um status OK para dizer ao gRPC que terminamos de lidar com o 
	* RPC e que o num pode ser retornado ao cliente.
	*/

	
	
};

/*É necessário iniciar um servidor gRPC para que os clientes possam realmente usar nosso serviço
* Para inicializar o servido precisamdos de um objeto da classe ServerBuilder
*/
void RunServer() {
	
	string server_address("0.0.0.0:4050");

	//Crie uma instância da nossa classe de implementação do serviço serverImp.
	serverImp service;
	//Crie uma instância da classe ServerBuilder.
	ServerBuilder builder;
	// Especifica o endereço e a porta que queremos usar para ouvir as solicitações dos 
	//clientes usando o método AddListeningPort () do builder.
	builder.AddListeningPort(server_address, grpc::InsecureServerCredentials());
	//Registra nossa implementação de serviço com o bilder.
	builder.RegisterService(&service);
	//Chame para BuildAndStart () de builder para criar e iniciar um servidor RPC para o nosso serviço.
	std::unique_ptr<grpc::Server> server(builder.BuildAndStart());

	cout << "Server listening on " << server_address << std::endl;

	//invoca Wait() no servidor para fazer um bloqueio aguarde até que o processo seja morto ou 
	//o Shutdown() seja chamado.
	server->Wait();
}



int main(int argc, char** argv) {
	RunServer();
	return 0;
}