import Rectangle.Parallelogram;
import Rectangle.Rectangle;
import Rectangle.Rhombus;

public class Main {
    public static void main(String[] args) {
        Rectangle A = new Rectangle();
        System.out.println(A.round(Math.cos((double) 60 / 180 * Math.PI) * 10, -8));
    }
}