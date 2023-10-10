package triangle;

public class RightTriangle extends Triangle {
    @Override
    public void setHeight(double height) {
        System.out.println("Doesn't exist.");
    }

    @Override
    public void setHeightB(double heightB) {
        System.out.println("Doesn't exist.");
    }
    @Override
    public void setCornerC(double cornerC) {
        System.out.println("90 degrees is constant.");
    }
    @Override
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

    @Override
    public double medianC() {
        median = c / 2;
        return median;
    }
    @Override
    public double heightC(){
        heightC = a * b / c;
        return heightC;
    }
    @Override
    public double outRadius(){
        outRadius = c / 2;
        return outRadius;
    }
    @Override
    public double inputRadius(){
        inputRadius = (a + b - c) / 2;
        return inputRadius;
    }
    @Override
    public double side(char parameter) {
        double answer;
        switch (parameter) {
            case 'o':
                answer = help.pythagoreanTheorem(outRadius * 2, b, '-');
                break;
            case 'm':
                answer = help.pythagoreanTheorem(medianC * 2, b, '-');
                break;
            case 'p':
                answer = perimeter - b - c;
                break;
            case 'a':
                answer = area / b;
                break;
            case 't':
                answer = help.pythagoreanTheorem(c, b, '-');
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    @Override
    public double sideB(char parameter) {
        double answer;
        switch (parameter) {
            case 'o':
                answer = help.pythagoreanTheorem(outRadius * 2, a, '-');
                break;
            case 'm':
                answer = help.pythagoreanTheorem(medianC * 2, a, '-');
                break;
            case 'p':
                answer = perimeter - a - c;
                break;
            case 'a':
                answer = area / a;
                break;
            case 't':
                answer = help.pythagoreanTheorem(c, a, '-');
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    @Override
    public double sideC(char parameter) {
        double answer;
        switch (parameter) {
            case 'o':
                answer = outRadius * 2;
                break;
            case 'm':
                answer = medianC * 2;
                break;
            case 'p':
                answer = perimeter - a - b;
                break;
            case 't':
                answer = help.pythagoreanTheorem(b, a, '+');
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }

}
