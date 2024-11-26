package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {

		public static void main(String[] args) {
	        // Create a Store instance
	        Store store = new Store();

	        // Create some DigitalVideoDisc instances
	        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Jungle", "Adventure", "John Doe", 120, 15.99f);
	        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Cinderella", "Animation", "Jane Smith", 90, 12.99f);
	        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Avengers", "Action", "Joe Russo", 180, 19.99f);

	        // Test adding DVDs to the store
	        System.out.println("Adding DVDs to the store...");
	        store.addDVD(dvd1);
	        store.addDVD(dvd2);
	        store.addDVD(dvd3);

	        // Attempt to add a duplicate DVD
	        System.out.println("\nAttempting to add a duplicate DVD...");
	        store.addDVD(dvd1);

	        // Display the DVDs in the store
	        System.out.println("\nStore contents after adding DVDs:");
	        System.out.println(store);

	        // Test removing a DVD from the store
	        System.out.println("Removing DVD 'Cinderella' from the store...");
	        store.removeDVD(dvd2);

	        // Display the DVDs in the store after removal
	        System.out.println("\nStore contents after removing 'Cinderella':");
	        System.out.println(store);

	        // Attempt to remove a DVD not in the store
	        System.out.println("Attempting to remove a DVD not in the store...");
	        DigitalVideoDisc nonExistentDVD = new DigitalVideoDisc("Frozen", "Animation", "Chris Buck", 90, 13.99f);
	        store.removeDVD(nonExistentDVD);

	        // Display the final store contents
	        System.out.println("\nFinal store contents:");
	        System.out.println(store);
	    }
	}

