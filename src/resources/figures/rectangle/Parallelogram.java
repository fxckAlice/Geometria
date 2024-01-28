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
    public double getArea(){
        if (area > 0) return area;
        else if (length > 0){
            if (height1 > 0) return area("l");
            else{ if (!(width > 0)) {
                getWidth();
            }
            if(!(corner > 0)){
                getCorner();
            }
            return area("c");}
        }
        else if (width > 0) {
            if (height2 > 0) return area("w");
            else{
                getLength();
                return area("c");
            }
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double area(String parameter){
        switch (parameter) {
            case ("l"):
                if (height1 > 0 && length > 0){
                    area = height1 * length;
                    break;
                }
                else {
                    System.out.println("Error! Missing values.");
                    return -1;
                }
            case ("w"):
                if (height2 > 0 && width > 0){
                    area = height2 * width;
                    break;
                }
                else {
                    System.out.println("Error! Missing values.");
                    return -1;
                }
            case ("c"):
                if (length > 0 && width > 0 && corner > 0){
                    area = width * Math.sin(corner / 180 * Math.PI) * length;
                    break;
                }
                else {
                    System.out.println("Error! Missing values.");
                    return -1;
                }
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
    public double getDiagonal1(){
        if(diagonal > 0) return diagonal;
        else if (length > 0) {
            if (!(width > 0)){
                getWidth();
            }
            if (!(corner > 0)){
                getCorner();
            }
            return diagonal();
        }
        else if (width > 0) {
            getLength();
            if (!(corner > 0)){
                getCorner();
            }
            return diagonal();
        }
        else if (corner > 0) {
            getLength();
            getWidth();
            return diagonal();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double diagonal1(){
        if (length > 0 && width > 0 && corner > 0){
            double temp = 2 * length * width * HelpingMethods.round(Math.cos((180 - corner) / 180 * Math.PI), -8);
            diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) - temp);
            return diagonal;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getDiagonal2(){
        if(diagonal2 > 0) return diagonal2;
        else if (length > 0) {
            if (!(width > 0)){
                getWidth();
            }
            if (!(corner > 0)){
                getCorner();
            }
            return diagonal2();
        }
        else if (width > 0) {
            getLength();
            if (!(corner > 0)){
                getCorner();
            }
            return diagonal2();
        }
        else if (corner > 0) {
            getLength();
            getWidth();
            return diagonal2();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double diagonal2(){
        if (length > 0 && width > 0 && corner > 0){
            double temp = 2 * length * width * HelpingMethods.round(Math.cos(corner / 180 * Math.PI), -8);
            diagonal2 = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2) - temp);
            return diagonal2;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getHeight1(){
        if(height1 > 0){
            return height1;
        }
        else if (width > 0) {
            if (!(corner > 0)){
                getCorner();
            }
            return height1();
        }
        else if (corner > 0) {
            getWidth();
            return height1();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double height1(){
        if (width > 0 && corner > 0){
            return width * Math.cos(corner / 180 * Math.PI);
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getHeight2(){
        if(height2 > 0){
            return height2;
        }
        else if (length > 0) {
            if (!(corner > 0)){
                getCorner();
            }
            return height2();
        }
        else if (corner > 0) {
            getLength();
            return height2();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double height2(){
        if (length > 0 && corner > 0){
            return length * Math.cos(corner / 180 * Math.PI);
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    protected double outRadius(){
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
    public double getWidth(){
        if(width > 0){
            return width;
        } else if (length > 0) {
            if(area > 0 && height2 > 0) return sideW("a");
            else if (perimeter > 0) return sideW("p");
            else if (diagonal > 0 && corner > 0) return sideW("d1");
            else if (diagonal2 > 0 && corner > 0) return sideW("d2");
            else if (height1 > 0 && corner > 0) return sideW("h");
            else if (inputRadius > 0 && area > 0) return sideW("i");
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
    @Override
    protected double sideW(String parameter) {
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
            case ("h"):
                width = height1 / Math.cos(corner / 180 * Math.PI);
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
    public double getLength(){
        if(length > 0){
            return length;
        } else if (width > 0) {
            if(area > 0 && height1 > 0) return side("a");
            else if (perimeter > 0) return side("p");
            else if (diagonal > 0 && corner > 0) return side("d1");
            else if (diagonal2 > 0 && corner > 0) return side("d1");
            else if (inputRadius > 0 && area > 0) return side("i");
            else if (height2 > 0 && corner > 0) return side("h");
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
    @Override
    protected double side(String parameter) {
        switch (parameter) {
            case ("a"):
                length = area / height1;
                break;
            case ("p"):
                length = perimeter / 2 - width;
                break;
            case ("d1"):
                length = HelpingMethods.quadraticEducation(1,-(2 * width * HelpingMethods.round(Math.cos((180 - corner) / 180 * Math.PI), -8)), Math.pow(width, 2) - Math.pow(diagonal, 2));
                break;
            case ("d2"):
                length = HelpingMethods.quadraticEducation(1,-(2 * width * HelpingMethods.round(Math.cos(corner / 180 * Math.PI), -8)), Math.pow(width, 2) - Math.pow(diagonal2, 2));
                break;
            case ("h"):
                length = height2 / Math.cos(corner / 180 * Math.PI);
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
    public double getCorner(){
        if(corner > 0){
            return corner;
        }
        else if (height1 > 0 && width > 0) return corner("h1");
        else if (height2 > 0 && length > 0) return corner("h2");
        else if (diagonal > 0 && width > 0 && length > 0) return corner("d1");
        else if (diagonal2 > 0 && width > 0 && length > 0) return corner("d2");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double corner(String parameter){
        switch (parameter){
            case("h1"):
                corner = Math.acos(height1 / width) / Math.PI * 180;
                break;
            case("h2"):
                corner = Math.acos(height2 / length) / Math.PI * 180;
                break;
            case("d1"):
                corner = 180 - (Math.acos((-(Math.pow(diagonal, 2) - Math.pow(length, 2) - Math.pow(width, 2)) / (2 * length * width))) / Math.PI * 180);
                break;
            case("d2"):
                corner = Math.acos((-(Math.pow(diagonal2, 2) - Math.pow(length, 2) - Math.pow(width, 2)) / (2 * length * width))) / Math.PI * 180;
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return corner;
    }
}
