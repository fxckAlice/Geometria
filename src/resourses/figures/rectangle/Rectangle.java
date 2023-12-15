package resourses.figures.rectangle;

import resourses.help.HelpingMethods;

public class Rectangle {
    protected double length, width, perimeter, area, diagonal, outRadius, inputRadius, corner;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(){}
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setInputRadius(double inputRadius) {
        this.inputRadius = inputRadius;
    }

    public void setOutRadius(double outRadius) {
        this.outRadius = outRadius;
    }
    public double getPerimeter(){
        if (perimeter != 0){
            return perimeter;
        }
        else if(length != 0 && width != 0){
            return perimeter();
        }
        else if (length != 0 && diagonal != 0) {
            width = HelpingMethods.pythagoreanTheorem(diagonal, length, "-");
            return perimeter();
        }
        else if (width != 0 && diagonal != 0) {
            length = HelpingMethods.pythagoreanTheorem(diagonal, width, "-");
            return perimeter();
        }
        else if (length != 0 && area != 0) {
            width = area / length;
            return perimeter();
        }
        else if (width != 0 && area != 0) {
            length = area / width;
            return perimeter();
        }
        else if (length != 0 && outRadius != 0){
            diagonal = outRadius * 2;
            width = HelpingMethods.pythagoreanTheorem(diagonal, length, "-");
            return perimeter();
        }
        else if (width != 0 && outRadius != 0) {
            diagonal = outRadius * 2;
            length = HelpingMethods.pythagoreanTheorem(diagonal, width, "-");
            return perimeter();
        }
        else{
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double perimeter(){
        if(length != 0 && width != 0){
            perimeter = 2 * length + 2 * width;
            return perimeter;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double area(){
        area = length * width;
        return area;
    }
    public double diagonal(){
        diagonal = HelpingMethods.pythagoreanTheorem(length, width, "+");
        return diagonal;
    }
    public double outRadius (){
        outRadius = diagonal / 2;
        return outRadius;
    }
    public double inputRadius(){
        if(length == width){
            inputRadius = length / 2;
            return inputRadius;
        }
        else{
            System.out.println("Error. The figure doesn't have input Resourses.Resourses.triangle.circle.");
            return -1;
        }
    }
    public double side(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = area / length;
                break;
            case ("p"):
                answer = perimeter / 2 - length;
                break;
            case ("d"):
                answer = HelpingMethods.pythagoreanTheorem(diagonal, length, "-");
                break;
            case ("i"):
                answer = 2 * inputRadius;
                break;
            case ("o"):
                answer = HelpingMethods.round(HelpingMethods.pythagoreanTheorem(outRadius * 2, "-"), -7);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double corner(){
        corner = 90;
        return corner;
    }
    public double sumOfCorners(){
        return 360;
    }
    public double cornerDiagonalLength(){
        return HelpingMethods.round(Math.acos(length / diagonal) / Math.PI * 180, -7);
    }
    public double cornerDiagonalWidth(){
        return HelpingMethods.round(Math.asin(length / diagonal) / Math.PI * 180, -7);
    }

}
