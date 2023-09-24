package Triangle;

public class Triangle extends IsoscelesTriangle {
    protected double c, medianC,heightC, bisectorC, cornerA, cornerB, cornerC;
    public void setMedian(double median) {
        this.median = median;
    }

    public void setBisector(double bisector) {
        this.bisector = bisector;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setBisectorC(double bisectorC) {
        this.bisectorC = bisectorC;
    }

    public void setMedianC(double medianC) {
        this.medianC = medianC;
    }

    public void setHeightC(double heightC) {
        this.heightC = heightC;
    }

    public void setCornerC(double cornerC) {
        this.cornerC = cornerC;
    }

    public void setCornerB(double cornerB) {
        this.cornerB = cornerB;
    }

    public void setCornerA(double cornerA) {
        this.cornerA = cornerA;
    }
    public void setCornerApex(double cornerApex) {
        System.out.println("Doesn't exist");
    }
    public void setCornerSide(double cornerSide) {
        System.out.println("Doesn't exist");
    }
    public double medianA(){
        medianB = 0.5 * Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2));
        return medianB;
    }
    public double medianB(){
        medianB = 0.5 * Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(c, 2) - Math.pow(b, 2));
        return medianB;
    }
    public double medianC(){
        medianB = 0.5 * Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2));
        return medianB;
    }
    public double heightA(){
        heightB = Math.cos(cornerB / 180 * Math.PI) * c;
        return  heightB;
    }
    public double heightB(){
        heightB = Math.cos(cornerC / 180 * Math.PI) * a;
        return  heightB;
    }
    public double heightC(){
        heightB = Math.cos(cornerA / 180 * Math.PI) * b;
        return  heightB;
    }
    public  double perimeter(){
        perimeter = a + b + c;
        return perimeter;
    }
    public double area(char parameter){
        switch (parameter){
            case ('b'):
                area = heightB * b / 2;
                break;
            case ('a'):
                area = height * a / 2;
                break;
            case ('c'):
                area = heightC * c / 2;
        }
        return area;
    }
    public double outRadius(){
        outRadius = a * c * b / (4 * area);
        return outRadius;
    }
    public double inputRadius() {
        inputRadius = Math.sqrt((semiPerimeter() - a) * (semiPerimeter() - b) * (semiPerimeter() - c) / semiPerimeter());
        return inputRadius;
    }
    public double side(char parameter) {
        double answer;
        switch (parameter) {
            case 'o':
                answer = outRadius * 4 * area / (b * c);
                break;
            case 'i':
                answer = semiPerimeter() - (Math.pow(inputRadius, 2) * semiPerimeter() / (semiPerimeter() - b) * (semiPerimeter() - c));
                break;
            case 'p':
                answer = perimeter - b - c;
                break;
            case 'a':
                answer = area / height * 2;
                break;
            case 'h':
                answer = Math.sqrt(Math.pow(b, 2) - Math.pow(height, 2)) + Math.sqrt(Math.pow(c, 2) - Math.pow(height, 2));
                break;
            case 't':
                double temp = 2 * b * c * round(Math.cos((180 - cornerA) / 180 * Math.PI), -10);
                answer = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - temp);
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
                answer = outRadius * 4 * area / (c * a);
                break;
            case 'i':
                answer = semiPerimeter() - (Math.pow(inputRadius, 2) * semiPerimeter() / (semiPerimeter() - a) * (semiPerimeter() - c));
                break;
            case 'p':
                answer = perimeter - a - c;
                break;
            case 'a':
                answer = area / heightB * 2;
                break;
            case 'h':
                answer = Math.sqrt(Math.pow(a, 2) - Math.pow(heightB, 2)) + Math.sqrt(Math.pow(c, 2) - Math.pow(heightB, 2));
                break;
            case 't':
                double temp = 2 * a * c * round(Math.cos((180 - cornerB) / 180 * Math.PI), -10);
                answer = Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2) - temp);
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
                answer = outRadius * 4 * area / (b * a);
                break;
            case 'i':
                answer = semiPerimeter() - (Math.pow(inputRadius, 2) * semiPerimeter() / (semiPerimeter() - b) * (semiPerimeter() - a));
                break;
            case 'p':
                answer = perimeter - b - a;
                break;
            case 'a':
                answer = area / heightC * 2;
                break;
            case 'h':
                answer = Math.sqrt(Math.pow(b, 2) - Math.pow(heightC, 2)) + Math.sqrt(Math.pow(a, 2) - Math.pow(heightC, 2));
                break;
            case 't':
                double temp = 2 * b * a * round(Math.cos((180 - cornerC) / 180 * Math.PI), -10);
                answer = Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2) - temp);
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}

