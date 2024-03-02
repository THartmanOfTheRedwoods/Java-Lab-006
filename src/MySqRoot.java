import java.util.Scanner;


public class MySqRoot {
    public static double squareRoot(double num) {
        double x0 = num / 2.0;

        while (true) {
            double x1 = (x0 + num / x0) / 2.0;
            if (Math.abs(x1 - x0) < 0.0001) {
                return x1;
            }
            x0 = x1;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        double num = scanner.nextDouble();

        double sqrt = squareRoot(num);
        System.out.println("Square root of " + num + " is approximately: " + sqrt);
    }


}