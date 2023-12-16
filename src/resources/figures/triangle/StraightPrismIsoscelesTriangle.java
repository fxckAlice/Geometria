package resources.figures.triangle;

import resources.help.HelpingMethods;

public class StraightPrismIsoscelesTriangle extends IsoscelesTriangle{
    protected double heightP, areaBase, areaSide, volume, diagonalSideA, diagonalSideB;
    public StraightPrismIsoscelesTriangle(double a, double b, double heightP){
        this.a = a;
        this.b = b;
        this.heightP = heightP;
    }
    public StraightPrismIsoscelesTriangle(){}
    @Override
    public void setPerimeter(double perimeter) {
        System.out.println("Doesn`t exist!");
    }
    @Override
    public void setOutRadius(double outRadius) {
        System.out.println("Doesn`t exist!");
    }
    @Override
    public void setInputRadius(double inputRadius) {
        System.out.println("Doesn`t exist!");
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setHeightP(double heightP) {
        this.heightP = heightP;
    }
    public void setDiagonalSideA(double diagonalSideA) {
        this.diagonalSideA = diagonalSideA;
    }

    public void setDiagonalSideB(double diagonalSideB) {
        this.diagonalSideB = diagonalSideB;
    }
    public double volume(){
        volume = areaBase * heightP;
        return volume;
    }

    public double areaBase(String parameter){
        switch (parameter){
            case ("a"):
                areaBase = height * b / 2;
                break;
            case ("b"):
                areaBase = heightB * a / 2;
                break;
            default:
                System.out.println("Enter correct parameter.");
                areaBase = -1;
        }
        return areaBase;
    }
    public double areaSide()  {
        areaSide = a * heightP * 2 + b * heightP;
        return areaSide;
    }
    @Override
    public double area(String parameter){
        area = areaBase * 2 + areaSide;
        return area;
    }
    @Override
    public double perimeter(){
        System.out.println("Doesn`t exist!");
        return -1;
    }
    @Override
    public double outRadius(){
        System.out.println("Doesn`t exist!");
        return -1;
    }
    @Override
    public double inputRadius(){
        System.out.println("Doesn`t exist!");
        return -1;
    }
    public double diagonalSideA(){
        diagonalSideA = HelpingMethods.pythagoreanTheorem(a, heightP, "+");
        return diagonalSideA;
    }
    public double diagonalSideB(){
        diagonalSideB = HelpingMethods.pythagoreanTheorem(b, heightP, "+");
        return diagonalSideB;
    }
    public double heightP(String parameter){
        double answer;
        switch (parameter){
            case ("v"):
                answer = volume / areaBase;
                break;
            case ("aS"):
                answer = areaSide / (a * 2 + b);
                break;
            case ("dSA"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideA, a, "-");
                break;
            case ("dSB"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideB, b, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double side(String parameter){
        double answer;
        switch (parameter){
            case ("v"):
                answer = HelpingMethods.pythagoreanTheorem(2 * volume / heightP / b, b / 2, "+");
                break;
            case ("aB"):
                answer = HelpingMethods.pythagoreanTheorem(2 * areaBase / b, b / 2, "+");
                break;
            case ("aS"):
                answer = areaSide / heightP - a * 2;
                break;
            case ("dSB"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideA, heightP, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double sideB(String parameter){
        double answer;
        switch (parameter){
            case ("v"):
                answer = HelpingMethods.pythagoreanTheorem(2 * volume / heightP / b, b / 2, "+");
                break;
            case ("aB"):
                answer = areaBase / heightP * 2;
                break;
            case ("aS"):
                answer = (areaSide / heightP - b) / 2;
                break;
            case ("dSB"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideB, heightP, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }

}
