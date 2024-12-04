package hust.soict.hedspi.aims.media;

public class Disc extends Media	 {
	private int length;
	private String director;

	
	public Disc(String title, String category, String director, int length, float cost) {
		
		super(title, category, cost);
        this.director = director;
        this.length = length;
        
    }
	public Disc(String title) {
		super( title);
	}
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	
    public void setDirector(String directorSet) {
        this.director = directorSet;
    }

    public void setLength(int lengthSet) {
        this.length = lengthSet;
    }

}
