import triangle.IsoscelesTriangle;
//import Rectangle.Rhombus;

public class Main {
    public static void main(String[] args) {
        IsoscelesTriangle ABCD = new IsoscelesTriangle();
        ABCD.setA(4);
        ABCD.setB(4);
        //ABCD.perimeter();
        //System.out.println(ABCD.round(ABCD.height(), -2));
        //System.out.println(ABCD.round(ABCD.heightB(), -2));
        System.out.println(ABCD.round(ABCD.side('o'), -2));
        System.out.println(ABCD.round(ABCD.perimeter(), -2));
        System.out.println(ABCD.round(ABCD.semiPerimeter(), -2));
        System.out.println(ABCD.round(ABCD.inputRadius(), -2));
        //Rectangle A = new Rectangle();
    }
}