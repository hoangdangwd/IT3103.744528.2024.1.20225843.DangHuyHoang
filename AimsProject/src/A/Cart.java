package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
	private static final int MAX_NUMBERS_ORDER = 20;
    private DigitalVideoDisc[] itemOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDER];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDER) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full!");
        }
    }
 
    public void addDigitalVideoDisc(DigitalVideoDisc... dvds) {
    	for (DigitalVideoDisc disc : dvds) {
            if (qtyOrdered < MAX_NUMBERS_ORDER) {
                itemOrdered[qtyOrdered] = disc;
                qtyOrdered++;
                System.out.println("The disc has been added: " + disc.getTitle());
            } else {
                System.out.println("The cart is full! Cannot add: " + disc.getTitle());
                break;
            }
    	}
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered + 2 <= MAX_NUMBERS_ORDER) {
            itemOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            itemOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println("The discs have been added: " + dvd1.getTitle() + ", " + dvd2.getTitle());
        } else {
            System.out.println("The cart does not have enough space to add both discs.");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i] == disc) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemOrdered[j] = itemOrdered[j + 1];
                }
                itemOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc is not found in the cart.");
    }

    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("Cart contents:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemOrdered[i].getTitle() + " - " + itemOrdered[i].getCost() + "$");
        }
    }

    public void sortByTitle(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + itemOrdered[i].getTitle());
                return;
            }
        }
        System.out.println("No disc with title: " + title);
    }

    public void sortByID(int id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].getId() == id) {
                System.out.println("Found: " + itemOrdered[i].getTitle());
                return;
            }
        }
        System.out.println("No disc with ID: " + id);
    }

public void printCart() {
    System.out.println("***********************CART***********************");
    System.out.println("Ordered Items:");
    float totalCost = 0;
    for (int i = 0; i < qtyOrdered; i++) {
        System.out.println((i + 1) + ". " + itemOrdered[i].toString());
        totalCost += itemOrdered[i].getCost();
    }
    System.out.println("Total cost: " + totalCost + " $");
    System.out.println("***************************************************");
}

}