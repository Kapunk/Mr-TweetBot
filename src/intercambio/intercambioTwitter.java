package intercambio;

import java.util.List;

import twitter.twitter;
import twitter4j.Status;
import twitter4j.TwitterException;

public class intercambioTwitter {

	/**
	 * Metodo para el envio de tweets
	 * @param Mensaje
	 * @throws TwitterException
	 */
	public static void enviarTweet(String Mensaje) throws TwitterException {
	       twitter.enviarTweet(Mensaje);
	 
	    }
	
	/**
	 * Metodo para leer los tweets de un usuario
	 * @param usuario
	 * @throws TwitterException 
	 */
	
	@SuppressWarnings({ "null", "rawtypes" })
	public static List leerTweetUsuario(String usuario) throws TwitterException {
		
		List<Status> statuses;	
		List<String> tweets = null;
		
		statuses = twitter.leerTweetUsuario(usuario);
		
      for (Status status : statuses) {
      System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
      tweets.add(status.getText());
      }

			
		return tweets;
       
    }

}
