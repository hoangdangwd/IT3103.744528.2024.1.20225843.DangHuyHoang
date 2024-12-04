package hust.soict.hedspi.aims.cart;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;

public class Cart {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public void addMedia(Media media) {
        if (media != null) {
            itemsOrdered.add(media);
            System.out.println("Added: " + media.getTitle());
        } else {
            System.out.println("Cannot add a null item.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
            System.out.println("Removed: " + media.getTitle());
        } else {
            System.out.println("Item not found: " + (media != null ? media.getTitle() : "null"));
        }
    }
    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
    public void printCart() {
        System.out.println("*********************** CART ***********************");
        System.out.println("Ordered Items:");
        float totalCost = 0;
        int index = 1;
        for (Media media : itemsOrdered) {
            System.out.println(index++ + ". " + media.getTitle());
            totalCost += media.getCost();
        }
        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }
    public void searchByTitle(String title) {
        boolean found = false;
        System.out.println("Search results for title: \"" + title + "\"");
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println(media.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with title: \"" + title + "\".");
        }
    }
    public void searchById(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found: " + media.getTitle());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No media found with ID: " + id);
        }
}
    public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
}