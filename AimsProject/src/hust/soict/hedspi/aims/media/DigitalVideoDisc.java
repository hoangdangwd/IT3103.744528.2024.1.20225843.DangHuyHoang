package hust.soict.hedspi.aims.media;


public class DigitalVideoDisc extends Disc {
	private int length;
	private String director;

	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		
		super(title, category, cost);
        this.director = director;
        this.length = length;
        
    }
	
	public DigitalVideoDisc(String title) {
        super(title);
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

    public String toString() {
        return "DVD [ID=" + getId() + ", Title=" + getTitle() + ", Category=" + getCategory() + 
               ", Director=" + director + ", Length=" + length + " mins, Cost=" + getCost() + "$]";
    }
}
