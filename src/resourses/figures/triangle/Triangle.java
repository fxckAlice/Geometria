package resourses.figures.triangle;

import resourses.help.HelpingMethods;

public class Triangle extends IsoscelesTriangle {
    protected double c, medianC,heightC, bisectorC, cornerA, cornerB, cornerC;
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(){}
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
    public double median(){
        median = 0.5 * Math.sqrt(2 * Math.pow(b, 2) + 2 * Math.pow(c, 2) - Math.pow(a, 2));
        return median;
    }
    public double medianB(){
        medianB = 0.5 * Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(c, 2) - Math.pow(b, 2));
        return medianB;
    }
    public double medianC(){
        medianC = 0.5 * Math.sqrt(2 * Math.pow(a, 2) + 2 * Math.pow(b, 2) - Math.pow(c, 2));
        return medianC;
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
    public double area(String parameter){
        switch (parameter){
            case ("b"):
                area = heightB * b / 2;
                break;
            case ("a"):
                area = height * a / 2;
                break;
            case ("c"):
                area = heightC * c / 2;
                break;
            default:
                System.out.println("Enter correct parameter.");
                area = -1;
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
    public double side(String parameter) {
        double answer;
        switch (parameter) {
            case "o":
                answer = outRadius * 4 * area / (b * c);
                break;
            case "i":
                answer = semiPerimeter() - (Math.pow(inputRadius, 2) * semiPerimeter() / (semiPerimeter() - b) * (semiPerimeter() - c));
                break;
            case "p":
                answer = perimeter - b - c;
                break;
            case "a":
                answer = area / height * 2;
                break;
            case "h":
                answer = HelpingMethods.pythagoreanTheorem(b, height,"-") + HelpingMethods.pythagoreanTheorem(c, height, "-");
                break;
            case "t":
                double temp = 2 * b * c * Math.cos(cornerA / 180 * Math.PI);
                answer = HelpingMethods.round(Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2) - temp), -8);
                break;
            case "m":
                answer = HelpingMethods.round(Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(c, 2)) - Math.pow(median * 2, 2)), -7);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double sideB(String parameter) {
        double answer;
        switch (parameter) {
            case "o":
                answer = outRadius * 4 * area / (c * a);
                break;
            case "i":
                answer = semiPerimeter() - (Math.pow(inputRadius, 2) * semiPerimeter() / (semiPerimeter() - a) * (semiPerimeter() - c));
                break;
            case "p":
                answer = perimeter - a - c;
                break;
            case "a":
                answer = area / heightB * 2;
                break;
            case "h":
                answer = HelpingMethods.pythagoreanTheorem(a, heightB, "-") + HelpingMethods.pythagoreanTheorem(c, heightB, "+");
                break;
            case "t":
                double temp = 2 * a * c * Math.cos(cornerB / 180 * Math.PI);
                answer = HelpingMethods.round(Math.sqrt(Math.pow(a, 2) + Math.pow(c, 2) - temp), -8);
                break;
            case "m":
                answer = HelpingMethods.round(Math.sqrt(2 * (Math.pow(a, 2) + Math.pow(c, 2)) - Math.pow(medianB * 2, 2)), -7);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double sideC(String parameter) {
        double answer;
        switch (parameter) {
            case "o":
                answer = outRadius * 4 * area / (b * a);
                break;
            case "i":
                answer = semiPerimeter() - (Math.pow(inputRadius, 2) * semiPerimeter() / ((semiPerimeter() - b) * (semiPerimeter() - a)));
                break;
            case "p":
                answer = perimeter - b - a;
                break;
            case "a":
                answer = area / heightC * 2;
                break;
            case "h":
                answer = HelpingMethods.pythagoreanTheorem(b, heightC, "-") + HelpingMethods.pythagoreanTheorem(a, heightC,"-");
                break;
            case "t":
                double temp = 2 * b * a * Math.cos(cornerC / 180 * Math.PI);
                answer = HelpingMethods.round(Math.sqrt(Math.pow(b, 2) + Math.pow(a, 2) - temp), -8);
                break;
            case "m":
                answer = HelpingMethods.round(Math.sqrt(2 * (Math.pow(b, 2) + Math.pow(a, 2)) - Math.pow(medianC * 2, 2)), -7);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
}

