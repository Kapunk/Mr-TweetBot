package twitter;

import java.util.List;

import credencial.credencial;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.conf.ConfigurationBuilder;

public class twitter {
	
	/**
	 * Metodo para el envio de tweets
	 * @param Mensaje
	 * @throws TwitterException
	 */
	public static void enviarTweet(String Mensaje) throws TwitterException{
	       Twitter twitter;
	       
	       ConfigurationBuilder cb = credencial.credencialTwitter();	       
	       twitter = new TwitterFactory(cb.build()).getInstance();	 
	       Status tweetEnviado = twitter.updateStatus(Mensaje);      
	       
	    }
	
	/**
	 * Metodo para leer los tweets de un usuario
	 * @param usuario
	 * @throws TwitterException 
	 */
	
	public static List<Status> leerTweetUsuario(String usuario) throws TwitterException {

            ConfigurationBuilder cb = credencial.credencialTwitter();

            TwitterFactory tf = new TwitterFactory(cb.build());
            Twitter twitter1 = tf.getInstance();
            List<Status> statuses;
            statuses = twitter1.getUserTimeline(usuario);
            return statuses;
		
    }
	
	/**
	 * devuelve la lista de amigos de un usuario
	 * @param usuario
	 * @return
	 */
	public List<User> obtenerListaAmigos(String usuario) {
		
        ConfigurationBuilder cb = credencial.credencialTwitter();
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter1 = tf.getInstance();
	    List<User> friendList = null;
	    try {
	        friendList = twitter1.getFollowersList(usuario, -1);

	    } catch (IllegalStateException e) {
	        e.printStackTrace();
	    } catch (TwitterException e) {
	        e.printStackTrace();
	    }
	    return friendList;
	}

}
