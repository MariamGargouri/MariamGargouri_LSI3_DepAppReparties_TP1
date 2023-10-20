package Activite1_1;
//Activite1-1
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {

	public static void main(String[] args) 
	{
		try 
		 {
		     //connexion coté serveur

			 System.out.println("je suis un serveur");
		     ServerSocket serverSocket = new ServerSocket(1234); //on a fait une reservation du port
		     System.out.println("je suis un serveur , j'atend un client");
		     Socket socket=serverSocket.accept(); // elle attend une connexion du client 
		     System.out.println("un client est connecté");
		     
		     //traitement
		     //...
		     
		   //déconnexion coté serveur
		     System.out.println("deconnexion serveur");
		     socket.close();
		     serverSocket.close(); //liberation de tout ce qui est reservé
		  }
		  catch(Exception e) {e.printStackTrace();}
		

	}

}
