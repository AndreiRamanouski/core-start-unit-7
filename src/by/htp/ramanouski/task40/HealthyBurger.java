package by.htp.ramanouski.task40;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", price, meat, "Rye");

    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + healthyExtra1Name + " for an extra $" + healthyExtra1Price);
    }

    public void addHealthyExtra2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + healthyExtra2Name + " for an extra $" + healthyExtra2Price);
    }

    @Override
    public double itemizeBurger() {
        double healthyBurgerPrice = super.itemizeBurger();
        if (this.healthyExtra1Name != null) {
            healthyBurgerPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            healthyBurgerPrice = healthyBurgerPrice + this.healthyExtra1Price + this.healthyExtra2Price;
        }
        return healthyBurgerPrice;
    }
}
