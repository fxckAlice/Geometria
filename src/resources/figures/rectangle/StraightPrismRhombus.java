package resources.figures.rectangle;

import resources.help.HelpingMethods;

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
    protected double heightP, volume, diagonalV1, diagonalV2, diagonalSideLength, areaBase, areaSide;

    public void setAreaSide(double areaSide) {
        this.areaSide = areaSide;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

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

    public double getVolume() {
        if (volume > 0) return volume;
        else if (areaBase > 0){
            if (!(heightP > 0)) getHeightP();
            return volume();
        }
        else if (heightP > 0) {
            getAreaBase();
            return volume();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }

    protected double volume(){
        if (areaBase > 0 && heightP > 0){
            volume = areaBase * heightP;
            return volume;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getDiagonalSideLength(){
        if (diagonalSideLength > 0) return diagonalSideLength;
        else if (length > 0) {
            if (!(heightP > 0)) getHeightP();
            return diagonalSideLength();
        }
        else if (heightP > 0) {
            getLength();
            return diagonalSideLength();
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double diagonalSideLength(){
        if (length > 0 && heightP > 0){
            diagonalSideLength = HelpingMethods.pythagoreanTheorem(length, heightP, "+");
            return diagonalSideLength;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getAreaBase(){
        if (areaBase > 0) return areaBase;
        else if (length > 0){
            getCorner();
            if (corner > 0) return areaBase("c");
            getHeight1();
            if (height1 > 0) return areaBase("h");
            else {
                System.out.println("Error! Missing values.");
                return -1;
            }
        }
        else if (height1 > 0){
            getLength();
            return areaBase("h");
        }
        else if (corner > 0){
            getLength();
            return areaBase("c");
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double areaBase(String parameter){
        switch (parameter) {
            case ("h"):
                if (height1 > 0 && length > 0){
                    areaBase = height1 * length;
                    break;
                }
                else {
                    System.out.println("Error! Missing values.");
                    return -1;
                }
            case ("c"):
                if (length > 0 && corner > 0){
                    areaBase = Math.sin(corner / 180 * Math.PI) * Math.pow(length, 2);
                    break;
                }
                else {
                    System.out.println("Error! Missing values.");
                    return -1;
                }
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return areaBase;
    }
    public double getAreaSide(){
        if (areaSide > 0) return areaSide;
        else {
            if (!(length > 0)) getLength();
            if (!(heightP > 0)) getHeightP();
            return areaSide();
        }
    }
    protected double areaSide(){
        if (length > 0 && heightP > 0) {
            areaSide = length * heightP * 4;
            return areaSide;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getArea(){
        if (area > 0) return area;
        else if (areaBase > 0){
            if (!(areaSide > 0)) getAreaSide();
            return area();
        }
        else if (areaSide > 0){
            getAreaBase();
            return area();
        }
        else {
            getAreaBase();
            getAreaSide();
            return area();
        }
    }
    @Override
    protected double area(){
        if (areaBase > 0 && areaSide > 0){
            area = areaBase * 2 + areaSide;
            return area;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getDiagonalV1(){
        if (diagonalV1 > 0) return diagonalV1;
        else if (heightP > 0){
            if(!(diagonal > 0)) getDiagonal1();
            return diagonalV1();
        }
        else if (diagonal > 0){
            getHeightP();
            return diagonalV1();
        }
        else {
            getHeightP();
            getDiagonal1();
            return diagonalV1();
        }
    }
    protected double diagonalV1(){
        if (heightP > 0 && diagonal > 0){
            diagonalV1 = HelpingMethods.pythagoreanTheorem(heightP, diagonal, "+");
            return diagonalV1;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }

    public double getDiagonalV2() {
        if (diagonalV2 > 0) return diagonalV2;
        else {
            if (!(diagonal2 > 0)) getDiagonal2();
            if (!(heightP > 0)) getHeightP();
            return diagonalV2();
        }
    }

    protected double diagonalV2(){
        if (heightP > 0 && diagonal2 > 0){
            diagonalV2 = HelpingMethods.pythagoreanTheorem(heightP, diagonal2, "+");
            return diagonalV2;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
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

    public double sumOfCorners(){
        System.out.println("Error!");
        return -1;
    }
    public double getHeightP(){
        if (heightP > 0) return heightP;
        else if (area > 0 && length > 0 && height1 > 0) return heightP("a");
        else if (diagonalSideLength > 0 && length > 0) return heightP("dL");
        else if (diagonalV1 > 0 && diagonal > 0) return heightP("dV1");
        else if (diagonalV2 > 0 && diagonal2 > 0) return heightP("dV2");
        else if (volume > 0 && length > 0 && height1 > 0) return heightP("v");
        else if (areaSide> 0 && length > 0) return heightP("aS");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double heightP(String parameter){
        switch (parameter){
            case ("a"):
                heightP = (area / 2 - length * height1) / 2 / length;
                break;
            case ("dL"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalSideLength, length, "-");
                break;
            case("dV1"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalV1, diagonal, "-");
                break;
            case("dV2"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalV2, diagonal2, "-");
                break;
            case ("v"):
                heightP = volume / getAreaBase();
                break;
            case ("aS"):
                heightP = areaSide / 4 / length;
                break;
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return heightP;
    }
    public double getLength(){
        if (length > 0) return length;
        else if (area > 0 && height1 > 0 && heightP > 0) return length("a");
        else if (diagonalSideLength > 0 && heightP > 0) return length("dL");
        else if (volume > 0 && height1 > 0 && heightP > 0) return length("v");
        else if (areaBase > 0 && height1 > 0) return length("aB");
        else if (areaSide > 0 && heightP > 0) return length("aS");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double length(String parameter){
        switch (parameter){
            case ("a"):
                length = area / 2 / (height1 + heightP * 2);
                break;
            case ("dL"):
                length= HelpingMethods.pythagoreanTheorem(diagonalSideLength, heightP, "-");
                break;
            case ("v"):
                length = volume / heightP / height1;
                break;
            case ("aB"):
                length = areaBase / height1;
                break;
            case ("aS"):
                length = areaSide / 4 / heightP;
                break;
            default:
                System.out.println("Enter correct parameter.");
                length = -1;
                break;
        }
        return length;
    }

}
