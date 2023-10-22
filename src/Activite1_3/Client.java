package Activite1_3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.outil.Scanner;

public class Client {
	public static void main(String[] args) 
	{
		try{
			 //connexion
			  InetAddress inetAddress = InetAddress.getByName("10.25.63");// Pour chercher une machine aver l'adresse ip "10.25.12.63" 
			  InetSocketAddress inetSocketAdd = new InetSocketAddress (inetAddress,1234); //inetSocketAdd c'est un lien virtuel entre les deux machines  
			  Socket socket=new Socket(); // une socket va etre crée qui signifie un transporteur de donnée
			  socket.connect(inetSocketAdd);// socket va connecter sur le chemin entre les deux machines 
			  System.out.println("je suis un client connecté");
			  
			  
			  // traitement
			  InputStream is = socket.getInputStream(); // Pour lire le flux qui est dans le port 1234
			  OutputStream os = socket.getOutputStream(); // Pour faire sortir le contenue de os et l'envoyer au serveur
			  												// os et is : pour la communicatin client/Serveur
			  
			  int nb;
			  int op;

			  System.out.println("donner l'opérande");
			  Scanner scanner= new Scanner(System.in); // Je donne la main au utilisateur d'ecrire une valeur
			  nb=scanner.nextInt(); // nextInt pour lire un entier
			  
			  	//le client choisit la nature de l’opération à exécuter côté serveur à travers un Menu de choix.
			  do
			  {
			  System.out.println("Choisissez la nature de l opération: 1-Addition / 2-Soustraction / 3-Multiplication / 4-Division");
			  op=scanner.nextInt(); // nextLine pour lire un caractère ou une chaine de caractères
			  } while (op < 1 || op > 4 );
			  
			 
			  os.write(nb);// envoyer le premier opérande au serveur 
			  os.write(op);;// envoyer l'opération au serveur 
			  			  
			  System.out.println("la resultat est : "+is.read());


			  
			  //déconnexion
			  System.out.println("deconnexion client");
			  socket.close();
			}
			catch(Exception e) {e.printStackTrace();}
		}
}
