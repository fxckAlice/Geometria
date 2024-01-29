package resources.figures.rectangle;

import resources.help.HelpingMethods;

public class Rhombus extends Parallelogram {
    public Rhombus(double length, double corner){
        this.length = length;
        corner:{
            if (corner >= 180) {
                System.out.println("Error!");
                break corner;
            }
            if (corner <= 90) {
                this.corner = corner;
            } else {
                this.corner = 180 - corner;
            }
        }
    }
    public Rhombus(){}
    @Override
    public void setWidth(double width) {
        System.out.println("Error.");
    }
    @Override
    public void setHeight2(double height2) {
        System.out.println("Error.");
    }

    @Override
    public double getPerimeter() {
        if (perimeter > 0) return perimeter;
        else if (length > 0) return perimeter();
        else {
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
    public double getArea(){
        if (area > 0) return area;
        else if (length > 0){
            getCorner();
            if (corner > 0) return area("c");
            getHeight1();
            if (height1 > 0) return area("h");
            else {
                System.out.println("Error! Missing values.");
                return -1;
            }
        }
        else if (height1 > 0){
            getLength();
            return area("h");
        }
        else if (corner > 0){
            getLength();
            return area("c");
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    protected double area(String parameter){
        switch (parameter) {
            case ("h"):
                if (height1 > 0 && length > 0){
                    area = height1 * length;
                    break;
                }
                else {
                    System.out.println("Error! Missing values.");
                    return -1;
                }
            case ("c"):
                if (length > 0 && corner > 0){
                    area = Math.sin(corner / 180 * Math.PI) * Math.pow(length, 2);
                    break;
                }
                else {
                    System.out.println("Error! Missing values.");
                    return -1;
                }
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return area;
    }
    public double getHeight1(){
        if(height1 > 0){
            return height1;
        }
        else if (length > 0) {
            if (!(corner > 0)){
                getCorner();
            }
            return height1();
        }
        else if (corner > 0) {
            getLength();
            return height1();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double height1(){
        if (length > 0 && corner > 0){
            height1 = length * Math.cos(corner / 180 * Math.PI);
            return height1;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }

    @Override
    protected double diagonal1(){
        if (length > 0 && corner > 0){
            double temp = 2 * Math.pow(length, 2) * Math.cos((180 - corner) / 180 * Math.PI);
            diagonal = Math.sqrt(2 * Math.pow(length, 2) - temp);
            return diagonal;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    protected double diagonal2(){
        if (length > 0 && corner > 0){
            double temp = 2 * Math.pow(length, 2) * Math.cos(corner / 180 * Math.PI);
            diagonal2 = Math.sqrt(2 * Math.pow(length, 2) - temp);
            return diagonal2;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    protected double inputRadius() {
        if (length > 0){
            inputRadius = area() / (2 * length);
            if (inputRadius > 0) return inputRadius;
            else {
                System.out.println("Error! Missing values.");
                return -1;
            }
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getLength(){
        if (length > 0) return length;
        else if (area > 0 && height1 > 0) return side("a");
        else if (perimeter > 0) return side("p");
        else if (area > 0 && inputRadius > 0) return side("i");
        else if (outRadius > 0) return side("o");
        else if (diagonal > 0 && corner > 0) return side("d");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    protected double side(String parameter) {
        switch (parameter) {
            case ("a"):
                length = area / height1;
                break;
            case ("p"):
                length = perimeter / 4;
                break;
            case ("i"):
                length = area / (2 * inputRadius);
                break;
            case ("o"):
                length = HelpingMethods.pythagoreanTheorem(outRadius * 2, "-");
                break;
            case ("d"):
                length = HelpingMethods.quadraticEducation(2, -4 * Math.cos((180 - corner) / 180 * Math.PI), -1 * Math.pow(diagonal, 2));
                break;
            default:
                System.out.println("Enter correct parameter.");
                length = -1;
                break;
        }
        return length;
    }
    public double getCorner(){
        if(corner > 0){
            return corner;
        }
        else if (height1 > 0 && length > 0) return corner("h1");
        else if (diagonal > 0 && length > 0) return corner("d1");
        else if (diagonal2 > 0 && length > 0) return corner("d2");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double corner(String parameter){
        switch (parameter){
            case("h"):
                corner = Math.acos(height1 / length) / Math.PI * 180;
                break;
            case("d1"):
                corner = 180 - (Math.acos((-(Math.pow(diagonal, 2) - Math.pow(length, 2) - Math.pow(length, 2)) / (2 * length * length))) / Math.PI * 180);
                break;
            case("d2"):
                corner = Math.acos((-(Math.pow(diagonal2, 2) - Math.pow(length, 2) - Math.pow(length, 2)) / (2 * length * length))) / Math.PI * 180;
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return corner;
    }
}
