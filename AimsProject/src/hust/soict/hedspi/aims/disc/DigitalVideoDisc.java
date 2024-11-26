package hust.soict.hedspi.aims.disc;


public class DigitalVideoDisc {
	private String title;
	private int length;
	private String director;
	private String category;
	private float cost;
	private int id;
	
	public static int nbDigitalVideoDiscs = 0;
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
	public DigitalVideoDisc(String title) {
        this.title = title;
    }
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public int getId() {
		return id;
	}
	
	public void setTitle(String titleSet) {
        this.title = titleSet;
    }

    public void setDirector(String directorSet) {
        this.director = directorSet;
    }

    public void setCategory(String categorySet) {
        this.category = categorySet;
    }

    public void setLength(int lengthSet) {
        this.length = lengthSet;
    }

    public void setCost(float costSet) {
        this.cost = costSet;
    }
    public void setid(int idSet) {
        this.id = idSet;
    }
    public String toString() {
        return "DVD [ID=" + id + ", Title=" + title + ", Category=" + category + ", Director=" + director +
               ", Length=" + length + " mins, Cost=" + cost + "$]";
    }
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
	}
}
