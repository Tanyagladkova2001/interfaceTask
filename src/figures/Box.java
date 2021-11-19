package figures;

public class Box extends Shape {
    private double volume;

    public Box(double volume) {
        super(volume);
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public boolean add(Shape shape) {
        double value = getVolume();
        if (value < shape.getVolume()) {
            value -= getVolume();

                return true;
            }
        return false;
    }
}

