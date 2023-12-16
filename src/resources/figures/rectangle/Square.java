package resources.figures.rectangle;

import resources.help.HelpingMethods;

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
    public double getPerimeter() {
        if (perimeter > 0) return perimeter;
        else if (length > 0){
            return perimeter();
        }
        else{
            getLength();
            return perimeter();
        }
    }
    @Override
    protected double perimeter() {
        if (length > 0){
            perimeter = 4 * length;
            return perimeter;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    public double getArea(){
        if (area > 0) return area;
        else if (length > 0){
            return area();
        }
        else{
            getLength();
            return area();
        }
    }
    @Override
    protected double area(){
        if (length > 0){
            area = Math.pow(length, 2);
            return area;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    public double getDiagonal(){
        if (diagonal > 0) return diagonal;
        else if (length > 0){
            return diagonal();
        }
        else{
            getLength();
            return diagonal();
        }
    }
    @Override
    protected double diagonal(){
        if (length > 0){
            diagonal = HelpingMethods.pythagoreanTheorem(length, "+");
            return diagonal;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    public double getOutRadius(){
        if (outRadius > 0) return outRadius;
        if (diagonal > 0) return outRadius();
        else if (length > 0){
            diagonal();
            return outRadius();
        }
        else{
            getLength();
            diagonal();
            return perimeter();
        }
    }
    @Override
    public double getInputRadius(){
        if (inputRadius > 0) return inputRadius;
        else if (length > 0){
            return inputRadius();
        }
        else{
            getLength();
            return inputRadius();
        }
    }
    @Override
    protected double inputRadius() {
        if (length > 0){
            inputRadius = length / 2;
            return inputRadius;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getWidth(){
        System.out.println("Error.");
        return -1;
    }
    public double getLength(){
        if(length > 0){
            return length;
        } else {
            if(area > 0) return side("a");
            else if (perimeter > 0) return side("p");
            else if (diagonal > 0) return side("d");
            else if (inputRadius > 0) return side("i");
            else if (outRadius > 0) return side("o");
            else {
                System.out.println("Error! Missing values.");
                return -1;
            }
        }
    }
    @Override
    protected double side(String parameter){
        switch (parameter){
            case ("a"):
                length = Math.sqrt(area);
                break;
            case ("p"):
                length = perimeter / 4;
                break;
            case ("d"):
                length = HelpingMethods.pythagoreanTheorem(diagonal, "-");
                break;
            case ("i"):
                length = 2 * inputRadius;
                break;
            case ("o"):
                length = HelpingMethods.pythagoreanTheorem(outRadius * 2, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return length;
    }
}
