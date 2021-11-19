package figures;

public class Pyramid extends Shape {
    private static double s;
    private static double h;

    public String shape(){
        System.out.println("Pyramid:" + printInfo() + "" + printInfo1());
        super.shape();
        return null;
    }
    public String printInfo() {
        return "{" +
                "s =" + s +
                ',';
    }
    public String printInfo1() {
        return "" +
                "h =" + h +
                '}';}

    public Pyramid (double s, double h){
        Pyramid.s = s;
        Pyramid.h = h;
    }
}
