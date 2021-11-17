package figures;

public class Shape {
    private double volume = 1.5;

    @Override
    public String toString() {
        return "Ball{" +
                "ball=" + volume +
                "} " + super.toString();
    }

    public Shape(double volume) {
        this.volume = volume;
    }

    public Shape() {
    }

    public double getRadius(double radius) {
        return radius;
    }

    public double getVolume(double volume) {
        return volume;
    }
    public String shape() {
        return null;
    }
}
