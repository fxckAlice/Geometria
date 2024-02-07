//import Rectangle.Rhombus;

import resources.figures.rectangle.Cube;
import resources.figures.rectangle.Parallelogram;
import resources.figures.rectangle.Rhombus;

public class Main {
    public static void main(String[] args) {
        Parallelogram a = new Parallelogram(4, 5, 20);
        System.out.println(a.getHeight1());
        a.setCorner(0);
        System.out.println(a.getCorner());
    }
}