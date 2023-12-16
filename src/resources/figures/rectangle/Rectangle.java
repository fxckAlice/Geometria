package resources.figures.rectangle;

import resources.help.HelpingMethods;

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
    public double getPerimeter() {
        if (perimeter > 0) return perimeter;
        else if (length > 0){
            if (width > 0) return perimeter();
            else {
                getWidth();
                return perimeter();
            }
        }
        else if (width > 0) {
            getLength();
            return perimeter();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double perimeter(){
        if(length > 0 && width > 0){
            perimeter = 2 * length + 2 * width;
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
            if (width > 0) return area();
            else {
                getWidth();
                return area();
            }
        }
        else if (width > 0) {
            getLength();
            return area();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double area(){
        if (length > 0 && width > 0){
            area = length * width;
            return area;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getDiagonal(){
        if (diagonal > 0) return diagonal;
        else if (length > 0){
            if (width > 0) return diagonal();
            else {
                getWidth();
                return diagonal();
            }
        }
        else if (width > 0) {
            getLength();
            return diagonal();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double diagonal(){
        if (length > 0 && width > 0){
            diagonal = HelpingMethods.pythagoreanTheorem(length, width, "+");
            return diagonal;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getOutRadius(){
        if (outRadius > 0) return outRadius;
        if (diagonal > 0) return outRadius();
        else if (length > 0){
            if (width > 0) {
                diagonal();
                return outRadius();
            }
            else {
                getWidth();
                diagonal();
                return perimeter();
            }
        }
        else if (width > 0) {
            getLength();
            diagonal();
            return perimeter();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double outRadius (){
        if (diagonal > 0){
            outRadius = diagonal / 2;
            return outRadius;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getInputRadius(){
        if (inputRadius > 0) return inputRadius;
        else if (length > 0){
            if (width > 0) return inputRadius();
            else {
                getWidth();
                return inputRadius();
            }
        }
        else if (width > 0) {
            getLength();
            return inputRadius();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double inputRadius(){
        if (length > 0 && width > 0){
            if (length == width) {
                inputRadius = length / 2;
                return inputRadius;
            } else {
                System.out.println("Error. The figure doesn't have input radius.");
                return -1;
            }
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getWidth(){
        if(width > 0){
            return width;
        } else if (length > 0) {
            if(area > 0) return sideW("a");
            else if (perimeter > 0) return sideW("p");
            else if (diagonal > 0) return sideW("d");
            else if (inputRadius > 0) return sideW("i");
            else if (outRadius > 0) return sideW("o");
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
    protected double sideW(String parameter){
        switch (parameter){
            case ("a"):
                width = area / length;
                break;
            case ("p"):
                width = perimeter / 2 - length;
                break;
            case ("d"):
                width = HelpingMethods.pythagoreanTheorem(diagonal, length, "-");
                break;
            case ("i"):
                width = 2 * inputRadius;
                break;
            case ("o"):
                width = HelpingMethods.pythagoreanTheorem(outRadius * 2, length, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return width;
    }
    public double getLength(){
        if(length > 0){
            return length;
        } else if (width > 0) {
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
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double side(String parameter){
        switch (parameter){
            case ("a"):
                length = area / width;
                break;
            case ("p"):
                length = perimeter / 2 - width;
                break;
            case ("d"):
                length = HelpingMethods.pythagoreanTheorem(diagonal, width, "-");
                break;
            case ("i"):
                length = 2 * inputRadius;
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
    public double getCorner(){
        corner = 90;
        return corner;
    }
    public double getSumOfCorners(){
        return 360;
    }

}
