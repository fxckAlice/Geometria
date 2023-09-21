public class rhombus extends Parallelogram{
    @Override
    public void setWidth(double width) {
        System.out.println("Error.");
    }
    public double perimeter() {
        perimeter = 4 * leight;
        return perimeter;
    }
    public double area(char parameter){
        switch (parameter) {
            case ('h'):
                area = height * leight;
                break;
            case ('c'):
                area = Math.sin(corner) * Math.pow(leight, 2);
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
        }
        return area;
    }
    public double diagonal1(){
        double temp = 2 * Math.pow(leight, 2) * Math.cos(180 - corner);
        diagonal = Math.sqrt(2 * Math.pow(leight, 2) - temp);
        return diagonal;
    }
    public double diagonal2(){
        double temp = 2 * Math.pow(leight, 2) * Math.cos(corner);
        diagonal2 = Math.sqrt(2 * Math.pow(leight, 2) - temp);
        return diagonal2;
    }
    public double inputRadius() {
        inputRadius = area() / 2 * leight;
        return inputRadius;
    }
    public double side(char parameter) {
        double answer;
        switch (parameter) {
            case ('a'):
                answer = area / height;
                break;
            case ('p'):
                answer = perimeter / 2 - leight;
                break;
            case ('d'):
                answer = Math.sqrt(Math.pow(diagonal, 2) - Math.pow(height, 2));
                break;
            case ('i'):
                answer = area / (2 * inputRadius);
                break;
            case ('o'):
                answer = Math.sqrt(Math.pow(outRadius * 2, 2) / 2);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
                break;
        }
        return answer;
    }
}
