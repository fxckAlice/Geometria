public class Square extends Figure{
    @Override
    public void setWidth(double width) {
        System.out.println("Error.");
    }
    public double perimeter(){
        return 4 * leight;
    }
    public double area(){
        return Math.pow(leight,2);
    }
    public double diagonal(){
        return Math.sqrt(Math.pow(leight, 2) * 2);
    }
    public double inputRadius() {
        return leight / 2;
    }
    public double cornerDiagonalLeight(){
        return 45;
    }
    public double cornerDiagonalWidth(){
        System.out.println("Error");
        return -1;
    }
}
