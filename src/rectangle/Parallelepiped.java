package rectangle;

public class Parallelepiped extends Rectangle{
    double heightP, volume, diagonalV, diagonalSideLength, diagonalSideWidth;


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
        diagonalV = help.pythagoreanTheorem(heightP, diagonal, "+");
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
                answer = (area / 2 - length * width) / (length + width);
                break;
            case ("dL"):
                answer = help.pythagoreanTheorem(diagonalSideLength, length, "-");
                break;
            case ("dW"):
                answer = help.pythagoreanTheorem(diagonalSideWidth, width, "-");
                break;
            case("dV"):
                answer = help.pythagoreanTheorem(diagonalV, diagonal, "-");
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
                answer = (area / 2 - heightP * width) / (heightP + width);
                break;
            case ("dL"):
                answer = help.pythagoreanTheorem(diagonalSideLength, heightP, "-");
                break;
            case ("d"):
                answer = help.pythagoreanTheorem(diagonal, width, "-");
                break;
            case("dV"):
                answer = help.pythagoreanTheorem(diagonalV, diagonalSideWidth, "-");
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
                answer = (area / 2 - heightP * length) / (length + heightP);
                break;
            case ("dW"):
                answer = help.pythagoreanTheorem(diagonalSideWidth, heightP, "-");
                break;
            case ("d"):
                answer = help.pythagoreanTheorem(diagonal, length, "-");
                break;
            case("dV"):
                answer = help.pythagoreanTheorem(diagonalV, diagonalSideLength, "-");
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
