package by.htp.ramanouski.task37;

public class Bedroom {
    private String name;
    private Wall wallOne;
    private Wall wallTwo;
    private Wall wallFour;
    private Wall wallThree;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wallOne, Wall wallTwo,
                   Wall wallFour, Wall wallThree, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wallOne = wallOne;
        this.wallTwo = wallTwo;
        this.wallFour = wallFour;
        this.wallThree = wallThree;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed(){
        this.bed.make();
    }
}
