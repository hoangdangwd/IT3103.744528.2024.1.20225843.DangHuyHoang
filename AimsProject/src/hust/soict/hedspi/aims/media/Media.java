package hust.soict.hedspi.aims.media;


public abstract class Media {

	private int id;
	private String title;
	private String category;
	private float cost;
	private static int nbDigitalVideoDiscs = 0; 

	public Media(int id, String title, String category, float cost) {
		this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
	}
	
	public Media(String title) {
        this.title = title;
	}
	
	public Media(String title, String category, float cost) {
		this.title = title;
        this.category = category;
        this.cost = cost;
        	
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }
	public boolean isMatch(String title2) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Media other = (Media) obj;
	    return this.title.equals(other.title);
	}
	


}