import grpc
import time
import random

import Aplicacao_pb2
import Aplicacao_pb2_grpc

def generate_Vet(Num_list):
	for num in Num_list:
		yield num
#Chamar o somaVet deve-se passar um iterador para somaVet.
#Cretorna uma única resposta, pode ser chamado de forma síncrona ou assíncrona:
def c_Soma_Vet(stub, vet):
	Num_list = []
	print ("Vetor")
	for number in vet:
		#cria uma lista da mensagem Vet
		v = Aplicacao_pb2.Vet(n=number)
		Num_list.append(v)
		print ("->%d" % number)
	#Inicia chama um genetror que contem um interator para iniciar o fluxo
	vet_iterator = generate_Vet(Num_list)
	print
	num = stub.somaVet(vet_iterator)
	print("Soma do vetor: %d" % num.n)
	

def main():
	#Para chamar métodos de serviço, primeiro precisamos criar um stub.
	#Instanciamos a classe clienteStub do módulo Aplicacao_pb2_grpc, gerado a partir do nosso .proto.
	channel = grpc.insecure_channel('200.235.95.199:4050')
	stub = Aplicacao_pb2_grpc.opVetStub(channel)
	#inicializa vet
	vet = [1, 2, 4, 8, 16, 32, 64, 128, 255]
	print("-------------- Somando elementos de um vetor --------------")
	#função responsável por envocar o metodo soma_vet do servidor
	c_Soma_Vet(stub, vet)

if __name__ == '__main__':
	main()

