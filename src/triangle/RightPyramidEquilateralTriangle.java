package triangle;

import help.HelpingMethods;

public class RightPyramidEquilateralTriangle extends EquilateralTriangle{
    HelpingMethods help = new HelpingMethods();
    protected double volume, areaSide, areaBase, heightP, slantHeight;
    public RightPyramidEquilateralTriangle(double a){
        this.a = a;
    }
    public RightPyramidEquilateralTriangle(){}
    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public void setPerimeter(double perimeter) {
        System.out.println("Doesn`t exist!");
    }
    public void setHeightP(double heightP) {
        this.heightP = heightP;
    }

    public void setAreaSide(double areaSide) {
        this.areaSide = areaSide;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public void setSlantHeight(double slantHeight) {
        this.slantHeight = slantHeight;
    }
    public double areaBase(){
        areaBase = Math.pow(a, 2) * Math.sqrt(3) / 4;
        return areaBase;
    }
    public double areaSide(){
        areaSide = Math.pow(a, 2) * Math.sqrt(3) / 4 * 3;
        return areaSide;
    }
    public double volume(){
        volume = areaBase * heightP / 3;
        return volume;
    }
    @Override
    public double area(){
        area = areaBase + areaSide;
        return area;
    }

    @Override
    public void setOutRadius(double outRadius) {
        System.out.println("Doesn`t exist!");
    }
    @Override
    public void setInputRadius(double inputRadius) {
        System.out.println("Doesn`t exist!");
    }
    @Override
    public  double perimeter(){
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
    public double heightP(){
        heightP = help.pythagoreanTheorem(a, help.pythagoreanTheorem(a, a / 2, "-") * 2 / 3, "-");
        return heightP;
    }  //heightP = a / 2; xD
    public double side(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = Math.sqrt(area / Math.sqrt(3));
                break;
            case ("aS"):
                answer = Math.sqrt(areaSide * 4 / Math.sqrt(3) / 3);
                break;
            case ("aB"):
                answer = Math.sqrt(areaSide * 4 / Math.sqrt(3));
                break;
            case ("h"):
                answer = height * 2 / Math.sqrt(3);
                break;
            case ("hP"):
                answer = heightP * 2;
                break;
            case ("v"):
                answer = Math.cbrt(volume * 2 / Math.sqrt(3));
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}
