import java.util.Scanner;

public class MySqRoot {

    public static double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers.");
        }

        // Initial guess (num divided by 2)
        double guess = num / 2;

        // Loop until difference between guess^2 and num is less than 0.0001
        while (Math.abs(guess * guess - num) > 0.0001) {
            // Update guess using the formula
            guess = (guess + num / guess) / 2;
        }

        return guess;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its square root: ");
        double number = scanner.nextDouble();

        double approxSqrt = squareRoot(number);
        System.out.println("Square root of " + number + " (approximation): " + approxSqrt);
    }
}