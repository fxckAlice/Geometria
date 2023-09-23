public class IsoscelesTriangle extends EquilateralTriangle{
    protected double b, medianS, bisectorS, heightS, cornerApex, cornerSide;
    public void setMedianS(double medianS) {
        this.medianS = medianS;
    }

    public void setBisectorS(double bisectorS) {
        this.bisectorS = bisectorS;
    }

    public void setHeightS(double heightS) {
        this.heightS = heightS;
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
    public double area(){
        area = height() * b / 2;
        return area;
    }
    public double outRadius(){
        outRadius = a * a * b / (4 * area);
        return outRadius;
    }
    public double inputRadius(){
        inputRadius = Math.sqrt(Math.pow(perimeter / 2 - a, 2) * (perimeter / 2 - b) / (perimeter / 2));
        return inputRadius;
    }
    public double side(char parameter){
        double answer;
        switch (parameter){
            case 'o':
                answer = Math.sqrt(outRadius * 4 * area / (b));
                break;
            case 'i':
                double semiPerimeter = perimeter / 2;
                answer = semiPerimeter - Math.sqrt(Math.pow(inputRadius, 2) * semiPerimeter / (semiPerimeter - b));
                break;
            case 'p':
                answer = (perimeter - b) / 2;
                break;
            case 'a':
                answer = Math.sqrt(Math.pow(area / b, 2) + Math.pow(b / 2, 2));
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
                double semiPerimeter = perimeter / 2;
                answer = Math.pow(inputRadius, 2) * semiPerimeter / (semiPerimeter - b);
                break;
            case 'p':
                answer = perimeter - 2 * a;
                break;
            case 'a':
                answer = area / height;
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
