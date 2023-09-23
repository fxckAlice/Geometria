package Rectangle;

import Rectangle.Rectangle;

public class Parallelogram extends Rectangle {
    protected double height;
    protected double diagonal2;

    public void setDiagonal2(double diagonal2){this.diagonal2 = diagonal2;}
    public void setCorner(double corner){
        if(corner <= 90){this.corner = corner;}
        else{
            System.out.println("Corner must be less than 90 degrees");
        }
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double area(char parameter){
        switch (parameter) {
            case ('h'):
                area = height * length;
                break;
            case ('c'):
                area = width * Math.sin(corner) * length;
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return area;
    }
    public double diagonal(){
        System.out.println("You can use diagonal1() or diagonal2");
        return -1;
    }
    public double diagonal1(){
        double temp = 2 * length * width * round(Math.cos((180 - corner) / 180 * Math.PI), -10);
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) - temp);
        return diagonal;
    }
    public double diagonal2(){
        double temp = 2 * length * width * round(Math.cos(corner / 180 * Math.PI), -10);
        diagonal2 = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) - temp);
        return diagonal2;
    }
    public double outRadius (){
        if(diagonal1() == diagonal2()){
            double temp = diagonal1();
            outRadius = temp / 2;
            return outRadius;
        }
        else{
            System.out.println("This parallelogram doesn't have out circle");
            return  -1;
        }
    }
    public double inputRadius(){
        if(length == width){
            inputRadius = area() / 2 * length;
            return inputRadius;
        }
        else{
            System.out.println("Error. The figure doesn't have input circle.");
            return -1;
        }
    }
    public double side( char parameter) {
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
                answer = Math.sqrt(Math.pow(outRadius * 2, 2) - Math.pow(length, 2));
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double cornerDiagonalLength(){
        return (Math.asin(height / diagonal) / Math.PI * 180);
    }
    public double cornerDiagonalWidth(){
        return Math.asin((area / width) / Math.PI * 180);
    }
}
