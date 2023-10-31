package week10;

import java.text.DecimalFormat;

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

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double calculateTotalPrice() {
        double totalPrice = price;
        if (addition1Name != null) {
            totalPrice += addition1Price;
        }
        if (addition2Name != null) {
            totalPrice += addition2Price;
        }
        if (addition3Name != null) {
            totalPrice += addition3Price;
        }
        if (addition4Name != null) {
            totalPrice += addition4Price;
        }
        return totalPrice;
    }

    public String itemizeHamburger() {
        DecimalFormat df = new DecimalFormat("#.00");
        StringBuilder itemizedHamburger = new StringBuilder();
        itemizedHamburger.append(name)
                .append(" hamburger on a ")
                .append(breadRollType)
                .append(" roll with ")
                .append(meat)
                .append(", price is ")
                .append(df.format(price));
        if (addition1Name != null) {
            itemizedHamburger.append("\nAdded ")
                    .append(addition1Name)
                    .append(" for an extra ")
                    .append(df.format(addition1Price));
        }
        if (addition2Name != null) {
            itemizedHamburger.append("\nAdded ")
                    .append(addition2Name)
                    .append(" for an extra ")
                    .append(df.format(addition2Price));
        }
        if (addition3Name != null) {
            itemizedHamburger.append("\nAdded ")
                    .append(addition3Name)
                    .append(" for an extra ")
                    .append(df.format(addition3Price));
        }
        if (addition4Name != null) {
            itemizedHamburger.append("\nAdded ")
                    .append(addition4Name)
                    .append(" for an extra ")
                    .append(df.format(addition4Price));
        }
        itemizedHamburger.append("\nTotal Burger price is ")
                .append(df.format(calculateTotalPrice()));
        return itemizedHamburger.toString();
    }


}


