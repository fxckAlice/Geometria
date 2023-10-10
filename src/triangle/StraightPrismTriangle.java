package triangle;

public class StraightPrismTriangle extends Triangle{
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
            case ('b'):
                areaBase = heightB * b / 2;
                break;
            case ('a'):
                areaBase = height * a / 2;
                break;
            case ('c'):
                areaBase = heightC * c / 2;
                break;
            case ('p'):
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
                answer = areaBase / height * 2;
                break;
            case ("p"):
                answer = perimeter - b - c;
                break;
            case ("v"):
                answer = volume / heightP / height / 4;
                break;
            case ("dSA"):
                answer = help.pythagoreanTheorem(diagonalSideA, heightP, '-');
                break;
            case ("t"):
                double temp = 2 * b * c * help.round(Math.cos((180 - cornerA) / 180 * Math.PI), -10);
                answer = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - temp);
                break;
            case ("h"):
                answer = help.pythagoreanTheorem(b, height,'-') + help.pythagoreanTheorem(c, height, '-');
                break;
            case ("m"):
                answer = Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(median / 2, 2));
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
                answer = help.pythagoreanTheorem(diagonalSideB, heightP, '-');
                break;
            case ("t"):
                double temp = 2 * a * c * help.round(Math.cos((180 - cornerB) / 180 * Math.PI), -10);
                answer = Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2) - temp);
                break;
            case ("h"):
                answer = help.pythagoreanTheorem(a, heightB,'-') + help.pythagoreanTheorem(c, heightB, '-');
                break;
            case ("m"):
                answer = Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(medianB / 2, 2));
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
                answer = help.pythagoreanTheorem(diagonalSideC, heightP, '-');
                break;
            case ("t"):
                double temp = 2 * b * a * help.round(Math.cos((180 - cornerC) / 180 * Math.PI), -10);
                answer = Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2) - temp);
                break;
            case ("h"):
                answer = help.pythagoreanTheorem(b, heightC,'-') + help.pythagoreanTheorem(a, heightC, '-');
                break;
            case ("m"):
                answer = Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(a, 2)) - Math.pow(medianC / 2, 2));
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}
