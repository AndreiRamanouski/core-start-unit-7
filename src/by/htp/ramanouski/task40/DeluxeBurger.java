package by.htp.ramanouski.task40;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", 16.22, "some meat", "bread");
        super.addition1("Drink", 1.89);
        super.addition2("Chips", .99);
    }

    @Override
    void addition1(String extraTopping, double price) {
        super.addition1(extraTopping, price);
    }

    @Override
    void addition2(String extraTopping, double price) {
        super.addition2(extraTopping, price);
    }

    @Override
    void addition3(String extraTopping, double price) {
        System.out.println("Not added");
    }

    @Override
    void addition4(String extraTopping, double price) {
        System.out.println("Not added");
    }
}
