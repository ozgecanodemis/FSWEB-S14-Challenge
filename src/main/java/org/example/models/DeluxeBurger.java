package org.example.models;

public class DeluxeBurger extends Hamburger {
    private String cips;
    private String drink;

    // Constructor
    public DeluxeBurger() {
        super("Deluxe", "Beef", 19.10, "White");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    // Getter for cips
    public String getCips() {
        return cips;
    }

    // Getter for drink
    public String getDrink() {
        return drink;
    }

    // Override methods to prevent adding additions
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }
}

