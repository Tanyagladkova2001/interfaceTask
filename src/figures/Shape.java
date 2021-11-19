package figures;

import java.util.Objects;

public  class Shape {

    private double volume ;

    public Shape(double volume) {
        this.volume = volume;
    }
    public double getVolume() {
        return volume ;
    }

    public Shape() {
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

    public String shape() {
        return null;
    }

}
