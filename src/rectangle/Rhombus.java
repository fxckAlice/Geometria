package rectangle;

public class Rhombus extends Parallelogram {
    @Override
    public void setWidth(double width) {
        System.out.println("Error.");
    }
    @Override
    public void setHeight2(double height2) {
        System.out.println("Error.");
    }
    @Override
    public double perimeter() {
        perimeter = 4 * length;
        return perimeter;
    }
    @Override
    public double area(char parameter){
        switch (parameter) {
            case ('h'):
                area = height1 * length;
                break;
            case ('c'):
                area = Math.sin(corner / 180 * Math.PI) * Math.pow(length, 2);
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return area;
    }
    @Override
    public double diagonal1(){
        double temp = 2 * Math.pow(length, 2) * Math.cos((180 - corner) / 180 * Math.PI);
        diagonal = Math.sqrt(2 * Math.pow(length, 2) - temp);
        return diagonal;
    }
    @Override
    public double diagonal2(){
        double temp = 2 * Math.pow(length, 2) * Math.cos(corner / 180 * Math.PI);
        diagonal2 = Math.sqrt(2 * Math.pow(length, 2) - temp);
        return diagonal2;
    }
    @Override
    public double inputRadius() {
        inputRadius = area() / 2 * length;
        return inputRadius;
    }
    @Override
    public double side(char parameter) {
        double answer;
        switch (parameter) {
            case ('a'):
                answer = area / height1;
                break;
            case ('p'):
                answer = perimeter / 2 - length;
                break;
            case ('d'):
                answer = help.pythagoreanTheorem(diagonal, height1, '-');
                break;
            case ('i'):
                answer = area / (2 * inputRadius);
                break;
            case ('o'):
                answer = Math.sqrt(Math.pow(outRadius * 2, 2) / 2);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    @Override
    public double cornerDiagonalLength(){
        return corner / 2;
    }
    @Override
    public double cornerDiagonalWidth(){
        System.out.println("Please use cornerDiagonalLenght()");
        return -1;
    }
}
