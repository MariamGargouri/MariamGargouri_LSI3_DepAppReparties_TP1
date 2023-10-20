package Activite1_1;
//activite 1 - 1
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args) 
	{
		try{
			
			  // Connexion
			  System.out.println("je suis un client");
			  Socket socket=new Socket("localhost",1234); // Une socket va etre crée : domander une connexion du client au serveur 
			                                             // localhost c'est la machine du client et 1234 c'est le port
			  System.out.println("je suis un client connecté");
			  
			   //traitement
			  //...
			  
			  
			  //Déconnexion
			  System.out.println("deconnexion client");
			  socket.close();// Déconnexion coté client 
			}
			catch(Exception e) {e.printStackTrace();
}
		
		
	}
}
