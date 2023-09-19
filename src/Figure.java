public class Figure {
    private double leight;
    private double width;
    public void setleight(double leight){
        this.leight = leight;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double perimeter(){
        return 2 * leight + 2 * width;
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
    public double side(double value, char parameter){
        double answer;
        switch (parameter){
            case ('a'):
                answer = value / leight;
                break;
            case ('p'):
                answer = value / 2 - leight;
                break;
            case ('d'):
                answer = Math.sqrt(Math.pow(value, 2) - Math.pow(leight, 2));
                break;
            case ('i'):
                answer = 2 * value;
                break;
            case ('o'):
                answer = Math.sqrt(Math.pow(value * 2, 2) - Math.pow(leight, 2));
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double corner(){
        return 90;
    }
    public double sumOfCorners(){
        return 360;
    }
    public double cornerDiagonalLeight(){
        return Math.acos(leight / diagonal());
    }
    public double cornerDiagonalWidth(){
        return Math.asin(leight / diagonal());
    }
}
