import Triangle.EquilateralTriangle;
import Triangle.EquilateralTriangle;

public class Main {
    public static void main(String[] args) {
        EquilateralTriangle ABCD = new EquilateralTriangle();
        //ABCD.setWidth(30);
        //ABCD.setLength(36);
        //ABCD.setCorner(60);
        ABCD.setA(20);
        ABCD.setMedian(6);
       // System.out.println(ABCD.round(ABCD.area(), -2));
        System.out.println(ABCD.round(ABCD.side('h'), -2));


    }
}