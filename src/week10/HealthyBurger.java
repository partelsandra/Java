package week10;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public String itemizeHamburger() {
        String itemizedHamburger = super.itemizeHamburger();
        if (healthyExtra1Name != null) {
            itemizedHamburger += "\nAdded " + healthyExtra1Name + " for an extra " + healthyExtra1Price;
        }
        if (healthyExtra2Name != null) {
            itemizedHamburger += "\nAdded " + healthyExtra2Name + " for an extra " + healthyExtra2Price;
        }
        return itemizedHamburger;
    }
}


