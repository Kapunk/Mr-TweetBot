
package bot;

import twitter4j.TwitterException;

import java.util.List;

import intercambio.*;


public class botTwitter {

	/**
	 * funcion para recoger los tweets y tratarlos en caso necesario
	 * @param usuario
	 * @return lista con los tweets del usuario
	 * @throws TwitterException
	 */
	@SuppressWarnings("unchecked")
	public static List<String> leerTweetsusuario(String usuario) throws TwitterException {
		// TODO Auto-generated method stub
		
		return intercambioTwitter.leerTweetUsuario(usuario);


	}
	
	/**
	 * Funcion para construir los tweets a enviar
	 * @param mensaje
	 * @throws TwitterException
	 */
	public static void construirTweet(String mensaje) throws TwitterException{
		
		intercambioTwitter.enviarTweet(mensaje);
	}
	
	/**
	 * Funcion para ver los amigos que tiene el usuario que le pasemos
	 * @param usuario
	 * @return
	 * @throws TwitterException
	 */
	public static List<String> leerAmigosUsuario(String usuario) throws TwitterException{
		
		return intercambioTwitter.leerListaAmigos(usuario);
	}



}
