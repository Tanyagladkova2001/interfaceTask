package figures;

import java.util.Objects;

public class Shape implements Box {
    @Override
    public void box() {
        System.out.println(EMPTY_BOX);
    }

    @Override
    public boolean add(Shape shape) {
        return false;
    }

    private double volume ;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Double.compare(shape.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String shape() {
        return null;
    }

}
