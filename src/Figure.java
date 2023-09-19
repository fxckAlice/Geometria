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
    public double diagonal(){
        return Math.sqrt(Math.pow(leight, 2) + Math.pow(width, 2));
    }
    public double round(double x, int dozen){
        double rounding = Math.pow(10, dozen);
        int temp = (int)(x / rounding);
        return temp * rounding;
    }
    public double outRadius (){
        return diagonal()/2;
    }
    public double inputRadius(){
        if(leight == width){
            return leight / 2;
        }
        else{
            System.out.println("Error. The figure doesn't have input circle.");
            return -1;
        }
    }
}
