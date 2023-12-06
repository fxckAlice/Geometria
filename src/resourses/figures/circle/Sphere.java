package resourses.figures.circle;

public class Sphere extends Circle{
    protected double volume;
    public Sphere(double radius){
        this.radius = radius;
    }
    public Sphere(){}
    @Override
    public double area(){
        area = 4 * Math.pow(radius, 2) * Math.PI;
        return area;
    }
    public double volume(){
        volume = (double)(4 / 3) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
