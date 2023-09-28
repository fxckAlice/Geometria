package rectangle;

public class Parallelepiped extends Rectangle{
    double heightP,volume, diagonalV, diagonalSideLength, diagonalSideWidth;

    public void setHeightP(double heightP) {
        this.heightP = heightP;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDiagonalV(double diagonalV) {
        this.diagonalV = diagonalV;
    }
    public void setDiagonalSide(double diagonalSideLength) {
        this.diagonalSideLength = diagonalSideLength;
    }

    public void setDiagonalSideWidth(double diagonalSideWidth) {
        this.diagonalSideWidth = diagonalSideWidth;
    }

    public double volume(){
        volume = length * width * heightP;
        return volume;
    }
    public double diagonalV(){
        diagonalV = Math.sqrt(Math.pow(heightP, 2) + Math.pow(diagonal,2));
        return diagonalV;
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
                answer = (area * 2 - length * width) / (length + width);
                break;
            case ("dL"):
                answer = Math.sqrt(Math.pow(diagonalSideLength, 2) - Math.pow(length, 2));
                break;
            case ("dW"):
                answer = Math.sqrt(Math.pow(diagonalSideWidth, 2) - Math.pow(width, 2));
                break;
            case("dV"):
                answer = Math.sqrt(Math.pow(diagonalV, 2) - Math.pow(diagonal, 2));
                break;
            case ("v"):
                answer = volume / length / width;
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
                answer = (area * 2 - heightP * width) / (heightP + width);
                break;
            case ("dL"):
                answer = Math.sqrt(Math.pow(diagonalSideLength, 2) - Math.pow(heightP, 2));
                break;
            case ("d"):
                answer = Math.sqrt(Math.pow(diagonal, 2) - Math.pow(width, 2));
                break;
            case("dV"):
                answer = Math.sqrt(Math.pow(diagonalV, 2) - Math.pow(diagonalSideWidth, 2));
                break;
            case ("v"):
                answer = volume / heightP / width;
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
                answer = (area * 2 - heightP * length) / (length + heightP);
                break;
            case ("dW"):
                answer = Math.sqrt(Math.pow(diagonalSideWidth, 2) - Math.pow(heightP, 2));
                break;
            case ("d"):
                answer = Math.sqrt(Math.pow(diagonal, 2) - Math.pow(length, 2));
                break;
            case("dV"):
                answer = Math.sqrt(Math.pow(diagonalV, 2) - Math.pow(diagonalSideLength, 2));
                break;
            case ("v"):
                answer = volume / length / heightP;
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }

}
