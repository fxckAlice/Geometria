package resources.figures.triangle;

import resources.help.HelpingMethods;

public class StraightPrismTriangle extends Triangle{
    protected double volume, areaSide, areaBase, heightP, diagonalSideA, diagonalSideB, diagonalSideC;
    public StraightPrismTriangle(double a, double b, double c, double heightP){
        this.a = a;
        this.b = b;
        this.c = c;
        this.heightP = heightP;
    }
    public StraightPrismTriangle(){}
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void setAreaSide(double areaSide) {
        this.areaSide = areaSide;
    }
    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
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

    public void setDiagonalSideC(double diagonalSideC) {
        this.diagonalSideC = diagonalSideC;
    }
    @Override
    public void setOutRadius(double outRadius) {
        System.out.println("Doesn`t exist!");
    }
    @Override
    public void setInputRadius(double inputRadius) {
        System.out.println("Doesn`t exist!");
    }
    public double areaBase(String parameter) {
        switch (parameter){
            case ("b"):
                areaBase = heightB * b / 2;
                break;
            case ("a"):
                areaBase = height * a / 2;
                break;
            case ("c"):
                areaBase = heightC * c / 2;
                break;
            case ("p"):
                semiPerimeter();
                areaBase = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return areaBase;
    }
    public double areaSide(){
        areaSide = heightP * (a + b + c);
        return areaSide;
    }
    @Override
    public double area(){
        area = areaBase * 2 + areaSide;
        return area;
    }
    public double volume(){
        volume = areaBase * heightP;
        return volume;
    }
    public double diagonalSideA(){
        diagonalSideA = HelpingMethods.pythagoreanTheorem(heightP, a, "+");
        return diagonalSideA;
    }
    public double diagonalSideB(){
        diagonalSideB = HelpingMethods.pythagoreanTheorem(heightP, b, "+");
        return diagonalSideB;
    }
    public double diagonalSideC(){
        diagonalSideC = HelpingMethods.pythagoreanTheorem(heightP, c, "+");
        return diagonalSideC;
    }
    @Override
    public double outRadius(){
        System.out.println("Doesn`t exist!");
        return -1;
    }
    @Override
    public double inputRadius() {
        System.out.println("Doesn`t exist!");
        return -1;
    }

    public double heightP(String parameter){
        switch (parameter){
            case ("aS"):
                heightP = areaSide / (a + b + c);
                break;
            case ("a"):
                heightP = (area - 2 * areaBase) / (a + b + c);
                break;
            case ("v"):
                heightP = volume / areaBase;
                break;
            case ("dSA"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalSideA, a, "-");
                break;
            case ("dSB"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalSideB, b, "-");
                break;
            case ("dSC"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalSideC, c, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                heightP = -1;
        }
        return heightP;
    }
    public double side(String parameter){
        double answer;
        switch (parameter){
            case ("aBH"):
                answer = areaBase / height * 2;
                break;
            case ("p"):
                answer = perimeter - b - c;
                break;
            case ("v"):
                answer = volume / heightP / height / 4;
                break;
            case ("dSA"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideA, heightP, "-");
                break;
            case "t":
                double temp = 2 * b * c * Math.cos(cornerA / 180 * Math.PI);
                answer = HelpingMethods.round(Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - temp), -8);
                break;
            case "m":
                answer = HelpingMethods.round(Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(median * 2, 2)), -7);
                break;
            case ("h"):
                answer = HelpingMethods.pythagoreanTheorem(b, height,"-") + HelpingMethods.pythagoreanTheorem(c, height, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double sideB(String parameter){
        double answer;
        switch (parameter){
            case ("aBH"):
                answer = areaBase / heightB * 2;
                break;
            case ("p"):
                answer = perimeter - a - c;
                break;
            case ("v"):
                answer = volume / heightP / heightB / 4;
                break;
            case ("dSA"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideB, heightP, "-");
                break;
            case "t":
                double temp = 2 * a * c * Math.cos(cornerB / 180 * Math.PI);
                answer = HelpingMethods.round(Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2) - temp), -8);
                break;
            case "m":
                answer = HelpingMethods.round(Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(medianB * 2, 2)), -7);
                break;
            case ("h"):
                answer = HelpingMethods.pythagoreanTheorem(a, heightB,"-") + HelpingMethods.pythagoreanTheorem(c, heightB, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double sideC(String parameter){
        double answer;
        switch (parameter){
            case ("aBH"):
                answer = areaBase / heightC * 2;
                break;
            case ("p"):
                answer = perimeter - b - a;
                break;
            case ("v"):
                answer = volume / heightP / heightC / 4;
                break;
            case ("dSA"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideC, heightP, "-");
                break;
            case "t":
                double temp = 2 * b * a * Math.cos(cornerC / 180 * Math.PI);
                answer = HelpingMethods.round(Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2) - temp), -8);
                break;
            case "m":
                answer = HelpingMethods.round(Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(a, 2)) - Math.pow(medianC * 2, 2)), -7);
                break;
            case ("h"):
                answer = HelpingMethods.pythagoreanTheorem(b, heightC,"-") + HelpingMethods.pythagoreanTheorem(a, heightC, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}
