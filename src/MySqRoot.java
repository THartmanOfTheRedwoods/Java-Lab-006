// Written By: Austin Barnett
// Date: 2/29/2024
// Version 1.0
import java.util.Scanner;

public class MySqRoot {
    public static double squareRoot(double num) {
        double x0 = num / 2;
        double x1 = (x0 + num / x0) / 2;

        while (Math.abs(x1 - x0) >= 0.0001) {
            x0 = x1;
            x1 = (x0 + num / x0) / 2;
        }

        return x1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        System.out.println("The square root of " + num + " is " + squareRoot(num));
    }
}

