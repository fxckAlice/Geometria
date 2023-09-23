public class Square extends Rectangle{
    @Override
    public void setWidth(double width) {
        System.out.println("Error.");
    }
    public double perimeter() {
        perimeter = 4 * length;
        return perimeter;
    }
    public double area(){
        area = Math.pow(length,2);
        return area;
    }
    public double diagonal(){
        //diagonal = leight * Math.sqrt(2);
        diagonal = Math.sqrt(Math.pow(length, 2) * 2);
        return diagonal;
    }
    public double inputRadius() {
        inputRadius = length / 2;
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
