import socket 

serverPort = 16000
serverSocket = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
serverSocket.bind(("127.0.0.1",serverPort))
serverSocket.listen(0)

print("Servidor pronto para receber")


connectionSocket, addr = serverSocket.accept()
print("Conexâo vinda de {}".format(addr))

mensagem = "O que é JSon?\nDefinicao: JSON é basicamente um formato leve de troca de informações/dados entre sistemas.\nVantagens:\n - Leitura mais simples,\n - Analisador(parsing) mais fácil,\n - JSON suporta objetos!,\n - Velocidade maior na execução e transporte de dados,\n - Arquivo com tamanho reduzido\nQuem usa? Google, Facebook, Yahoo!, Twitter..."


connectionSocket.send(mensagem.encode('utf-8'))
		
connectionSocket.close()
	
