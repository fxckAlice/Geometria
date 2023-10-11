package triangle;

import help.HelpingMethods;
import org.w3c.dom.html.HTMLLegendElement;

public class StraightPrismEquilateralTriangle extends EquilateralTriangle{
    protected double heightP, volume, diagonalSide;
    @Override
    public void setPerimeter(double perimeter) {
        System.out.println("Doesn`t exist!");
    }
    @Override
    public void setOutRadius(double outRadius) {
        System.out.println("Doesn`t exist!");
    }
    @Override
    public void setInputRadius(double inputRadius) {
        System.out.println("Doesn`t exist!");
    }

    public void setDiagonalSide(double diagonalSide) {
        this.diagonalSide = diagonalSide;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setHeightP(double heightP) {
        this.heightP = heightP;
    }
    public double volume(){
        volume = Math.pow(a, 2) * Math.sqrt(3) / 4 * heightP;
        return volume;
    }
    public double diagonalSide(){
        diagonalSide = help.pythagoreanTheorem(a, heightP, "+");
        return diagonalSide;
    }

    @Override
    public double area(){
        area = Math.pow(a, 2) * Math.sqrt(3) / 2 + 3 * heightP * a;
        return area;
    }
    @Override
    public double perimeter(){
        System.out.println("Doesn`t exist!");
        return -1;
    }
    @Override
    public double outRadius(){
        System.out.println("Doesn`t exist!");
        return -1;
    }
    @Override
    public double inputRadius(){
        System.out.println("Doesn`t exist!");
        return -1;
    }
    public double heightP(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = (area / a - Math.sqrt(3) / 2) / 3;
                break;
            case ("v"):
                answer = volume / (Math.pow(a, 2) * Math.sqrt(3) / 4);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    @Override
    public double side(String parameter){
        double answer;
        switch (parameter){
            case ("a"):
                answer = help.quadraticEducation(Math.sqrt(3) / 2, 3 * heightP, -area);
                break;
            case ("v"):
                answer = Math.sqrt(volume / heightP * 4 / Math.sqrt(3));
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
}
