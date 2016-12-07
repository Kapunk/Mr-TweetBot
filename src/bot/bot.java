package bot;

import java.util.List;

import twitter.twitter;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.User;

public class bot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			List<User> amigos = twitter.obtenerListaAmigos("Chistian95");
			if(amigos.size() > 0) {
				int rnd = (int) (Math.random() * amigos.size());
				User amigoRandom = amigos.get(rnd);
				System.out.println("Follower escogido: " + amigoRandom.getScreenName());	
				
				Status maxRT = null;
				List<Status> tweets = twitter.leerTweetUsuario(amigoRandom.getScreenName());
				for(int i=0; i<tweets.size(); i++) {
					Status tweet = tweets.get(i);
					if(maxRT == null || (!tweet.isRetweet() && tweet.getRetweetCount() > maxRT.getRetweetCount())) {
						maxRT = tweet;
					}
				}
				
				System.out.println("Tweet con más RT (" + maxRT.getRetweetCount() + "): " + maxRT.getText());
			}				
		} catch (TwitterException e) {
			e.printStackTrace();
		} 
	}

}
