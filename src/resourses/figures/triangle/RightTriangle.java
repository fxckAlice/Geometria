package resourses.figures.triangle;

import resourses.help.HelpingMethods;

public class RightTriangle extends Triangle {
    public RightTriangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public RightTriangle(){}
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
    public double area(String parameter){
        switch (parameter){
            case ("s"):
                area = a * b / 2;
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
    public double side(String parameter) {
        double answer;
        switch (parameter) {
            case "o":
                answer = HelpingMethods.pythagoreanTheorem(outRadius * 2, b, "-");
                break;
            case "m":
                answer = HelpingMethods.pythagoreanTheorem(medianC * 2, b, "-");
                break;
            case "p":
                answer = perimeter - b - c;
                break;
            case "a":
                answer = area / b;
                break;
            case "t":
                answer = HelpingMethods.pythagoreanTheorem(c, b, "-");
                break;
            case ("sin"):
                answer = HelpingMethods.round(c * Math.sin(cornerA / 180 * Math.PI), -8);
                break;
            case ("cos"):
                answer = HelpingMethods.round(c * Math.cos(cornerB / 180 * Math.PI), -8);
                break;
            case ("tan"):
                answer = HelpingMethods.round(b * Math.tan(cornerA / 180 * Math.PI), -8);
                break;
            case ("ctan"):
                answer = HelpingMethods.round(b / Math.tan(cornerB / 180 * Math.PI), -8);
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
                answer = HelpingMethods.pythagoreanTheorem(outRadius * 2, a, "-");
                break;
            case "m":
                answer = HelpingMethods.pythagoreanTheorem(medianC * 2, a, "-");
                break;
            case "p":
                answer = perimeter - a - c;
                break;
            case "a":
                answer = area / a;
                break;
            case "t":
                answer = HelpingMethods.pythagoreanTheorem(c, a, "-");
                break;
            case ("sin"):
                answer = HelpingMethods.round(c * Math.sin(cornerB / 180 * Math.PI), -8);
                break;
            case ("cos"):
                answer = HelpingMethods.round(c * Math.cos(cornerA / 180 * Math.PI), -8);
                break;
            case ("tan"):
                answer = HelpingMethods.round(a * Math.tan(cornerB / 180 * Math.PI), -8);
                break;
            case ("ctan"):
                answer = HelpingMethods.round(a / Math.tan(cornerA / 180 * Math.PI), -8);
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
                answer = outRadius * 2;
                break;
            case "m":
                answer = medianC * 2;
                break;
            case "p":
                answer = perimeter - a - b;
                break;
            case "t":
                answer = HelpingMethods.pythagoreanTheorem(b, a, "+");
                break;
            case ("sinA"):
                answer = HelpingMethods.round(a / Math.sin(cornerA / 180 * Math.PI), -8);
                break;
            case ("cosA"):
                answer = HelpingMethods.round(b / Math.cos(cornerA / 180 * Math.PI), -8);
                break;
            case ("sinB"):
                answer = HelpingMethods.round(b / Math.sin(cornerB / 180 * Math.PI), -8);
                break;
            case ("cosB"):
                answer = HelpingMethods.round(a / Math.cos(cornerB / 180 * Math.PI), -8);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }

}
