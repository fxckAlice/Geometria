public class EquilateralTriangle {
    protected double a, perimeter, area, median, bisector, height, outRadius, inputRadius;

    public void setA(double a) {
        this.a = a;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setMedian(double median) {
        System.out.println("Please use setHeight()");
    }

    public void setBisector(double bisector) {
        System.out.println("Please use setHeight()");
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setOutRadius(double outRadius) {
        this.outRadius = outRadius;
    }

    public void setInputRadius(double inputRadius) {
        this.inputRadius = inputRadius;
    }
    public  double perimeter(){
        perimeter = a * 3;
        return perimeter;
    }
    public double area(){
        area = Math.pow(a, 2) * Math.sqrt(3) / 4;
        return area;
    }
    public double height(){
        height = Math.sqrt(Math.pow(a, 2) - Math.pow(a / 2, 2));
        return  height;
    }
    public double outRadius(){
        outRadius = a * Math.sqrt(3) / 3;
        return outRadius;
    }
    public double inputRadius(){
        inputRadius = a * Math.sqrt(3) / 6;
        return inputRadius;
    }
}
