import circle.Circle;
import help.HelpingMethods;
import rectangle.Rectangle;
import triangle.*;
import circle.Cone;
//import Rectangle.Rhombus;

public class Main {
    public static void main(String[] args) {
        IsoscelesTriangle a = new IsoscelesTriangle();
        a.setA(12);
        a.setB(12);
        a.setCornerSide(60);
        System.out.println(a.height());
        EquilateralTriangle b = new EquilateralTriangle();
        b.setA(12);
        b.height();
        System.out.println(a.height() == b.height());
    }
}