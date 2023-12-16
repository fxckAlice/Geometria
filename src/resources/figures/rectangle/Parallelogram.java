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

    public double area(String parameter){
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
    public double diagonal(){
        System.out.println("You can use diagonal1() or diagonal2");
        return -1;
    }
    public double diagonal1(){
        double temp = 2 * length * width * HelpingMethods.round(Math.cos((180 - corner) / 180 * Math.PI), -10);
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) - temp);
        return diagonal;
    }
    public double diagonal2(){
        double temp = 2 * length * width * HelpingMethods.round(Math.cos(corner / 180 * Math.PI), -10);
        diagonal2 = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) - temp);
        return diagonal2;
    }
    @Override
    public double outRadius (){
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
    public double inputRadius(){
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
    public double side(String parameter) {
        double answer;
        switch (parameter) {
            case ("a"):
                answer = area / height1;
                break;
            case ("p"):
                answer = perimeter / 2 - length;
                break;
            case ("d"):
                answer = HelpingMethods.pythagoreanTheorem(diagonal, height1, "-");
                break;
            case ("i"):
                answer = area / (2 * inputRadius);
                break;
            case ("o"):
                answer = HelpingMethods.pythagoreanTheorem(outRadius * 2, length, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
}
