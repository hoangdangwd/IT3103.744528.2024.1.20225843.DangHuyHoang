package A;

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
}
