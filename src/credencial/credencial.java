package credencial;

import twitter4j.conf.ConfigurationBuilder;

public class credencial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ConfigurationBuilder credencialTwitter(){
		ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("LQiWgVFWFyCRr19HAFshJ2GYY")
	                .setOAuthConsumerSecret("fS727mXfGz1sTguxH9Dz5QD6AOngwfwymvudYILGgJiMSYtOIo")
	                .setOAuthAccessToken("799569404061188096-s8Xef5aeJeEVGtfMWZmfcMB8Tvx1oJT")
	                .setOAuthAccessTokenSecret("XFEMPkPYHlhng1sE34dQQpkRL5tPJ7NpyoOvNW3ql36ML");
        
		return cb;
		
		
	}

}
