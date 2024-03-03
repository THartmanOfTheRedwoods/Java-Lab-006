/**
 * @author Alexei Iachkov
 * @date 3-2-24
 * @version 1.0
 */
import java.util.Scanner;

public class MySqRoot {
    public double squareRoot(double num) {
        double guess = num / 2.0;
        double nextGuess = (guess + (num / guess)) / 2.0;

        while (Math.abs(nextGuess - guess) >= 0.0001) {
            guess = nextGuess;
            nextGuess = (guess + (num / guess)) / 2.0;
        }

        return nextGuess;
    }

    public static void main(String[] args) {
        MySqRoot mySqRoot = new MySqRoot();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its square root: ");
        double num = scanner.nextDouble();
        System.out.println("Square root of " + num + " is: " + mySqRoot.squareRoot(num));
    }
}