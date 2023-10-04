import help.HelpingMethods;
import triangle.StraightPrismEquilateralTriangle;
import circle.Cone;
//import Rectangle.Rhombus;

public class Main {
    public static void main(String[] args) {
        Cone a = new Cone();
        HelpingMethods help = new HelpingMethods();
        a.setRadius(5);
        a.setHeight(5);
        System.out.println(a.slantHeight());
        a.areaBase();
        a.areaSide();
        System.out.println(a.area());
        System.out.println(a.radius("a"));
    }
}