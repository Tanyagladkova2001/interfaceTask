package figures;

public class Cylinder extends SolidOfRevolution {
    private double height;

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


    public Cylinder(double height) {
        super(height);
    }
}
