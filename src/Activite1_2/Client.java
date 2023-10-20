package Activite1_2;
//activite 1-2
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) 
	{


		try{
			  //connexion
			  System.out.println("je suis un client");
			  Socket socket=new Socket("10.25.12.63",1234); // Une socket va etre crée : domander une connexion du client au serveur 
			                                               // "10.25.12.63" c'est l'adresse ip de la machine du client et 1234 c'est le port
			  System.out.println("je suis un client connecté");
			  
			  //partie traitement
			  InputStream is = socket.getInputStream(); // Pour lire le flux qui est dans le port 1234
			  OutputStream os = socket.getOutputStream(); // Pour faire sortir le contenue de os et l'envoyer au serveur
			  int nb;
			  System.out.println("donner une valeur");
			  Scanner scanner= new Scanner(System.in); // Je donne la main au utilisateur d'ecrire une valeur
			  nb=scanner.nextInt(); // nextInt pour lire un entier
			  os.write(nb);
			  System.out.println("la multiplication de "+nb+"*5= "+is.read()+" et la somme de "+nb+"+5= "+is.read());
			  
			  //déconnexion
			  System.out.println("deconnexion client");
			  socket.close();
			}
			catch(Exception e) {e.printStackTrace();}

		
		
	}
	}


