public class IsoscelesTriangle extends EquilateralTriangle{
    protected double b, medianS, bisectorS, heightS, cornerApex, cornerSide;
    public void setMedianS(double medianS) {
        this.medianS = medianS;
    }

    public void setBisectorS(double bisectorS) {
        this.bisectorS = bisectorS;
    }

    public void setHeightS(double heightS) {
        this.heightS = heightS;
    }

    public void setCornerApex(double cornerApex) {
        this.cornerApex = cornerApex;
    }

    public void setCornerSide(double cornerSide) {
        this.cornerSide = cornerSide;
    }
    public double height(){
        height = Math.sqrt(Math.pow(a, 2) - Math.pow(b / 2, 2));
        return  height;
    }
    public  double perimeter(){
        perimeter = a * 2 + b;
        return perimeter;
    }
    public double area(){
        area = height() * b / 2;
        return area;
    }

}
