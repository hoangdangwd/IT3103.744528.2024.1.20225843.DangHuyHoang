package hust.soict.hedspi.aims.store;

import java.util.LinkedList;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Store {
  
    private LinkedList<DigitalVideoDisc> itemsInStore;

    public Store() {
        itemsInStore = new LinkedList<>();
    }

    private boolean checkDVD(DigitalVideoDisc disc) {
        return itemsInStore.contains(disc);
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (checkDVD(disc)) {
            itemsInStore.remove(disc);
            System.out.println("DVD removed from the store.");
        } else {
            System.out.println("DVD not found in the store.");
        }
    }

    public void addDVD(DigitalVideoDisc disc) {
        if (!checkDVD(disc)) {
            itemsInStore.add(disc);
            System.out.println("DVD added to the store.");
        } else {
            System.out.println("DVD already exists in the store.");
        }
    }

    public void approveOrder(DigitalVideoDisc disc) {
        System.out.println("Order approved for: " + disc.getTitle());
    }

    public void rejectOrder(DigitalVideoDisc disc) {
        System.out.println("Order rejected for: " + disc.getTitle());
    }

    @Override
    public String toString() {
        StringBuilder storeContents = new StringBuilder("Store contents:\n");
        for (DigitalVideoDisc disc : itemsInStore) {
            storeContents.append(disc.getTitle()).append("\n");
        }
        return storeContents.toString();
    }
}
