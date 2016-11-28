package credencial;

import twitter4j.conf.ConfigurationBuilder;

public class credencial {

	
	public static ConfigurationBuilder credencialTwitter(){
		ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("")
	                .setOAuthConsumerSecret("")
	                .setOAuthAccessToken("")
	                .setOAuthAccessTokenSecret("");
        
        
		return cb;
		
		
	}

}
