import java.util.Scanner;

public class InfiniteSeries {
    public static double gauss(double x, int n) {
        double term = 1;
        double sum = 1;
        double xPower = 1;

        for (int i = 1; i < n; i++) {
            xPower *= x * x;
            term *= -1.0 * xPower / i;
            sum += term;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter a number for n: ");
        int n = scanner.nextInt();
        System.out.println("The sum of the first " + n + " terms of the series for x = " + x + " is " + gauss(x, n));
        scanner.close();
    }
}
