package by.htp.ramanouski.task40;

public class Hamburger {
    private String name;
    private double price;
    private String meatType;
    private String breadRollType;

    private double finalPrice;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;


    public Hamburger(String name, double price, String meat, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meatType = meat;
        this.breadRollType = breadRollType;
    }

    void addition1(String addition1Name, double price) {
        this.addition1Name = addition1Name;
        this.addition1Price = price;
        System.out.println("Added " + addition1Name + " for an extra $" + addition1Price);
    }

    void addition2(String addition2Name, double price) {
        this.addition2Name = addition2Name;
        this.addition2Price = price;
        System.out.println("Added " + addition2Name + " for an extra $" + addition2Price);
    }

    void addition3(String addition3Name, double price) {
        this.addition3Name = addition3Name;
        this.addition3Price = price;
        System.out.println("Added " + addition3Name + " for an extra $" + addition3Price);
    }

    void addition4(String v, double price) {
        this.addition4Name = addition4Name;
        this.addition4Price = price;
        System.out.println("Added " + addition4Name + " for an extra $ " + addition4Price);
    }

    public double itemizeBurger() {
        System.out.println(this.name + " on a " + this.breadRollType + " with " +
                this.meatType + " for $" + price);
        if (addition1Name != null) {
            finalPrice = price + addition1Price;
        }
        if (addition2Name != null) {
            finalPrice = price + addition1Price + addition2Price;
        }
        if (addition3Name != null) {
            finalPrice = price + addition1Price + addition2Price + addition3Price;
        }
        if (addition4Name != null) {
            finalPrice = price + addition1Price + addition2Price + addition3Price + addition4Price;
        }
        return finalPrice;
    }

}
