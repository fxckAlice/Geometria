package Triangle;

public class RightTriangle extends Triangle{
    @Override
    public void setHeight(double height) {
        System.out.println("Doesn't exist.");
    }

    @Override
    public void setHeightB(double heightB) {
        System.out.println("Doesn't exist.");
    }
    public void setCornerC(double cornerC) {
        System.out.println("90 degrees is constant.");
    }
    public double area(char parameter){
        switch (parameter){
            case ('s'):
                area = a * b / 2;
                break;
            case ('c'):
                area = heightC * c / 2;
        }
        return area;
    }
    public double medianC(){
        medianC = c / 2;
        return medianC;
    }
    public double heightC(){
        heightC = a * b / c;
        return  heightC;
    }
    public double outRadius(){
        outRadius = c / 2;
        return outRadius;
    }
    public double inputRadius() {
        inputRadius = (a + b - c) / 2;
        return inputRadius;
    }
    public double side(char parameter) {
        double answer;
        switch (parameter) {
            case 'o':
                answer = Math.sqrt(Math.pow(outRadius * 2, 2) - Math.pow(b, 2));
                break;
            case 'i':
                answer = inputRadius * 2 + c - b;
                break;
            case 'p':
                answer = perimeter - b - c;
                break;
            case 'a':
                answer = area / b * 2;
                break;
            case 't':
                answer = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double sideB(char parameter) {
        double answer;
        switch (parameter) {
            case 'o':
                answer = Math.sqrt(Math.pow(outRadius * 2, 2) - Math.pow(a, 2));
                break;
            case 'i':
                answer = inputRadius * 2 + c - a;
                break;
            case 'p':
                answer = perimeter - a - c;
                break;
            case 'a':
                answer = area / a * 2;
                break;
            case 't':
                answer = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double sideC(char parameter) {
        double answer;
        switch (parameter) {
            case 'o':
                answer = outRadius * 2;
                break;
            case 'i':
                answer = inputRadius * 2 - b - a;
                break;
            case 'p':
                answer = perimeter - a - b;
                break;
            case 'm':
                answer = medianC * 2;
                break;
            case 't':
                answer = Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2));
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}
