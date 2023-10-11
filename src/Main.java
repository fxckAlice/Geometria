import circle.Circle;
import help.HelpingMethods;
import triangle.StraightPrismEquilateralTriangle;
import circle.Cone;
import triangle.StraightPrismIsoscelesTriangle;
//import Rectangle.Rhombus;

public class Main {
    public static void main(String[] args) {
        Circle a = new Circle();

        a.setRadius(5);
        System.out.println(a.area());
        System.out.println(a.length());
    }
}