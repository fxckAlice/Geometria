package circle;

import help.HelpingMethods;

public class Cone extends Circle{
    protected double volume, areaSide, areaBase, heightP, slantHeight;
    public Cone(double radius, double heightP){
        this.radius = radius;
        this.heightP = heightP;
    }
    public Cone(){}
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
        slantHeight = HelpingMethods.pythagoreanTheorem(heightP, radius, "+");
        return slantHeight;
    }
    public double heightP(String parameter){
        double answer;
        switch (parameter){
            case("s"):
                answer = HelpingMethods.pythagoreanTheorem(slantHeight, radius,"-");
                break;
            case("aS"):
                answer = HelpingMethods.pythagoreanTheorem(areaSide / Math.PI / radius, radius, "-");
                break;
            case("a"):
                answer = HelpingMethods.pythagoreanTheorem((area - Math.pow(radius, 2) * Math.PI) / Math.PI / radius, radius, "-");
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
                answer = HelpingMethods.pythagoreanTheorem(slantHeight, heightP,"-");
                break;
            case("aS"):
                answer = areaSide / Math.PI / slantHeight;
                break;
            case("a"):
                answer = HelpingMethods.quadraticEducation(1, slantHeight, -area / Math.PI);
                break;
            case("aB"):
                answer = Math.sqrt(areaBase / Math.PI);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}
