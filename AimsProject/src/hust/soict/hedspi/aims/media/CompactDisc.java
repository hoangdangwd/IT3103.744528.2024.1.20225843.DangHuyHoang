package hust.soict.hedspi.aims.media;

import java.util.*;

import hust.soict.hedspi.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private ArrayList<Track> Tracks = new ArrayList<>();

	public CompactDisc(String title, String category,String director, int length,float cost, String artist) {
		super( title, category, director, length , cost);
		this.artist=artist;
		
	}
	
	@Override
	public void play() throws PlayerException {
        if(this.getLength() > 0) {
            System.out.println("Playing CD: " + this.getTitle());
            System.out.println("CD artist: " + artist);
            System.out.println("CD length: " + this.getLength());
            for (Track track: Tracks) {
                track.play();
            }
            Iterator<Track> iter = Tracks.iterator();
            Track nextTrack;
            while(iter.hasNext()) {
                nextTrack = (Track) iter.next();
                nextTrack.play();
            }
        } else {
            throw new PlayerException("ERROR: CD length is non-positive!");
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
