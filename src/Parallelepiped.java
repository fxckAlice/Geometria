public class Parallelepiped extends Figure{
    double corner;
    double height;
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
        double answer;
        switch (parameter) {
            case ('h'):
                answer = height * leight;
                break;
            case ('c'):
                answer = width * Math.sin(corner) * leight;
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double diagonal(){
        System.out.println("You can use diagonal1() or diagonal2");
        return -1;
    }
    public double diagonal1(){
        double temp = 2 * leight * width * Math.cos(180 - corner);
        return Math.sqrt(Math.pow(leight, 2) + Math.pow(width, 2) - temp);
    }
    public double diagonal2(){
        double temp = 2 * leight * width * Math.cos(corner);
        return Math.sqrt(Math.pow(leight, 2) + Math.pow(width, 2) - temp);
    }
    public double outRadius (){
        if(diagonal1() == diagonal2()){
            return diagonal1() / 2;
        }
        else{
            System.out.println("This parallelepiped doesn't have out circle");
            return  -1;
        }
    }
    public double inputRadius(){
        if(leight == width){
            return area() / 2*leight;
        }
        else{
            System.out.println("Error. The figure doesn't have input circle.");
            return -1;
        }
    }
}
