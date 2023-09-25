package Circle;

public class Circle {
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
    public double radius(char parameter){
        double answer;
        switch (parameter){
            case('d'):
                answer = diameter / 2;
        }
        return answer;
    }
}
