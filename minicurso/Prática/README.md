Parte Prática
===================================================

A ideia era criar uma arquitetura cliente servidor usando protocol Buffers e gRPC.
Nivelando o que foi apresentado na parte teórica.

## Teste rápido

Caso esteja curioso para executar este exemplo é necessário que tenha-se conseguido sucesso nas outras partes do trabalho como principalmente na instalação.

Supondo que tenha passado pelos tutoriais de instação com sucesso para executar o exemplo basta executar o arquivo makefile com o seguinte comando, na pasta do exemplo:

`$ make`

Neste arquivo existem comandos que gerará automaticamente, a partir do arquivo `.proto`, as classes e interfaces necessárias para o cliente e servidor, e também o executável(server C++). Após as "compilações" abra dois terminais e navegue até o diretório e entre com os comandos:

* `$./server`, para uniciar o servidor
* `python3 cliente.py`, para o cliente

## Demais informações

### Descrição da aplicação

O cliente, implementado em Python, faz uma chamada remota de um método do servidor, que está implementado em C++. A aplicaço é simples e o cliente entra com um vetor de números inteiros e, através de uma chamada remota, o servidor processa esse fluxo de dados e retorna a soma dos elementos deste vetor para o cliente.

Para mais informações como diagrama da arquitetura cliente servidor e código estão contidos nesta pasta.
