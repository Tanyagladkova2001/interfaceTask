package figures;

public class Ball  extends SolidOfRevolution {
    public Ball() {
        super();

    }
    @Override
    public String shape() {
        System.out.println("Ball" );
        super.shape();
        return null;}

    public double getVolume() {
        return Math.PI * Math.pow(SolidOfRevolution.radius, 3) * 4 / 3;
    }
}
