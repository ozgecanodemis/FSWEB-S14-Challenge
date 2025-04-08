package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        this.price += price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        this.price += price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        this.price += price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        this.price += price;
    }

    public double itemizeHamburger() {
        System.out.println("Itemize: " + getName() + " burger on " + getBreadRollType() + " bread roll.");
        if (addition1Name != null) {
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }
        if (addition2Name != null) {
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }
        if (addition3Name != null) {
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }
        if (addition4Name != null) {
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }
        System.out.println("Total price: $" + price);
        return price;
    }
}

