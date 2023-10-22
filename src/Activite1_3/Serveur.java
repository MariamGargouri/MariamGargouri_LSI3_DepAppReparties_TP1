package Activite1_3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
	public static void main(String[] args) 
	{
		 try 
		 {
		     System.out.println("je suis un serveur");
		     //connexion coté serveur
		     ServerSocket serverSocket = new ServerSocket(1234); //on a fait une reservation du port
		     System.out.println("je suis un serveur , j'atend un client");
		     Socket socket=serverSocket.accept(); // elle attend une connexion du client 
		     System.out.println("un client est connecté");
		     
		     //traitement
		     InputStream is = socket.getInputStream();   // elle prend le contenue de os du client
		     OutputStream os = socket.getOutputStream();// Pour envoyer la resultat au client
		     										   //is et os : pour la communication client/serveur
		     
			 
			 	//recupération des donnés par le serveur
		     int nb=is.read();
		     int op=is.read();
		       
		     int rep=0;
		     switch(op) {
		     case 1: 
		    	 	rep=5+nb;
		    	 	break;
		     case 2:
		    	 	rep=nb-5;		       
		    	 	break;
		     case 3:
		    	 	rep=5*nb;			       
		    	 	break;
			 case 4:
			    	 rep=nb/5;			       
			    	 break;}
		     
		     os.write(rep);// pour envoyer le resultat au client

		     
		     //déconnexion
		     System.out.println("deconnexion serveur");
		     socket.close();
		     serverSocket.close(); //liberation de tout ce qui est reservé
		  }
		  catch(Exception e) {e.printStackTrace();}
		
	}
}
