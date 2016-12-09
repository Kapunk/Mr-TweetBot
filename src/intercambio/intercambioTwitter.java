package intercambio;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import twitter.twitter;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.User;
import datos.*;

public class intercambioTwitter {

	/**
	 * Metodo para el envio de tweets
	 * @param Mensaje
	 * @throws TwitterException
	 * @throws SQLException 
	 */
	public static void enviarTweet(String Mensaje) throws TwitterException, SQLException {
	       twitter.enviarTweet(Mensaje);
	       java.util.Date fecha = new Date();
	       // Guardamos en BBDD los tweets que vamos enviando
	       bbdd.insertarEnBBDD("Insert into tweetEnviado values (" + Mensaje + " 'usuario' "+ fecha + " )");
	 
	    }
	
	/**
	 * Metodo para leer los tweets de un usuario
	 * @param usuario
	 * @throws TwitterException 
	 */
	public static List<Status> leerTweetUsuario(String usuario) throws TwitterException {
		
		List<Status> statuses;	
		
		statuses = twitter.leerTweetUsuario(usuario);
			
		return statuses;
       
    }
	
	
	/**
	 * Funcion para leer los amigos del usuario que le pasemos
	 * @param usuario
	 * @return
	 * @throws TwitterException
	 */
	public static List<User> leerListaAmigos(String usuario) throws TwitterException {
	       
		List<User> nombresUsuario;
		
		nombresUsuario = twitter.obtenerListaAmigos(usuario);

	 
		return nombresUsuario;
	    }
	
	

}
