package es.salesianos.edu.webpages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends WebPage{
	
	public HomePage() {
		BookmarkablePageLink link1 = new BookmarkablePageLink("linkDesayunoForm", DesayunoPage.class);

		
		add(link1);
	}

}
