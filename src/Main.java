import Rectangle.Parallelogram;
import Rectangle.Rhombus;

public class Main {
    public static void main(String[] args) {
        Parallelogram ABCD = new Rhombus();
        //ABCD.setWidth(30);
        ABCD.setLength(36);
        ABCD.setCorner(60);
        ABCD.setHeight(6);
        System.out.println(ABCD.round(ABCD.inputRadius(), -2));


    }
}