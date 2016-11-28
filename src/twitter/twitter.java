package twitter;

import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.TweetEntity;
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
		
		 enviarTweet("hola");

	}
	/*
	 * Metodo para el envio de tweets
	 * 
	 */
	public static void enviarTweet(String Mensaje) throws TwitterException{
	       Twitter twitter;
	       
	       ConfigurationBuilder cb = credencial.credencial.credencialTwitter();
	       
	        twitter = new TwitterFactory(cb.build()).getInstance();
	 
	 
	        Status tweetEnviado = twitter.updateStatus(Mensaje);      
	 
	    }

}
