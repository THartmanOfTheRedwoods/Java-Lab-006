import java.util.Scanner;
public class MySqRoot {
    public static double squareRoot(double num) {
        double xZero = num / 2.0;

        while (true) {
            double xOne = xZero + num / xZero / 2.0;

            if (Math.abs(xOne - xZero) < 0.0001) {
                return xOne;
            }
            xZero = xOne;
            }
        }
        public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter any number to calculate the square root: ");
        double number = scanner.nextDouble();

        double result = squareRoot(number);
        System.out.println("The square root of " + number + " is approximately: " + result);

        scanner.close();
    }
}
