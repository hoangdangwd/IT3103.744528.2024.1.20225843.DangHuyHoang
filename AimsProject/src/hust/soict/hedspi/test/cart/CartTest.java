package hust.soict.hedspi.test.cart;

import hust.soict.hedspi.aims.cart.Cart;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// Create a new cart
        Cart anOrder = new Cart();

        // Create new dvd objects and add them to cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
       

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "", 0, 18.99f);
     // Add DVDs to the cart
        anOrder.addDigitalVideoDisc(dvd1);
        anOrder.addDigitalVideoDisc(dvd2);
        anOrder.addDigitalVideoDisc(dvd3);
        

        // Print the cart
        anOrder.printCart();

        // Search by title
        anOrder.searchByTitle("Solomon");
        anOrder.searchByTitle("Frozen");

        // Search by ID
        anOrder.searchById(2);
        anOrder.searchById(10);

        // Remove a DVD
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.printCart();


	}

}
