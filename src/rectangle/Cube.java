package rectangle;

public class Cube extends Square{
    protected double volume, diagonalV;
    Cube(double length){
        this.length = length;
    }
    Cube(){}
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDiagonalV(double diagonalV) {
        this.diagonalV = diagonalV;
    }
    public double volume(){
        volume = Math.pow(length, 3);
        return volume;
    }
    public double diagonalV(){
        diagonalV = length * Math.sqrt(3);
        return diagonalV;
    }
    @Override
    public double area(){
        area = Math.pow(length, 2) * 6;
        return area;
    }
    @Override
    public double perimeter() {
        System.out.println("Doesn`t exist");
        return -1;
    }
    @Override
    public double inputRadius() {
        System.out.println("Doesn`t exist");
        return -1;
    }
    @Override
    public void setPerimeter(double perimeter) {
        System.out.println("Doesn`t exist");
    }
    @Override
    public void setInputRadius(double inputRadius) {
        System.out.println("Doesn`t exist");
    }
    @Override
    public void setOutRadius(double outRadius) {
        System.out.println("Doesn`t exist");
    }
    @Override
    public double outRadius (){
        System.out.println("Doesn`t exist");
        return -1;
    }
    @Override
    public double sumOfCorners(){
        System.out.println("Error!");
        return -1;
    }
    @Override
    public double side(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = Math.sqrt(area / 6);
                break;
            case ("d"):
                answer = help.pythagoreanTheorem(diagonal, "-");
                break;
            case ("v"):
                answer = Math.cbrt(volume);
                break;
            case("s"):
                answer = diagonalV / Math.sqrt(3);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
}
