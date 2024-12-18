package hust.soict.hedspi.aims.media;

import java.util.*;

import hust.soict.hedspi.aims.exception.PlayerException;

public class Track implements Playable{

	private float length;
	private String title;

	
	public Track(String title, float length) {
		
        this.title = title;
        this.length = length;
        
    }
	
	public void play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing track: " + title);
            System.out.println("Track length : " + length);
        } else {
            throw new PlayerException("ERROR: Track length is non-positive!");
        }
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
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Track other = (Track) obj;
        return this.title.equals(other.title) && this.length == other.length;
    }


}
