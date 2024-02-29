import java.util.Scanner;

/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * February 28, 2024
 *
 */
public class MySqRoot {
    public static double squareRoot(double num) {
        double one = num / 2;
        double threshold = 0.0001;

        do {
            double two = one;
            one = two + (num / two) / 2;
            double difference = Math.abs(two - one);
            if (difference < threshold) {
                System.out.printf("%f : %f%n", two, one);
            }
        }
        return one;
    }

    public static void main(String[] args) {
        squareRoot(101);
    }
}