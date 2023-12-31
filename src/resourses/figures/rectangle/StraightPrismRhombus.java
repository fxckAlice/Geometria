package resourses.figures.rectangle;

import resourses.help.HelpingMethods;

public class StraightPrismRhombus extends Rhombus{
    public StraightPrismRhombus(double length,double heightP, double corner){
        this.length = length;
        this.heightP = heightP;
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
    public StraightPrismRhombus(){}
    protected double heightP, volume, diagonalV1, diagonalV2, diagonalSideLength;

    public void setHeightP(double heightP) {
        this.heightP = heightP;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDiagonalV1(double diagonalV1) {
        this.diagonalV1 = diagonalV1;
    }

    public void setDiagonalV2(double diagonalV2) {
        this.diagonalV2 = diagonalV2;
    }

    public void setDiagonalSideLength(double diagonalSideLength) {
        this.diagonalSideLength = diagonalSideLength;
    }
    public double volume(){
        volume = length * height1 * heightP;
        return volume;
    }
    public double diagonalSideLength(){
        diagonalSideLength = HelpingMethods.pythagoreanTheorem(length, heightP, "+");
        return diagonalSideLength;
    }
    @Override
    public double area(String parameter){
        switch (parameter) {
            case ("l"):
                area = 2 * ((height1 * length) + (heightP * length) * 2);
                break;
            case ("c"):
                area = 2 * ((Math.sin(corner / 180 * Math.PI) * Math.pow(length, 2)) + (heightP * length) * 2);
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return area;
    }
    public double diagonalV1(){
        diagonalV1 = HelpingMethods.pythagoreanTheorem(heightP, diagonal,"+");
        return diagonalV1;
    }
    public double diagonalV2(){
        diagonalV2 = HelpingMethods.pythagoreanTheorem(heightP, diagonal2, "+");
        return diagonalV2;
    }
    @Override
    public double inputRadius() {
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
    public double outRadius (){
        System.out.println("Doesn`t exist");
        return -1;
    }
    @Override
    public double sumOfCorners(){
        System.out.println("Error!");
        return -1;
    }
    public double heightP(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = (area / 2 - length * height1) / 2 / length;
                break;
            case ("dL"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideLength, length, "-");
                break;
            case("dV1"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalV1, diagonal, "-");
                break;
            case("dV2"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalV2, diagonal2, "-");
                break;
            case ("v"):
                answer = volume / (length * height1);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double length(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = area / 2 / (height1 + heightP * 2);
                break;
            case ("dL"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideLength, heightP, "-");
                break;
            case ("v"):
                answer = volume / heightP / height1;
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }

}
