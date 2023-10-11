package circle;

import help.HelpingMethods;

public class Circle {
    HelpingMethods help = new HelpingMethods();
    protected double radius, diameter, length, area;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public double diameter(){
        diameter = radius / 2;
        return diameter;
    }
    public double length(){
        length = 2 * radius * Math.PI;
        return length;
    }
    public double area(){
        area = Math.pow(radius, 2) * Math.PI;
        return area;
    }
    public double radius(String parameter){
        double answer;
        switch (parameter){
            case("d"):
                answer = diameter / 2;
                break;
            case("l"):
                answer = length / (2 * Math.PI);
                break;
            case("a"):
                answer = Math.sqrt(area / Math.PI);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}
