package hust.soict.hedspi.aims.store;

import java.util.*;

import hust.soict.hedspi.aims.media.Media;

public class Store {
  
	private ArrayList<Media> itemsInStore;

    public Store() {
        itemsInStore = new ArrayList<>();
    }

    public boolean checkMedia(Media media) {
        return itemsInStore.contains(media);
    }

    public void addMedia(Media media) {
        if (!checkMedia(media)) {
            itemsInStore.add(media);
            System.out.println(media.getTitle() + " has been added to the store.");
        } else {
            System.out.println(media.getTitle() + " already exists in the store.");
        }
    }

    public void removeMedia(Media media) {
        if (checkMedia(media)) {
            itemsInStore.remove(media);
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(media.getTitle() + " is not found in the store.");
        }
    }

    public String toString() {
        StringBuilder storeContents = new StringBuilder("-----------Store contents:-------------\n");
        for (Media media : itemsInStore) {
            storeContents.append(media.getTitle()).append("\n");
        }
        return storeContents.toString();
    }
}
