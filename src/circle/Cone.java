package circle;

import help.HelpingMethods;

public class Cone extends Circle{
    HelpingMethods help = new HelpingMethods();
    protected double volume, areaSide, areaBase, heightP, slantHeight;

    public void setVolume(double volume) {
        this.volume = volume;
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
        areaBase = Math.pow(radius, 2) * Math.PI;
        return areaBase;
    }
    public double areaSide(){
        areaSide = Math.PI * radius * slantHeight;
        return areaSide;
    }
    @Override
    public double area(){
        area = areaBase + areaSide;
        return area;
    }
    public double volume(){
        volume = areaBase * heightP / 3;
        return volume;
    }
    public double slantHeight(){
        slantHeight = help.pythagoreanTheorem(heightP, radius, "+");
        return slantHeight;
    }
    public double height(String parameter){
        double answer;
        switch (parameter){
            case("s"):
                answer = help.pythagoreanTheorem(slantHeight, radius,"-");
                break;
            case("aS"):
                answer = help.pythagoreanTheorem(areaSide / Math.PI / radius, radius, "-");
                break;
            case("a"):
                answer = help.pythagoreanTheorem((area - Math.pow(radius, 2) * Math.PI) / Math.PI / radius, radius, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double radius(String parameter){
        double answer;
        switch (parameter){
            case("s"):
                answer = help.pythagoreanTheorem(slantHeight, heightP,"-");
                break;
            case("aS"):
                answer = areaSide / Math.PI / slantHeight;
                break;
            case("a"):
                answer = help.quadraticEducation(1, slantHeight, -area / Math.PI);
                break;
            case("aB"):
                answer = Math.sqrt(areaBase / Math.PI);
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}
