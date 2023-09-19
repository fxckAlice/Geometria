public class Square extends Figure{
    @Override
    public void setWidth(double width) {
        System.out.println("Error.");
    }
    public double perimeter() {
        perimeter = 4 * leight;
        return perimeter;
    }
    public double area(){
        area = Math.pow(leight,2);
        return area;
    }
    public double diagonal(){
        diagonal = Math.sqrt(Math.pow(leight, 2) * 2);
        return diagonal;
    }
    public double inputRadius() {
        inputRadius = leight / 2;
        return inputRadius;
    }
    public double cornerDiagonalLeight(){
        return 45;
    }
    public double cornerDiagonalWidth(){
        System.out.println("Error");
        return -1;
    }
}
