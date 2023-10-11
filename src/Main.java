import circle.Circle;
import help.HelpingMethods;
import triangle.StraightPrismEquilateralTriangle;
import circle.Cone;
import triangle.StraightPrismIsoscelesTriangle;
//import Rectangle.Rhombus;

public class Main {
    public static void main(String[] args) {
        Cone a = new Cone();

        a.setRadius(5);
        a.setHeightP(12);
        a.diameter();
        a.slantHeight();
        a.areaSide();
        a.areaBase();
        a.area();
        //System.out.println(a.heightP("a"));
        System.out.println(a.radius("aB"));
    }
}