package hust.soict.hedspi.aims.media;


public class DigitalVideoDisc extends Disc {
	private int length;
	private String director;

	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super( title, category, director, length , cost);   
	}
	
	public DigitalVideoDisc(String title) {
        super(title);
    }
	
	
	public void play() {	
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength() + " minutes");
    }
	
    public String toString() {
        return "DVD [ID=" + getId() + ", Title=" + getTitle() + ", Category=" + getCategory() + 
               ", Director=" + director + ", Length=" + length + " mins, Cost=" + getCost() + "$]";
    }
}
