public class Figure {
    private double leight;
    private double width;
    public void setleight(double leight){
        this.leight = leight;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
        return leight * width;
    }
}
