package hust.soict.hedspi.aims.media;

import java.util.*;

public class Track implements Playable{

	private float length;
	private String title;

	
	public Track(String title, float length) {
		
        this.title = title;
        this.length = length;
        
    }
	
	public void play() {
        System.out.println("Playing track: " + this.title);
        System.out.println("Track length: " + this.length + " minutes");
    }
	
	public float getLength() {
		return length;
	}
	public String getTitle() {
		return title;
	}
	
    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(float length) {
        this.length = length;
    }
    
    public static Track join(String string, ArrayList<Track> tracks) {
		return null;
	}

}
