import java.util.Scanner;

public class MySqRoot {
    public static void squareRoot(double num) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the square root of: " + num);
        double x0 = input.nextDouble();
        double x1, x2;
        x1 = (x0 + (num / x0)) / 2;
        while (true) {
            x2=(x1 + (num / x1)) / 2;
                    if (Math.abs(x2 - x1) > 0.0001) {
                        x1=(x2 + (num / x2)) / 2;
                    }
                else {
                        System.out.printf("%f and %f are the closest number to the actual square root of %.1f!", x1,x2,num);
                        break;
                }
            }
        }

    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("Input a double number from 0 to infinity that you would want to find the square root of.");
        double number=num.nextDouble();
        squareRoot(number);
    }
}
