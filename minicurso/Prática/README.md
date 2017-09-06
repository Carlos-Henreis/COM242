Parte Prática
===================================================

A ideia era criar uma arquitetura cliente servidor usando protocol Buffers e gRPC.
Nivelando o que foi apresentado na parte teórica.

## Teste rápido

Caso esteja curioso para executar este exemplo é necessário que tenha-se conseguido sucesso nas outras partes do trabalho como principalmente na instalação.

Supondo que tenha passado pelos tutoriais de instação com sucesso para executar o exemplo basta executar o arquivo makefile com o seguinte comando, na pasta do exemplo:

`$ make`

Neste arquivo existem comandos que gerará automaticamente, a partir do arquivo `.proto`, as classes e interfaces necessárias para o cliente e servidor, e também o executável(server C++). 

A execução deste comando gera os seguintes arquivos em seu diretório atual:
### C++

* **Aplicacao.pb.h:** o cabeçalho que declara as classes de mensagens geradas
* **Aplicacao.pb.cc:** contém a implementação das classes de mensagens
* **Aplicacao.grpc.pb.h:** o cabeçalho que declara as interfaces (classes virtuais) de serviço geradas
* **Aplicacao.grpc.pb.cc:** que contém a implementação das interfaces (classes virtuais) de serviço

Elas contêm todo o código do protocol buffer: serializar e recuperar nossos tipos de solicitação e mensagem de resposta. Uma classe chamada Aplicacao que contém um tipo de interface remota (ou stub) para clientes a serem chamados com os métodos definidos no serviço opVet. e duas interfaces abstratas para servidores (implementar) com os métodos definidos no serviço opVet.

### Python

* **Aplicacao_pb2.py**
* **Aplicacao_pb2_grpc.py**

Estes contêm classes para as mensagens, classes para o serviço opVet definidas em Aplicacao.proto.
um stub que pode ser usado por clientes para invocar RPCs e outra classe que define a interface para implementações do serviço opVet.

Após as "compilações" abra dois terminais e navegue até o diretório e entre com os comandos:

* `$./server`, para uniciar o servidor
* `python3 cliente.py`, para o cliente

##TUTORIAL DE COMPILAÇÃO COM PROTOC

###Uso de 4 parâmetros:

       1. Chame o compilador -> protoc
       2. Informe o arquivo de entrada -> arquivo.proto
       3. Informe ao protoc a linguagem de saída -> --java_out ou --cpp_out ou --python_out
       4. Colado à linguagem de saída, coloque = seguido do diretório de saída
       
       A estrutura do comando é a seguinte:     protoc arquivo.proto --java_out=/home/mateus/Downloads/
       Com esse comando seria gerada uma classe java referente ao arquivo.proto na pasta de Downloads.
       
** OBS: Para gerar a classe ou arquivo necessário no diretório atual, use um ' . ', da seguinte forma: **

       ` protoc arquivo.proto --java_out=/home/mateus/Downloads/`
       
  
#### Tomaremos um arquivo com nome de aplicacao.proto em nossos exemplos do comando. O arquivo será salvo na pasta atual e em seguida na pasta de um projeto chamado ProjUniversidade do netbeans.

*Java
        `protoc aplicacao.proto --java_out=.`
        `protoc aplicacao.proto --java_out=/home/mateus/NetbeansProjects/ProjUniversidade/`

*C++
        `protoc aplicacao.proto --cpp_out=.`
       ` protoc aplicacao.proto --cpp_out=/home/mateus/NetbeansProjects/ProjUniversidade/`
        
*python
        `protoc aplicacao.proto --python_out=.`
        `protoc aplicacao.proto --python_out=/home/mateus/NetbeansProjects/ProjUniversidade/`

## Demais informações

### Descrição da aplicação

O cliente, implementado em Python, faz uma chamada remota de um método do servidor, que está implementado em C++. A aplicaço é simples e o cliente entra com um vetor de números inteiros e, através de uma chamada remota, o servidor processa esse fluxo de dados e retorna a soma dos elementos deste vetor para o cliente.

Para mais informações como diagrama da arquitetura cliente servidor e código estão contidos nesta pasta.
