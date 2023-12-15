package resourses.figures.triangle;

import resourses.help.HelpingMethods;

public class StraightPrismRightTriangle extends RightTriangle{
    protected double volume, areaSide, areaBase, heightP, diagonalSideA, diagonalSideB, diagonalSideC;
    public StraightPrismRightTriangle(double a, double b, double c, double heightP){
        this.a = a;
        this.b = b;
        this.c = c;
        this.heightP = heightP;
    }
    public StraightPrismRightTriangle(){}
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
            case ("с"):
                area = a * b / 2;
                break;
            case ("h"):
                area = heightC * c / 2;
                break;
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
                answer = areaBase / b * 2;
                break;
            case ("v"):
                answer = volume / heightP / b / 4;
                break;
            case ("dSA"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideA, heightP, "-");
                break;
            case ("t"):
                answer = HelpingMethods.pythagoreanTheorem(c, b,"-");
                break;
            case ("sin"):
                answer = HelpingMethods.round(c * Math.sin(cornerA / 180 * Math.PI), -8);
                break;
            case ("cos"):
                answer = HelpingMethods.round(c * Math.cos(cornerB / 180 * Math.PI), -8);
                break;
            case ("tan"):
                answer = HelpingMethods.round(b * Math.tan(cornerA / 180 * Math.PI), -8);
                break;
            case ("ctan"):
                answer = HelpingMethods.round(b / Math.tan(cornerB / 180 * Math.PI), -8);
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
                answer = areaBase / a * 2;
                break;
            case ("v"):
                answer = volume / heightP / a / 4;
                break;
            case ("dSB"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideB, heightP, "-");
                break;
            case ("t"):
                answer = HelpingMethods.pythagoreanTheorem(c, a,"-");
                break;
            case ("sinA"):
                answer = HelpingMethods.round(a / Math.sin(cornerA / 180 * Math.PI), -8);
                break;
            case ("cosA"):
                answer = HelpingMethods.round(b / Math.cos(cornerA / 180 * Math.PI), -8);
                break;
            case ("sinB"):
                answer = HelpingMethods.round(b / Math.sin(cornerB / 180 * Math.PI), -8);
                break;
            case ("cosB"):
                answer = HelpingMethods.round(a / Math.cos(cornerB / 180 * Math.PI), -8);
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
            case ("v"):
                answer = volume / heightP / heightC / 4;
                break;
            case ("dSC"):
                answer = HelpingMethods.pythagoreanTheorem(diagonalSideC, heightP, "-");
                break;
            case ("t"):
                answer = HelpingMethods.pythagoreanTheorem(b, a,"+");
                break;
            case ("m"):
                answer = 2 * medianC;
                break;
            case ("sinA"):
                answer = a / Math.sin(cornerA / 180 * Math.PI);
                break;
            case ("cosA"):
                answer = b / Math.cos(cornerA / 180 * Math.PI);
                break;
            case ("sinB"):
                answer = b / Math.sin(cornerB / 180 * Math.PI);
                break;
            case ("cosB"):
                answer = a / Math.cos(cornerB / 180 * Math.PI);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}
