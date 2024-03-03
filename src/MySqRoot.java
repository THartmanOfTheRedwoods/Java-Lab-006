import java.util.Scanner;

public class MySqRoot {

    public static double squareRoot(double num) {
        double guess = num / 2;
        int exitCounter = 2;
        double threshold = 0.0001;

        do {
            double pguess = guess;
            guess = (pguess + (num / pguess)) / 2;

            double diff = Math.abs(pguess - guess);
            if(diff <= threshold) {
                exitCounter--;
            }
        } while (exitCounter > 0 );

        return guess;


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter a number to find the square root of: ");
        double num = Double.parseDouble(s.nextLine());
        System.out.println("Square root = " + squareRoot(num));
    }

}
