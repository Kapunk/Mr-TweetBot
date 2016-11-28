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
		
		 

	}
	/*
	 * Metodo para el envio de tweets
	 * 
	 */
	public static void enviarTweet(String Mensaje) throws TwitterException{
	       Twitter twitter;
	        ConfigurationBuilder cb = new ConfigurationBuilder();
	        cb.setDebugEnabled(true)
	                .setOAuthConsumerKey("LQiWgVFWFyCRr19HAFshJ2GYY")
	                .setOAuthConsumerSecret("fS727mXfGz1sTguxH9Dz5QD6AOngwfwymvudYILGgJiMSYtOIo")
	                .setOAuthAccessToken("799569404061188096-s8Xef5aeJeEVGtfMWZmfcMB8Tvx1oJT")
	                .setOAuthAccessTokenSecret("XFEMPkPYHlhng1sE34dQQpkRL5tPJ7NpyoOvNW3ql36ML");
	        twitter = new TwitterFactory(cb.build()).getInstance();
	 
	 
	        Status tweetEnviado = twitter.updateStatus(Mensaje);      
	 
	    }

}
