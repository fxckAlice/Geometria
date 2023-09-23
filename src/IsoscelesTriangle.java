public class IsoscelesTriangle extends EquilateralTriangle{
    protected double b, medianB, bisectorB, heightB, cornerApex, cornerSide;
    public void setMedianB(double medianB) {
        this.medianB = medianB;
    }

    public void setBisectorB(double bisectorB) {
        this.bisectorB = bisectorB;
    }

    public void setHeightB(double heightB) {
        this.heightB = heightB;
    }

    public void setCornerApex(double cornerApex) {
        this.cornerApex = cornerApex;
    }

    public void setCornerSide(double cornerSide) {
        this.cornerSide = cornerSide;
    }
    public double height(){
        height = Math.sqrt(Math.pow(a, 2) - Math.pow(b / 2, 2));
        return  height;
    }
    public  double perimeter(){
        perimeter = a * 2 + b;
        return perimeter;
    }
    public double area(char parameter){
        switch (parameter){
            case ('a'):
                area = height * b / 2;
                break;
            case ('b'):
                area = heightB * a / 2;
                break;
        }
        return area;
    }
    public double outRadius(){
        outRadius = a * a * b / (4 * area);
        return outRadius;
    }
    public double inputRadius(){
        inputRadius = Math.sqrt(Math.pow(semiPerimeter() - a, 2) * (semiPerimeter() - b) / semiPerimeter());
        return inputRadius;
    }
    public double side(char parameter){
        double answer;
        switch (parameter){
            case 'o':
                answer = Math.sqrt(outRadius * 4 * area / (b));
                break;
            case 'i':
                answer = semiPerimeter() - Math.sqrt(Math.pow(inputRadius, 2) * semiPerimeter() / (semiPerimeter() - b));
                break;
            case 'p':
                answer = (perimeter - b) / 2;
                break;
            case 'a':
                answer = area / heightB * 2;
                break;
            case 'h':
                answer = Math.sqrt(Math.pow(height, 2) + Math.pow(b / 2, 2));
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double sideB(char parameter){
        double answer;
        switch (parameter){
            case 'o':
                answer = outRadius * 4 * area / (Math.pow(a, 2));
                break;
            case 'i':
                answer = Math.pow(inputRadius, 2) * semiPerimeter() / (semiPerimeter() - b);
                break;
            case 'p':
                answer = perimeter - 2 * a;
                break;
            case 'a':
                answer = area / height * 2;
                break;
            case 'h':
                answer = Math.sqrt(Math.pow(a, 2) + Math.pow(height, 2));
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }

        return answer;
    }
}
