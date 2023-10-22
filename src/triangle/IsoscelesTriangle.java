package triangle;

public class IsoscelesTriangle extends EquilateralTriangle {
    protected double b, medianB, bisectorB, heightB, cornerApex, cornerSide;
    public IsoscelesTriangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    public IsoscelesTriangle(){}
    public void setB(double b) {
        this.b = b;
    }

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
    @Override
    public double height(){
        height = help.pythagoreanTheorem(a, b / 2, "-");
        return  height;
    }
    public double medianB(){
        medianB = 0.5 * help.pythagoreanTheorem(a, b * Math.sqrt(2), "+");
        return medianB;
    }
    public double heightB(){
        heightB = Math.cos(cornerSide / 180 * Math.PI) * b;
        return  heightB;
    }
    @Override
    public  double perimeter(){
        perimeter = a * 2 + b;
        return perimeter;
    }
    public double area(String parameter){
        switch (parameter){
            case ("a"):
                area = height * b / 2;
                break;
            case ("b"):
                area = heightB * a / 2;
                break;
        }
        return area;
    }
    @Override
    public double outRadius(){
        outRadius = a * a * b / (4 * area);
        return outRadius;
    }
    @Override
    public double inputRadius(){
        inputRadius = Math.sqrt(Math.pow(semiPerimeter() - a, 2) * (semiPerimeter() - b) / semiPerimeter());
        return inputRadius;
    }
    @Override
    public double side(String parameter){
        double answer;
        switch (parameter){
            case "o":
                answer = Math.sqrt(outRadius * 4 * area / (b));
                break;
            case "i":
                answer = semiPerimeter() - Math.sqrt(Math.pow(inputRadius, 2) * semiPerimeter() / (semiPerimeter() - b));
                break;
            case "p":
                answer = (perimeter - b) / 2;
                break;
            case "a":
                answer = area / heightB * 2;
                break;
            case "h":
                answer = help.pythagoreanTheorem(height, b / 2, "+");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double sideB(String parameter){
        double answer;
        switch (parameter){
            case "o":
                answer = outRadius * 4 * area / (Math.pow(a, 2));
                break;
            case "i":
                answer = Math.pow(inputRadius, 2) * semiPerimeter() / Math.pow(semiPerimeter() - a, 2);
                break;
            case "p":
                answer = perimeter - 2 * a;
                break;
            case "a":
                answer = area / height * 2;
                break;
            case "h":
                answer = help.pythagoreanTheorem(a, height, "-");
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }

        return answer;
    }
}
