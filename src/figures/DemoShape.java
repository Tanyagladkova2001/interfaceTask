package figures;

public class DemoShape {
    public static void main(String[] args) {
        Shape shape = new Shape(1.5);
        Pyramid pyramid = new Pyramid(2.0, 2.5);
        Cylinder cylinder = new Cylinder(3.0);
        Ball ball = new Ball();
        SolidOfRevolution solidOfRevolution = new SolidOfRevolution(1.7);

        shape.shape();
        pyramid.shape();
        cylinder.shape();
        solidOfRevolution.shape();
        ball.shape();

        System.out.println();
        System.out.println("What's in this box?");
        Box boxWithSomethingInIt = new Shape() ;
        boxWithSomethingInIt.box();


            }


}
