package resources.figures.rectangle;

import resources.help.HelpingMethods;

public class Parallelepiped extends Rectangle{
    double heightP, volume, diagonalV, diagonalSideLength, diagonalSideWidth;
    public Parallelepiped(double length, double width, double heightP){
        this.length = length;
        this.width = width;
        this.heightP = heightP;
    }
    public Parallelepiped(){}

    public void setHeightP(double heightP) {
        this.heightP = heightP;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDiagonalV(double diagonalV) {
        this.diagonalV = diagonalV;
    }
    public void setDiagonalSide(double diagonalSideLength) {
        this.diagonalSideLength = diagonalSideLength;
    }

    public void setDiagonalSideWidth(double diagonalSideWidth) {
        this.diagonalSideWidth = diagonalSideWidth;
    }

    @Override
    public double getArea() {
        if (area > 0) return area;
        else if (length > 0){
            if (!(width > 0)) getWidth();
            if (!(heightP > 0)) getHeightP();
            return area();
        }
        else if (width > 0) {
            if(!(heightP > 0)) getHeightP();
            getLength();
            return area();
        }
        else if (!(heightP > 0)) {
            getLength();
            getWidth();
            return area();
        }
        else {
            getWidth();
            getLength();
            getHeightP();
            if (length > 0 && width > 0 && corner > 0) return area();
            else {
                System.out.println("Error! Missing values.");
                return -1;
            }
        }
    }

    protected double area(){
        if(length > 0 && width > 0 && heightP > 0){
            area = 2 * (length * width + width * heightP + heightP * length);
            return area;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getVolume(){
        if (volume > 0) return volume;
        else if (length > 0) {
            if (!(width > 0)) getWidth();
            if (!(heightP > 0)) getHeightP();
            return volume();
        }
        else if (width > 0) {
            getLength();
            if (!(heightP > 0)) getHeightP();
            return volume();
        }
        else if (heightP > 0) {
            getWidth();
            getLength();
            return volume();
        } else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double volume(){
        if (length > 0 && width > 0 && heightP > 0){
            volume = length * width * heightP;
            return volume;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getDiagonalV(){
        if (diagonalV > 0) return diagonalV;
        getHeightP();
        getDiagonal();
        if (heightP > 0 && diagonal > 0) return diagonalV("hP");
        getWidth();
        getDiagonalSideLength();
        if (width > 0 && diagonalSideLength > 0) return diagonalV("w");
        getLength();
        getDiagonalSideWidth();
        if (length > 0 && diagonalSideWidth > 0) return diagonalV("l");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double diagonalV(String parameter){
        switch (parameter){
            case ("hP"):
            if (heightP > 0 && diagonal > 0){
                diagonalV = HelpingMethods.pythagoreanTheorem(heightP, diagonal, "+");
                break;
            }
            else {
                System.out.println("Error! Missing values.");
                return -1;
            }
            case ("w"):
            if (width > 0 && diagonalSideLength > 0){
                diagonalV = HelpingMethods.pythagoreanTheorem(width, diagonalSideLength, "+");
                break;
            }
            else {
                System.out.println("Error! Missing values.");
                return -1;
            }
            case ("l"):
            if (length > 0 && diagonalSideWidth > 0){
                diagonalV = HelpingMethods.pythagoreanTheorem(length, diagonalSideWidth, "+");
                break;
            }
            else {
                System.out.println("Error! Missing values.");
                return -1;
            }
            default:
                System.out.println("Enter correct parameter.");
                heightP = -1;
                break;
        }
        return diagonalV;
    }
    public double getDiagonalSideLength(){
        if (diagonalSideLength > 0) return diagonalSideLength;
        else {
            if (!(length > 0)) {
                getLength();
                if (!(heightP > 0)) getHeightP();
            }
            if (!(diagonalV > 0)) {
                getDiagonalV();
                if (!(width > 0)) getWidth();
            }
            return diagonalSideLength();
        }
    }
    protected double diagonalSideLength(){
        if (heightP > 0 && length > 0) {
            diagonalSideLength = HelpingMethods.pythagoreanTheorem(heightP, length, "+");
            return diagonalSideLength;
        }
        else if (diagonalV > 0 && width > 0) {
            diagonalSideLength = HelpingMethods.pythagoreanTheorem(diagonalV, width, "-");
            return diagonalSideLength;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }public double getDiagonalSideWidth(){
        if (diagonalSideWidth > 0) return diagonalSideWidth;
        else {
            if (!(width > 0)) {
                getWidth();
                if (!(heightP > 0)) getHeightP();
            }
            if (!(diagonalV > 0)) {
                getDiagonalV();
                if (!(length > 0)) getLength();
            }
            return diagonalSideWidth();
        }
    }
    protected double diagonalSideWidth(){
        if (heightP > 0 && width > 0) {
            diagonalSideWidth = HelpingMethods.pythagoreanTheorem(heightP, width, "+");
            return diagonalSideWidth;
        }
        else if (diagonalV > 0 && length > 0) {
            diagonalSideWidth = HelpingMethods.pythagoreanTheorem(diagonalV, length, "-");
            return diagonalSideWidth;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    protected double inputRadius() {
        System.out.println("Doesn`t exist");
        return -1;
    }
    @Override
    public void setPerimeter(double perimeter) {
        System.out.println("Doesn`t exist");
    }
    @Override
    public void setInputRadius(double inputRadius) {
        System.out.println("Doesn`t exist");
    }
    @Override
    public void setOutRadius(double outRadius) {
        System.out.println("Doesn`t exist");
    }
    @Override
    protected double outRadius (){
        System.out.println("Doesn`t exist");
        return -1;
    }
    protected double sumOfCorners(){
        System.out.println("Error!");
        return -1;
    }
    public double getHeightP(){
        if (heightP > 0) return heightP;
        else if (area > 0 && length > 0 && width > 0) return heightP("a");
        else if (diagonalSideLength > 0 && length > 0) return heightP("dL");
        else if (diagonalSideWidth > 0 && width > 0) return heightP("dW");
        else if (diagonalV > 0 && diagonal > 0) return heightP("dV");
        else if (volume > 0 && length > 0 && width > 0) return heightP("v");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double heightP(String parameter){
        switch (parameter){
            case ("a"):
                heightP = (area / 2 - length * width) / (length + width);
                break;
            case ("dL"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalSideLength, length, "-");
                break;
            case ("dW"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalSideWidth, width, "-");
                break;
            case ("dV"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalV, diagonal, "-");
                break;
            case ("v"):
                heightP = volume / length / width;
                break;
            default:
                System.out.println("Enter correct parameter.");
                heightP = -1;
                break;
        }
        return heightP;
    }
    public double getLength(){
        if (length > 0) return length;
        else if (area > 0 && heightP > 0 && width > 0) return side("a");
        else if (diagonalSideLength > 0 && heightP > 0) return side("dL");
        else if (diagonal > 0 && width > 0) return side("d");
        else if (diagonalV > 0 && diagonalSideWidth > 0) return side("dV");
        else if (volume > 0 && heightP > 0 && width > 0) return side("v");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double side(String parameter){
        switch (parameter){
            case ("a"):
                length = (area / 2 - heightP * width) / (heightP + width);
                break;
            case ("dL"):
                length = HelpingMethods.pythagoreanTheorem(diagonalSideLength, heightP, "-");
                break;
            case ("d"):
                length = HelpingMethods.pythagoreanTheorem(diagonal, width, "-");
                break;
            case ("dV"):
                length = HelpingMethods.pythagoreanTheorem(diagonalV, diagonalSideWidth, "-");
                break;
            case ("v"):
                length = volume / heightP / width;
                break;
            default:
                System.out.println("Enter correct parameter.");
                length = -1;
                break;
        }
        return length;
    }
    public double getWidth(){
        if (width > 0) return width;
        else if (area > 0 && heightP > 0 && length > 0) return side("a");
        else if (diagonalSideWidth > 0 && heightP > 0) return side("dW");
        else if (diagonal > 0 && length > 0) return side("d");
        else if (diagonalV > 0 && diagonalSideLength > 0) return side("dV");
        else if (volume > 0 && heightP > 0 && length > 0) return side("v");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double sideW(String parameter){
        switch (parameter){
            case ("a"):
                width = (area / 2 - heightP * length) / (length + heightP);
                break;
            case ("dW"):
                width = HelpingMethods.pythagoreanTheorem(diagonalSideWidth, heightP, "-");
                break;
            case ("d"):
                width = HelpingMethods.pythagoreanTheorem(diagonal, length, "-");
                break;
            case ("dV"):
                width = HelpingMethods.pythagoreanTheorem(diagonalV, diagonalSideLength, "-");
                break;
            case ("v"):
                width = volume / length / heightP;
                break;
            default:
                System.out.println("Enter correct parameter.");
                width = -1;
                break;
        }
        return width;
    }

}
