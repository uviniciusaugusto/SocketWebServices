package tsi.ws.vasp;

import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class cliente {

	public static void main(String[] args) {
		clienteSocket();
	}

	private static void clienteSocket() {
		 try {
		      Socket cliente = new Socket("127.0.0.1",16000);
		      InputStreamReader entrada  = new InputStreamReader(cliente.getInputStream(), "UTF-8");
		      Scanner s = new Scanner(entrada);
		      String mensagem = "";
		      while(s.hasNextLine())
		    	  mensagem += s.nextLine() + "\n" ;
		      
		      JOptionPane.showMessageDialog(null, mensagem,"Mensagem", JOptionPane.INFORMATION_MESSAGE);
		     
		      entrada.close();
		      System.out.println("Conexão encerrada");
		      cliente.close();
		      s.close();
		    }
		    catch(Exception e) {
		      System.out.println("Erro: " + e.getMessage());
		    }
	}

}
