package rectangle;

import help.HelpingMethods;

public class StraightPrismParallelogram extends Parallelogram{
    protected double heightP,volume, diagonalV1, diagonalV2, diagonalSideLength, diagonalSideWidth;
    public StraightPrismParallelogram(double length, double width, double heightP, double corner){
        this.length = length;
        this.width = width;
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
    public StraightPrismParallelogram(){}
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

    public void setDiagonalSideWidth(double diagonalSideWidth) {
        this.diagonalSideWidth = diagonalSideWidth;
    }
    public double volume(char parameter){
        if(parameter == 'l')volume = length * height1 * heightP;
        else if (parameter == 'w') {
            volume = width * height2 * heightP;
        }
        return volume;
    }
    @Override
    public double area(String parameter){
        switch (parameter) {
            case ("l"):
                area = (height1 * length) * 2 + (heightP * length) * 2 + (heightP * width) * 2;
                break;
            case ("w"):
                area = (height2 * width) * 2 + (heightP * length) * 2 + (heightP * width) * 2;
                break;
            case ("c"):
                area = (width * Math.sin(corner / 180 * Math.PI) * length) * 2 + (heightP * length) * 2 + (heightP * width) * 2;
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return area;
    }
    public double diagonalV1(){
        diagonalV1 = HelpingMethods.pythagoreanTheorem(heightP, diagonal, "+");
        return diagonalV1;
    }
    public double diagonalV2(){
        diagonalV2 = HelpingMethods.pythagoreanTheorem(heightP, diagonal2, "+");
        return diagonalV2;
    }
    public double diagonalSideLength(){
        diagonalSideLength = HelpingMethods.pythagoreanTheorem(length, heightP, "+");
        return diagonalSideLength;
    }
    public double diagonalSideWidth(){
        diagonalSideWidth = HelpingMethods.pythagoreanTheorem(width, heightP, "+");
        return diagonalSideWidth;
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
                answer = (area / 2 - length * height1) / (length + width);
                break;
            case ("dL"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideLength, length, "-");
                break;
            case ("dW"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideWidth, width,"-");
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
                answer = (area / 2 - height2 * width) - heightP * width / (heightP);
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
    public double width(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = (area / 2 - height1 * length - heightP * length) / (heightP);
                break;
            case ("dW"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideWidth, heightP, "-");
                break;
            case ("v"):
                answer = volume / height2 / heightP;
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
}
