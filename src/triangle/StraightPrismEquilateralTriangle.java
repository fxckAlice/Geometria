package triangle;

public class StraightPrismEquilateralTriangle extends EquilateralTriangle{
    protected double heightP, volume;
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

    @Override
    public double area(){
        area = Math.pow(a, 2) * Math.sqrt(3) / 2 + 3 * heightP * a;
        return area;
    }
    @Override
    public  double perimeter(){
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
    public double heightP(char parameter){
        double answer;
        switch (parameter){
            case ('a'):
                answer = (area / a - Math.sqrt(3) / 2) / 3;
                break;
            case ('v'):
                answer = volume / (Math.pow(a, 2) * Math.sqrt(3) / 4);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
    public double side(char parameter){
        double answer;
        switch (parameter){
            case ('a'):
                double D = Math.pow(3 * heightP, 2) + 4 * area * Math.sqrt(3) / 2;
                if(D < 0){
                    System.out.println("Discriminant less than 0");
                    answer = -1;
                }
                else {
                    double x1 = (-1 * 3 * heightP + Math.sqrt(D)) / (2 * Math.sqrt(3) / 2);
                    double x2 = (-1 * 3 * heightP - Math.sqrt(D)) / (2 * Math.sqrt(3) / 2);
                    if(x1 > 0){
                        answer = x1;
                    } else if (x2 > 0) {
                        answer = x2;
                    }
                    else {
                        System.out.println("Error!");
                        answer = -1;
                    }
                }
                break;
            case ('v'):
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
