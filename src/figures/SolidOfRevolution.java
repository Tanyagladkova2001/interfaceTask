package figures;

public class SolidOfRevolution extends Shape {
    public static double radius;
    public SolidOfRevolution (double radius){
        SolidOfRevolution.radius = radius;}

    public SolidOfRevolution() {
        System.out.println("Solid of revolution:" + printInfo1());
    }
    public double getRadius() {
        return radius;
    }
    public String printInfo1() {
        return "{" +
                "radius=" + radius +
                '}';}
}

