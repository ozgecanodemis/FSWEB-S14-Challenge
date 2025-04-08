package org.example;

import org.example.models.DeluxeBurger;
import org.example.models.Hamburger;
import org.example.models.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Hamburger
        Hamburger hamburger = new Hamburger("Basic", "Normal", 3.56, "Wrap");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Price: $" + hamburger.itemizeHamburger());

        // HealthyBurger
        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Price: $" + healthyBurger.itemizeHamburger());

        // DeluxeBurger
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53); // Should print warning
        System.out.println("Total Price: $" + db.itemizeHamburger());
    }
}
