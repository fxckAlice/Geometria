package help;

public class HelpingMethods {
    public double quadraticEducation(double a, double b, double c){
        double answer;
        double D = Math.pow(b, 2) - 4 * a * c;
        if(D < 0){
            System.out.println("Discriminant less than 0");
            answer = -1;
        }
        else {
            double x1 = (-1 * b + Math.sqrt(D)) / (2 * a);
            double x2 = (-1 * b - Math.sqrt(D)) / (2 * a);
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
        return answer;
    }
    public double round(double x, int dozen){
        double rounding = Math.pow(10, dozen);
        int temp;
        if(dozen < -9 | dozen > 9){
            System.out.println("Out of range");
            return  -1;
        }
        else{
            if(x % rounding >= 5 * Math.pow(10, dozen - 1)){
                temp = (int)(x / rounding) + 1;
            }
            else {
                temp = (int)(x / rounding);
            }
            return temp * rounding;
        }
    }
    public double pythagoreanTheorem(double a, double b, char action){
        double answer;
        switch (action){
            case ('+'):
                answer = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                break;
            case ('-'):
                answer = Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2));
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    public double pythagoreanTheorem(double a, char action){
        double answer;
        switch (action){
            case ('+'):
                answer = Math.sqrt(Math.pow(a, 2) * 2);
                break;
            case ('-'):
                answer = Math.sqrt(Math.pow(a, 2) / 2);
                break;
            default:
                System.out.println("Enter correct parameter.");
                answer = -1;
        }
        return answer;
    }
    }
