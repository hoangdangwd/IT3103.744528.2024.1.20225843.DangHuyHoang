package hust.soict.hedspi.aims.media;

import java.util.*;

public class Track {

	private int length;
	private String title;

	
	public void Disc(String title, int length) {
		
        this.title = title;
        this.length = length;
        
    }
	
	public int getLength() {
		return length;
	}
	public String getTitle() {
		return title;
	}
	
    public void setTitle(String titleSet) {
        this.title = titleSet;
    }

    public void setLength(int lengthSet) {
        this.length = lengthSet;
    }
    
    public static Track join(String string, ArrayList<Track> tracks) {
		return null;
	}

}
