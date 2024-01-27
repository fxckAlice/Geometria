package resources.figures.rectangle;

import resources.help.HelpingMethods;

public class Cube extends Square{
    protected double volume, diagonalV;
    public Cube(double length){
        this.length = length;
    }
    public Cube(){}
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDiagonalV(double diagonalV) {
        this.diagonalV = diagonalV;
    }
    public double getVolume(){
        if (volume > 0) return volume;
        else if (!(length > 0)) getLength();
        return volume();
    }
    protected double volume(){
        volume = Math.pow(length, 3);
        return volume;
    }
    public double getDiagonalV(){
        if (diagonalV > 0) return diagonalV;
        else if (!(length > 0)) getLength();
        return diagonalV();
    }
    protected double diagonalV(){
        diagonalV = length * Math.sqrt(3);
        return diagonalV;
    }
    @Override
    protected double area(){
        area = Math.pow(length, 2) * 6;
        return area;
    }
    @Override
    protected double perimeter() {
        System.out.println("Doesn`t exist");
        return -1;
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
    public double getLength(){
        if (length > 0) return length;
        else if (area > 0) return side("a");
        else if (diagonal > 0) return  side("d");
        else if (volume > 0) return side("v");
        else if (diagonalV > 0) return side("s");
        else {
            System.out.println("Error! Missing values.");
            return -1;
        }
    }
    @Override
    protected double side(String parameter){
        switch (parameter){
            case ("a"):
                length = Math.sqrt(area / 6);
                break;
            case ("d"):
                length = HelpingMethods.pythagoreanTheorem(diagonal, "-");
                break;
            case ("v"):
                length = Math.cbrt(volume);
                break;
            case("s"):
                length = diagonalV / Math.sqrt(3);
                break;
            default:
                System.out.println("Enter correct parameter.");
                length = -1;
                break;
        }
        return length;
    }
}
