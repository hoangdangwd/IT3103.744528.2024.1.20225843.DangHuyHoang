package hust.soict.hedspi.aims.media;

import java.util.*;

public class Book extends Media{

			private List<String> authors = new ArrayList<String>();

			public Book(int id, String title, String category, float cost , List<String> authors ) {
				
				super(id, title, category, cost);
		        this.authors = authors;
				
			}
			
			public Book( String title, String category, float cost , List<String> authors ) {
				
				super( title, category, cost);
		        this.authors = authors;
				
			}

			public void addAuthor(String authorName) {
		        if (!authors.contains(authorName)) { 
		            authors.add(authorName);
		            System.out.println(authorName + " has been added.");
		        } else {
		            System.out.println(authorName + " is already in the authors list.");
		        }
		    }

		    public void removeAuthor(String authorName) {
		        if (authors.contains(authorName)) { 
		            authors.remove(authorName); 
		            System.out.println(authorName + " has been removed.");
		        } else {
		            System.out.println(authorName + " is not in the authors list.");
		        }
		    }

		  
		    public String getAuthorsAsString() {
		        return String.join(", ", authors);
		    }
		    
		

		}
		
