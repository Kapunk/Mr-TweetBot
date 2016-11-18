package twitter;

import twitter4j.Paging;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class twitter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void Tweet(String Mensaje) throws TwitterException{
	       Twitter twitter;
	        ConfigurationBuilder cb = new ConfigurationBuilder();
	        cb.setDebugEnabled(true)
	                .setOAuthConsumerKey("Consumer Key")
	                .setOAuthConsumerSecret("Consumer Secret")
	                .setOAuthAccessToken("Access Token")
	                .setOAuthAccessTokenSecret("Access Token Secret");
	        twitter = new TwitterFactory(cb.build()).getInstance();
	 
	 
	        Status tweetEnviado = twitter.updateStatus(Mensaje);      
	 
	    }

}
