import help.HelpingMethods;
import triangle.StraightPrismEquilateralTriangle;
import circle.Cone;
import triangle.StraightPrismIsoscelesTriangle;
//import Rectangle.Rhombus;

public class Main {
    public static void main(String[] args) {
        StraightPrismIsoscelesTriangle a = new StraightPrismIsoscelesTriangle();
        HelpingMethods help = new HelpingMethods();

        a.setA(13);
        a.setB(10);
        a.setHeightP(10);
        System.out.println(a.height());
        System.out.println(a.areaBase("a"));
        System.out.println(a.areaSide());
        System.out.println(a.volume());
        System.out.println(a.side("v"));
        System.out.println(a.side("aS"));
        System.out.println(a.sideB("aB"));
    }
}