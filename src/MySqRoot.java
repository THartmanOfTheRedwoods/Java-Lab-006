import java.util.Scanner;

public class MySqRoot {
    public static double squareRoot(double num) {
        double x0 = num / 2.0;

        double x1 = (x0 + num / x0) / 2.0;

        while (Math.abs(x1 - x0) >= 0.0001) {
            x0 = x1;
            x1 = (x0 + num / x0) / 2.0;
        }

        return x1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        double num = scanner.nextDouble();
        System.out.println("Square root of " + num + " is: " + squareRoot(num));
    }
}
