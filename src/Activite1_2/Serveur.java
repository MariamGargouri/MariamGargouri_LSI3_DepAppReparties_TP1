package Activite1_2;
//Activite 1-2 
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur 
{
	public static void main(String[] args) {
		 try 
		 {
		     System.out.println("je suis un serveur");
		     //connexion coté serveur
		     ServerSocket serverSocket = new ServerSocket(1234); //on a fait une reservation du port
		     System.out.println("je suis un serveur , j'atend un client");
		     Socket socket=serverSocket.accept(); // elle attend une connexion du client 
		     System.out.println("un client est connecté");
		     
		     //traitement
		     InputStream is = socket.getInputStream(); // elle prend le contenue de os du client
		     OutputStream os = socket.getOutputStream();// Pour envoyer la resultat au client
		     int nb=is.read();
		     int rep =nb*5;
		     int rep1=nb+5;
		     os.write(rep);
		     os.write(rep1);
		     
		     //déconnexion
		     System.out.println("deconnexion serveur");
		     socket.close();
		     serverSocket.close(); //liberation de tout ce qui est reservé
		  }
		  catch(Exception e) {e.printStackTrace();}
		
	}

}
