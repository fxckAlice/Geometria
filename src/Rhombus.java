public class Rhombus extends Parallelogram{
    @Override
    public void setWidth(double width) {
        System.out.println("Error.");
    }
    public double perimeter() {
        perimeter = 4 * length;
        return perimeter;
    }
    public double area(char parameter){
        switch (parameter) {
            case ('h'):
                area = height * length;
                break;
            case ('c'):
                area = Math.sin(corner) * Math.pow(length, 2);
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return area;
    }
    public double diagonal1(){
        double temp = 2 * Math.pow(length, 2) * Math.cos(180 - corner);
        diagonal = Math.sqrt(2 * Math.pow(length, 2) - temp);
        return diagonal;
    }
    public double diagonal2(){
        double temp = 2 * Math.pow(length, 2) * Math.cos(corner);
        diagonal2 = Math.sqrt(2 * Math.pow(length, 2) - temp);
        return diagonal2;
    }
    public double inputRadius() {
        inputRadius = area() / 2 * length;
        return inputRadius;
    }
    public double side(char parameter) {
        double answer;
        switch (parameter) {
            case ('a'):
                answer = area / height;
                break;
            case ('p'):
                answer = perimeter / 2 - length;
                break;
            case ('d'):
                answer = Math.sqrt(Math.pow(diagonal, 2) - Math.pow(height, 2));
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
    public double cornerDiagonalLength(){
        return corner / 2;
    }
    public double cornerDiagonalWidth(){
        System.out.println("Please use cornerDiagonalLeight()");
        return -1;
    }
}