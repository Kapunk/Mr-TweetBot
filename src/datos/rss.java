package datos;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class rss {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeerRss("http://www.20minutos.es/rss/");
		}

public static void LeerRss(String url) {
// TODO Auto-generated constructor stub

URL feedSource;
try {
feedSource = new URL(url);
SyndFeedInput input = new SyndFeedInput();
SyndFeed feed = input.build(new XmlReader(feedSource));
List listEntries =feed.getEntries();
Iterator it= listEntries.iterator();
while(it.hasNext()){
SyndEntry entrada = (SyndEntry)it.next();
String title=(entrada.getTitle() );
String author=(entrada.getAuthor());
Date date=(entrada.getPublishedDate());
String date2= ((date!=null)?date.toString():null);
System.out.println("Titulo= "+title +" | Autor= "+author+" fecha= "+date2);
}

} catch (MalformedURLException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IllegalArgumentException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (FeedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}