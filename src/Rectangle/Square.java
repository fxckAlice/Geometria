package Rectangle;

public class Square extends Rectangle {
    @Override
    public void setWidth(double width) {
        System.out.println("Error.");
    }
    @Override
    public double perimeter() {
        perimeter = 4 * length;
        return perimeter;
    }
    @Override
    public double area(){
        area = Math.pow(length,2);
        return area;
    }
    @Override
    public double diagonal(){
        diagonal = Math.sqrt(Math.pow(length, 2) * 2);
        return diagonal;
    }
    @Override
    public double inputRadius() {
        inputRadius = length / 2;
        return inputRadius;
    }
    @Override
    public double cornerDiagonalLength(){
        return 45;
    }
    @Override
    public double cornerDiagonalWidth(){
        System.out.println("Error");
        return -1;
    }
}
