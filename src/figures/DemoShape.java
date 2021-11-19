package figures;

public class DemoShape {
    public static void main(String[] args) {
        Shape shape = new Shape(1.5);
        Pyramid pyramid = new Pyramid(2.0, 2.5);
        Cylinder cylinder = new Cylinder(3.0);
        Ball ball = new Ball();
        SolidOfRevolution solidOfRevolution = new SolidOfRevolution(1.7);
        Box box = new Box(2);

        shape.shape();
        pyramid.shape();
        cylinder.shape();
        solidOfRevolution.shape();
        ball.shape();

        System.out.println();
        System.out.printf("\nVolume of Ball is %s",ball.getVolume());
        System.out.printf("\nVolume of Cylinder is %s",cylinder.getVolume());
        System.out.printf("\nVolume of Pyramid is %s",pyramid.getVolume());

        System.out.println();
        System.out.printf("\nBall %s", box.add(ball));
        System.out.printf("\nCylinder %s", box.add(cylinder));
        System.out.printf("\nPyramid %s", box.add(pyramid)); 




            }


}
