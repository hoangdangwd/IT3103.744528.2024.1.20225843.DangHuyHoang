package hust.soict.hedspi.aims.media;

import java.util.*;

public class CompactDisc extends Disc{

	private String artist;
	private ArrayList<Track> Tracks = new ArrayList<>();

	public CompactDisc(String title, String category,String director, int length,float cost, String artist) {
		super( title, category, director, length , cost);
		this.artist=artist;
		
	}
	public void play() {
        if (Tracks.isEmpty()) {
            System.out.println("No tracks to play on the Compact Disc: " + getTitle());
        } else {
            System.out.println("Playing Compact Disc: " + getTitle());
            for (Track track : Tracks) {
                track.play(); // Call play() on each Track
            }
        }
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void addTrack(Track Track) {
        if (!Tracks.contains(Track)) { 
        	Tracks.add(Track); 
            System.out.println(Track.getTitle() + " has been added.");
        } else {
            System.out.println(Track.getTitle()+ " is already in the Tracks list.");
        }
    }

    public void removeTrack(Track Track) {
        if (Tracks.contains(Track)) { 
        	Tracks.remove(Track); 
            System.out.println( Track.getTitle()+ " has been removed.");
        } else {
            System.out.println(Track.getTitle() + " is not in the Tracks list.");
        }
    }

    public Track getTracksAsString() {
        return Track.join(", ", Tracks);
    }


}
