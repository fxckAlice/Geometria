package circle;

import help.HelpingMethods;

public class Cone extends Circle{
    HelpingMethods help = new HelpingMethods();
    protected double volume, areaSide, areaBase, height, slantHeight;

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setHeight(double height) {
        this.height = height;
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
        volume = areaBase * height / 3;
        return volume;
    }
    public double slantHeight(){
        slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        return slantHeight;
    }
    public double height(String parameter){
        double answer;
        switch (parameter){
            case("s"):
                answer = Math.sqrt(Math.pow(slantHeight, 2) - Math.pow(radius, 2));
                break;
            case("aS"):
                answer = Math.sqrt(Math.pow(areaSide / Math.PI / radius, 2) - Math.pow(radius, 2));
                break;
            case("a"):
                answer = Math.sqrt(Math.pow((area - Math.pow(radius, 2) * Math.PI) / Math.PI / radius, 2) - Math.pow(radius, 2));
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
                answer = Math.sqrt(Math.pow(slantHeight, 2) - Math.pow(height, 2));
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
