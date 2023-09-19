public class Parallelepiped extends Figure{
    protected double height;
    protected double diagonal2;
    public void setDiagonal2(double diagonal2){this.diagonal2 = diagonal2;}
    public void setCorner(double corner){
        if(corner <= 90){this.corner = corner;}
        else{
            System.out.println("Corner must be less than 90 degrees");
        }
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double area(char parameter){
        switch (parameter) {
            case ('h'):
                area = height * leight;
                break;
            case ('c'):
                area = width * Math.sin(corner) * leight;
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return area;
    }
    public double diagonal(){
        System.out.println("You can use diagonal1() or diagonal2");
        return -1;
    }
    public double diagonal1(){
        double temp = 2 * leight * width * Math.cos(180 - corner);
        diagonal = Math.sqrt(Math.pow(leight, 2) + Math.pow(width, 2) - temp);
        return diagonal;
    }
    public double diagonal2(){
        double temp = 2 * leight * width * Math.cos(corner);
        diagonal2 = Math.sqrt(Math.pow(leight, 2) + Math.pow(width, 2) - temp);
        return diagonal2;
    }
    public double outRadius (){
        if(diagonal1() == diagonal2()){
            outRadius = diagonal1() / 2;
            return outRadius;
        }
        else{
            System.out.println("This parallelepiped doesn't have out circle");
            return  -1;
        }
    }
    public double inputRadius(){
        if(leight == width){
            inputRadius = area() / 2*leight;
            return inputRadius;
        }
        else{
            System.out.println("Error. The figure doesn't have input circle.");
            return -1;
        }
    }
}
