package triangle;

public class StraightPrismRightTriangle extends RightTriangle{
    protected double volume, areaSide, areaBase, heightP, diagonalSideA, diagonalSideB, diagonalSideC;
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
    public double areaBase(char parameter) {
        switch (parameter){
            case ('с'):
                area = a * b / 2;
                break;
            case ('h'):
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
        diagonalSideA = help.pythagoreanTheorem(heightP, a, '+');
        return diagonalSideA;
    }
    public double diagonalSideB(){
        diagonalSideB = help.pythagoreanTheorem(heightP, b, '+');
        return diagonalSideB;
    }
    public double diagonalSideC(){
        diagonalSideC = help.pythagoreanTheorem(heightP, c, '+');
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
    @Override
    public double side(char parameter){
        System.out.println("Use String parameter!");
        return -1;
    }
    @Override
    public double sideB(char parameter) {
        System.out.println("Use String parameter!");
        return -1;
    }
    @Override
    public double sideC(char parameter) {
        System.out.println("Use String parameter!");
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
                heightP = help.pythagoreanTheorem(diagonalSideA, a, '-');
                break;
            case ("dSB"):
                heightP = help.pythagoreanTheorem(diagonalSideB, b, '-');
                break;
            case ("dSC"):
                heightP = help.pythagoreanTheorem(diagonalSideC, c, '-');
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
                answer = help.pythagoreanTheorem(diagonalSideA, heightP, '-');
                break;
            case ("t"):
                answer = help.pythagoreanTheorem(c, b,'-');
                break;
            case ("sin"):
                answer = c * Math.sin(cornerA / 180 * Math.PI);
                break;
            case ("cos"):
                answer = c * Math.cos(cornerB / 180 * Math.PI);
                break;
            case ("tan"):
                answer = b * Math.tan(cornerA / 180 * Math.PI);
                break;
            case ("ctan"):
                answer = b / Math.tan(cornerB / 180 * Math.PI);
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
                answer = help.pythagoreanTheorem(diagonalSideB, heightP, '-');
                break;
            case ("t"):
                answer = help.pythagoreanTheorem(c, a,'-');
                break;
            case ("sin"):
                answer = c * Math.sin(cornerB / 180 * Math.PI);
                break;
            case ("cos"):
                answer = c * Math.cos(cornerA / 180 * Math.PI);
                break;
            case ("tan"):
                answer = a * Math.tan(cornerB / 180 * Math.PI);
                break;
            case ("ctan"):
                answer = a / Math.tan(cornerA / 180 * Math.PI);
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
                answer = help.pythagoreanTheorem(diagonalSideC, heightP, '-');
                break;
            case ("t"):
                answer = help.pythagoreanTheorem(b, a,'+');
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
