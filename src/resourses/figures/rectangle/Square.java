package resourses.figures.rectangle;

import resourses.help.HelpingMethods;

public class Square extends Rectangle {
    public Square(double length){
        this.length = length;
    }
    public Square(){}
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
        diagonal = HelpingMethods.pythagoreanTheorem(length,"+");
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
    @Override
    public double side(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = Math.sqrt(area);
                break;
            case ("p"):
                answer = perimeter / 4;
                break;
            case ("d"):
                answer = HelpingMethods.pythagoreanTheorem(diagonal, "-");
                break;
            case ("i"):
                answer = 2 * inputRadius;
                break;
            case ("o"):
                answer = HelpingMethods.pythagoreanTheorem(outRadius * 2, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
}
