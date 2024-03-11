import java.util.Scanner;
public class MySqRoot {
    public static double squareRoot(double num) {
        double xZero = num / 2.0;
        //the zero in the formula
        double xOne = ((xZero + num / xZero)) / 2.0;
        //initial sqrt guess
        while (true) {
            //keeps looping if the difference is not less than 0.0001
            double xTwo = ((xOne + num / xOne)) / 2.0;
            if (Math.abs(xOne - xTwo) < 0.0001) {
                //if the abs diff of both guesses is less than 0.0001 than it returns xTwo
                return xTwo;
            } else {
                xOne = xTwo;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Input a number:");

        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        if (num < 0) {
            System.out.println("Error: Value must be positive");
        }
        double result = squareRoot(num);
        System.out.println("Square root of " + num + " is: " + result);
    }
}
