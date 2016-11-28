package twitter;

import java.util.List;

import credencial.credencial;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class twitter {

	/**
	 * @param args
	 * @throws TwitterException 
	 */
	public static void main(String[] args) throws TwitterException {
		// TODO Auto-generated method stub
		
		 leerTweetUsuario("");

	}
	
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
	 */
	
	public static void leerTweetUsuario(String usuario) {

        Twitter twitter = new TwitterFactory().getInstance();
        try {
            ConfigurationBuilder cb = credencial.credencialTwitter();

            TwitterFactory tf = new TwitterFactory(cb.build());
            Twitter twitter1 = tf.getInstance();
            List<Status> statuses;
            statuses = twitter1.getUserTimeline(usuario);
            
            System.out.println("Mostrando los tweets de @" + usuario);
            for (Status status : statuses) {
                System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
            }
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to get timeline: " + te.getMessage());
            System.exit(-1);
        }
    }

}
