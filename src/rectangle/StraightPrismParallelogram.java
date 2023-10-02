package rectangle;

public class StraightPrismParallelogram extends Parallelogram{
    protected double heightP,volume, diagonalV1, diagonalV2, diagonalSideLength, diagonalSideWidth;

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

    public void setDiagonalSideLength(double diagonalSideLength) {
        this.diagonalSideLength = diagonalSideLength;
    }

    public void setDiagonalSideWidth(double diagonalSideWidth) {
        this.diagonalSideWidth = diagonalSideWidth;
    }
    public double volume(char parameter){
        if(parameter == 'l')volume = length * height1 * heightP;
        else if (parameter == 'w') {
            volume = width * height2 * heightP;
        }
        return volume;
    }
    @Override
    public double area(char parameter){
        switch (parameter) {
            case ('l'):
                area = (height1 * length) * 2 + (heightP * length) * 2 + (heightP * width) * 2;
                break;
            case ('w'):
                area = (height2 * width) * 2 + (heightP * length) * 2 + (heightP * width) * 2;
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
    public double diagonalSideLength(){
        diagonalSideLength = Math.sqrt(Math.pow(length, 2) + Math.pow(heightP, 2));
        return diagonalSideLength;
    }
    public double diagonalSideWidth(){
        diagonalSideWidth = Math.sqrt(Math.pow(width, 2) + Math.pow(heightP, 2));
        return diagonalSideWidth;
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
    public double heightP(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = (area / 2 - length * height1) / (length + width);
                break;
            case ("dL"):
                answer = Math.sqrt(Math.pow(diagonalSideLength, 2) - Math.pow(length, 2));
                break;
            case ("dW"):
                answer = Math.sqrt(Math.pow(diagonalSideWidth, 2) - Math.pow(width, 2));
                break;
            case("dV1"):
                answer = Math.sqrt(Math.pow(diagonalV1, 2) - Math.pow(diagonal, 2));
                break;
            case("dV2"):
                answer = Math.sqrt(Math.pow(diagonalV2, 2) - Math.pow(diagonal2, 2));
                break;
            case ("v"):
                answer = volume / (length * height1);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double length(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = (area / 2 - height2 * width) - heightP * width / (heightP);
                break;
            case ("dL"):
                answer = Math.sqrt(Math.pow(diagonalSideLength, 2) - Math.pow(heightP, 2));
                break;
            case ("v"):
                answer = volume / heightP / height1;
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double width(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = (area / 2 - height1 * length - heightP * length) / (heightP);
                break;
            case ("dW"):
                answer = Math.sqrt(Math.pow(diagonalSideWidth, 2) - Math.pow(heightP, 2));
                break;
            case ("v"):
                answer = volume / height2 / heightP;
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
}
