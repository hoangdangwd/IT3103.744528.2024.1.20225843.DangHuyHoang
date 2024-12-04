package hust.soict.hedspi.aims;

import java.util.*;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Aims {
	public static void main(String[] args) {
	    List<Media> media = new ArrayList<Media>();

		   DigitalVideoDisc dvd1 = new DigitalVideoDisc( "Tranformers", "action", "Micheal Bay", 198, 39.99f);
		    DigitalVideoDisc dvd2 = new DigitalVideoDisc( "Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f);
		    DigitalVideoDisc dvd3 = new DigitalVideoDisc( "Inception", "Sci-Fi", "Christopher Nolan", 148, 19.99f);
	        Book book1 = new Book( "Effective Java", "Programming", 45.99f, new ArrayList<>());
	        Book book2 = new Book( "Effective Java", "Programming", 45.99f, new ArrayList<>());
	        CompactDisc cd1 = new CompactDisc("Greatest Hits", "Music","Godfather" ,134, 14.99f,"J-97");
	        CompactDisc cd2 = new CompactDisc("Don't stop me now", "Music","Mamaday" ,167, 22.99f,"hololive");
	        CompactDisc cd3 = new CompactDisc("Don't stop me now", "Music","Mamaday" ,167, 22.99f,"lolive");

		media.add(cd1);
		media.add(dvd2);
		media.add(book1);
       
		for(Media m: media) {
		    System.out.println(m.toString());
		}
	}

}
