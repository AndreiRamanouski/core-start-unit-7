package by.htp.ramanouski.task39;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return getName() + " " + super.brake();
    }

    @Override
    public String accelerate() {
        return getName() + " " + super.accelerate();
    }

    @Override
    public String startEngine() {
        return getName() + " " + super.startEngine();
    }
}
