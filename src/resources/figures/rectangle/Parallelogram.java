package resources.figures.rectangle;

import resources.help.HelpingMethods;

public class Parallelogram extends Rectangle {
    protected double height1, height2;
    protected double diagonal2;
    public Parallelogram(double length, double width, double corner){
        this.length = length;
        this.width = width;
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
    public Parallelogram(){}
    public void setDiagonal2(double diagonal2){this.diagonal2 = diagonal2;}
    public void setCorner(double corner){
        if(corner >= 180){
            System.out.println("Error!");
            return;
        }
        if(corner <= 90){this.corner = corner;}
        else{
            this.corner = 180 - corner;
        }
    }
    public void setHeight1(double height1) {
        this.height1 = height1;
    }

    public void setHeight2(double height2) {
        this.height2 = height2;
    }

    protected double area(String parameter){
        switch (parameter) {
            case ("l"):
                area = height1 * length;
                break;
            case ("w"):
                area = height2 * width;
                break;
            case ("c"):
                area = width * Math.sin(corner / 180 * Math.PI) * length;
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return area;
    }
    @Override
    protected double diagonal(){
        System.out.println("You can use diagonal1() or diagonal2");
        return -1;
    }
    public double diagonal1(){
        double temp = 2 * length * width * HelpingMethods.round(Math.cos((180 - corner) / 180 * Math.PI), -8);
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) - temp);
        return diagonal;
    }
    public double diagonal2(){
        double temp = 2 * length * width * HelpingMethods.round(Math.cos(corner / 180 * Math.PI), -8);
        diagonal2 = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) - temp);
        return diagonal2;
    }
    protected double height1(){
        return width * Math.sin(corner / 180 * Math.PI);
    }
    protected double height2(){
        return length * Math.sin(corner / 180 * Math.PI);
    }
    @Override
    protected double outRadius (){
        if(diagonal1() == diagonal2()){
            double temp = diagonal1();
            outRadius = temp / 2;
            return outRadius;
        }
        else{
            System.out.println("This parallelogram doesn't have out Resourses.Resourses.triangle.circle");
            return  -1;
        }
    }
    @Override
    protected double inputRadius(){
        if(length == width){
            inputRadius = area() / 2 * length;
            return inputRadius;
        }
        else{
            System.out.println("Error. The figure doesn't have input Resourses.Resourses.triangle.circle.");
            return -1;
        }
    }
    @Override
    public double sideW(String parameter) {
        switch (parameter) {
            case ("a"):
                width = area / height2;
                break;
            case ("p"):
                width = perimeter / 2 - length;
                break;
            case ("d1"):
                width = HelpingMethods.quadraticEducation(1,-(2 * length * HelpingMethods.round(Math.cos((180 - corner) / 180 * Math.PI), -8)), Math.pow(length, 2) - Math.pow(diagonal, 2));
                break;
            case ("d2"):
                width = HelpingMethods.quadraticEducation(1,-(2 * length * HelpingMethods.round(Math.cos(corner / 180 * Math.PI), -8)), Math.pow(length, 2) - Math.pow(diagonal2, 2));
                break;
            case ("i"):
                width = area / (2 * inputRadius);
                break;
            case ("o"):
                width = HelpingMethods.pythagoreanTheorem(outRadius * 2, length, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                return  -1;
        }
        return width;
    }
    @Override
    protected double side(String parameter) {
        switch (parameter) {
            case ("a"):
                length = area / height2;
                break;
            case ("p"):
                length = perimeter / 2 - width;
                break;
            case ("d"):
                length = HelpingMethods.pythagoreanTheorem(diagonal, height2, "-");
                break;
            case ("i"):
                length = area / (2 * inputRadius);
                break;
            case ("o"):
                length = HelpingMethods.pythagoreanTheorem(outRadius * 2, width, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return length;
    }
}
