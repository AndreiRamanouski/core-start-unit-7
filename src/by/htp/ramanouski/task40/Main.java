package by.htp.ramanouski.task40;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", 3.56, "White", "Sausage");
        hamburger.addition1("Tomato", 0.27);
        hamburger.addition2("Lettuce", 0.75);
        hamburger.addition3("Cheese", 1.13);
        System.out.println("Total price is: " + hamburger.itemizeBurger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total price is : " + healthyBurger.itemizeBurger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addition3("Should not do this", 50.53);
        System.out.println("Total cost is: " + deluxeBurger.itemizeBurger());
    }
}
