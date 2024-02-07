package resources.figures.rectangle;

import resources.help.HelpingMethods;

public class StraightPrismParallelogram extends Parallelogram{
    protected double heightP, volume, areaBase, areaSide, diagonalV1, diagonalV2, diagonalSideLength, diagonalSideWidth;
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

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public void setAreaSide(double areaSide) {
        this.areaSide = areaSide;
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
    public double getAreaBase(){
        if (areaBase > 0) return areaBase;
        else if (length > 0){
            if (height1 > 0) return area("l");
            else{
                if (!(width > 0)) {
                    getWidth();
                }
                if(!(corner > 0)){
                    getCorner();
                }
                return areaBase("c");
            }
        }
        else if (width > 0) {
            if (height2 > 0) return areaBase("w");
            else{
                getLength();
                return areaBase("c");
            }
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double areaBase(String parameter){
        switch (parameter) {
            case ("l"):
                if (height1 > 0 && length > 0){
                    areaBase = height1 * length;
                    break;
                }
                else {
                    System.out.println("Error! Missing values.");
                    return -1;
                }
            case ("w"):
                if (height2 > 0 && width > 0){
                    areaBase = height2 * width;
                    break;
                }
                else {
                    System.out.println("Error! Missing values.");
                    return -1;
                }
            case ("c"):
                if (length > 0 && width > 0 && corner > 0){
                    areaBase = width * Math.sin(corner / 180 * Math.PI) * length;
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
            if(!(heightP > 0)) getHeightP();
            if(!(length > 0)) getLength();
            if(!(width > 0)) getWidth();
            return areaSide();
        }
    }
    protected double areaSide(){
        if (heightP > 0 && length > 0 && width > 0){
            areaSide = (width + length) * 2 * heightP;
            return areaSide;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getVolume(){
        if (volume > 0) return volume;
        else {
            if (!(heightP > 0)) getHeightP();
            if (!(areaBase > 0)) getAreaBase();
            return volume();
        }
    }
    protected double volume(){
        if (heightP > 0 && areaBase > 0) {
            volume = heightP * areaBase;
            return volume;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getArea(){
        if (area > 0) return area;
        else {
            if (!(areaBase > 0)) getAreaBase();
            if (!(areaSide > 0)) getAreaSide();
            return area();
        }
    }
    @Override
    protected double area(String parameter){
        if (areaBase > 0 && areaSide > 0){
            area = areaBase * 2 + areaSide;
            return area;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }

    public double getDiagonalV1() {
        if (diagonalV1 > 0) return diagonalV2;
        else {
            if (!(heightP > 0)) getHeightP();
            if (!(diagonal > 0)) getDiagonal1();
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
            if (!(heightP > 0)) getHeightP();
            if (!(diagonal2 > 0)) getDiagonal2();
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
    public double getDiagonalSideLength() {
        if (diagonalSideLength > 0) return diagonalSideLength;
        else {
            if (!(length > 0)) getLength();
            if (!(heightP > 0)) getHeightP();
            return diagonalSideLength();
        }
    }
    protected double diagonalSideLength(){
        if (heightP > 0 && length > 0){
            diagonalSideLength = HelpingMethods.pythagoreanTheorem(length, heightP, "+");
            return diagonalSideLength;
        }
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    public double getDiagonalSideWidth() {
        if (diagonalSideWidth > 0) return diagonalSideWidth;
        else {
            if (!(width > 0)) getWidth();
            if (!(heightP > 0)) getHeightP();
            return diagonalSideWidth();
        }
    }
    protected double diagonalSideWidth(){
        if (heightP > 0 && width > 0){
            diagonalSideWidth = HelpingMethods.pythagoreanTheorem(width, heightP, "+");
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
        else if (area > 0 && length > 0 && width > 0 && (height1 > 0 | areaBase > 0)) return heightP("a");
        else if (diagonalSideLength > 0 && length > 0) return heightP("dL");
        else if (diagonalSideWidth > 0 && width > 0) return heightP("dW");
        else if (diagonalV2 > 0 && diagonal2 > 0) return heightP("dV2");
        else if (diagonalV1 > 0 && diagonal > 0) return heightP("dV1");
        else if (volume > 0 && ((height1 > 0 && length > 0) | areaBase > 0)) return heightP("v");
        else if (areaSide > 0 && length > 0 && width > 0) return heightP("aS");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double heightP(String parameter){
        switch (parameter){
            case ("a"):
                heightP = (area / 2 - getAreaBase()) / (length + width);
                break;
            case ("dL"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalSideLength, length, "-");
                break;
            case ("dW"):
                heightP = HelpingMethods.pythagoreanTheorem(diagonalSideWidth, width,"-");
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
                heightP = areaSide / 2 / (length + width);
                break;
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return heightP;
    }
    public double getLength(){
        if (length > 0) return length;
        else if (area > 0 && heightP > 0 && width > 0 && (height2 > 0 | areaBase > 0)) return length("a");
        else if (diagonalSideLength > 0 && heightP > 0) return length("dL");
        else if (volume > 0 && heightP > 0 && height1 > 0) return length("v");
        else if (areaBase > 0 && height1 > 0) return length("aBH");
        else if (areaBase > 0 && width > 0 && corner > 0) return length("aBC");
        else if (areaSide > 0 && heightP > 0 && width > 0) return length("dL");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double length(String parameter){
        switch (parameter){
            case ("a"):
                length = (area / 2 - getAreaBase()) - heightP * width / (heightP);
                break;
            case ("dL"):
                length = HelpingMethods.pythagoreanTheorem(diagonalSideLength, heightP, "-");
                break;
            case ("v"):
                length = volume / heightP / height1;
                break;
            case ("aBH"):
                length = areaBase / height1;
                break;
            case ("aBC"):
                length = areaBase / (width * Math.sin(corner / 180 * Math.PI));
                break;
            case ("aS"):
                length = areaSide / 2 / heightP - width;
                break;
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return length;
    }
    public double getWidth(){
        if (width > 0) return width;
        else if (area > 0 && heightP > 0 && length > 0 && (height1 > 0 | areaBase > 0)) return width("a");
        else if (diagonalSideWidth > 0 && heightP > 0) return width("dW");
        else if (volume > 0 && heightP > 0 && height2 > 0) return width("v");
        else if (areaBase > 0 && height2 > 0) return width("aBH");
        else if (areaBase > 0 && length > 0 && corner > 0) return width("aBC");
        else if (areaSide > 0 && heightP > 0 && length > 0) return width("dL");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    protected double width(String parameter){
        switch (parameter){
            case ("a"):
                width = (area / 2 - height1 * length - heightP * length) / (heightP);
                break;
            case ("dW"):
                width = HelpingMethods.pythagoreanTheorem(diagonalSideWidth, heightP, "-");
                break;
            case ("v"):
                width = volume / height2 / heightP;
                break;
            case ("aBH"):
                width = areaBase / height2;
                break;
            case ("aBC"):
                width = areaBase / (length * Math.sin(corner / 180 * Math.PI));
                break;
            case ("aS"):
                width = areaSide / 2 / heightP - length;
                break;
            default:
                System.out.println("Enter correct parameter.");
                return -1;
        }
        return width;
    }
}
