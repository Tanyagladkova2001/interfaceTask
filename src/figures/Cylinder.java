package figures;

public class Cylinder extends SolidOfRevolution {
    public static double height = 3.0;

    public Cylinder(double height) {
        super(height);
    }
    @Override
    public double getVolume() {
        return Math.PI * SolidOfRevolution.radius *  SolidOfRevolution.radius * height;
    }

    @Override
    public String shape() {
        System.out.println("Cylinder:" + printInfo());
        super.shape();
        return null;
    }
    public String printInfo() {
        return "{" +
                "height=" + height +
                '}';}


}
