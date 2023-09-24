package Rectangle;

public class Rectangle {
    protected double length, width, perimeter, area, diagonal, outRadius, inputRadius, corner;
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setInputRadius(double inputRadius) {
        this.inputRadius = inputRadius;
    }

    public void setOutRadius(double outRadius) {
        this.outRadius = outRadius;
    }

    public double perimeter(){
        perimeter = 2 * length + 2 * width;
        return perimeter;
    }
    public double area(){
        area = length * width;
        return area;
    }
    public double diagonal(){
        diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        return diagonal;
    }
    public double round(double x, int dozen){
        double rounding = Math.pow(10, dozen);
        int temp;
        if(x % rounding >= 5 * Math.pow(10, dozen - 1)){
             temp = (int)(x / rounding) + 1;
        }
        else {
            temp = (int)(x / rounding);
        }
        return temp * rounding;
    }
    public double outRadius (){
        outRadius = diagonal() / 2;
        return outRadius;
    }
    public double inputRadius(){
        if(length == width){
            inputRadius = length / 2;
            return inputRadius;
        }
        else{
            System.out.println("Error. The figure doesn't have input circle.");
            return -1;
        }
    }
    public double side(char parameter){
        double answer;
        switch (parameter){
            case ('a'):
                answer = area / length;
                break;
            case ('p'):
                answer = perimeter / 2 - length;
                break;
            case ('d'):
                answer = Math.sqrt(Math.pow(diagonal, 2) - Math.pow(length, 2));
                break;
            case ('i'):
                answer = 2 * inputRadius;
                break;
            case ('o'):
                answer = Math.sqrt(Math.pow(outRadius * 2, 2) / 2);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double corner(){
        corner = 90;
        return corner;
    }
    public double sumOfCorners(){
        return 360;
    }
    public double cornerDiagonalLength(){
        return Math.acos(length / diagonal());
    }
    public double cornerDiagonalWidth(){
        return Math.asin(length / diagonal());
    }

}