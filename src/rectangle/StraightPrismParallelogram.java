package rectangle;

public class StraightPrismParallelogram extends Parallelogram{
    double heightP,volume, diagonalV1, diagonalV2, diagonalSideLength, diagonalSideWidth;

    public void setHeightP(double heightP) {
        this.heightP = heightP;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDiagonalV1(double diagonalV1) {
        this.diagonalV1 = diagonalV1;
    }

    public void setDiagonalV2(double diagonalV2) {
        this.diagonalV2 = diagonalV2;
    }

    public void setDiagonalSide(double diagonalSideLength) {
        this.diagonalSideLength = diagonalSideLength;
    }

    public void setDiagonalSideWidth(double diagonalSideWidth) {
        this.diagonalSideWidth = diagonalSideWidth;
    }
    public double volume(){
        volume = length * height * heightP;
        return volume;
    }
    @Override
    public double area(char parameter){
        switch (parameter) {
            case ('h'):
                area = (height * length) * 2 + (heightP * length) * 2 + (heightP * width) * 2;
                break;
            case ('c'):
                area = (width * Math.sin(corner / 180 * Math.PI) * length) * 2 + (heightP * length) * 2 + (heightP * width) * 2;
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return area;
    }
    public double diagonalV1(){
        diagonalV1 = Math.sqrt(Math.pow(heightP, 2) + Math.pow(diagonal,2));
        return diagonalV1;
    }
    public double diagonalV2(){
        diagonalV2 = Math.sqrt(Math.pow(heightP, 2) + Math.pow(diagonal2,2));
        return diagonalV2;
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
}
