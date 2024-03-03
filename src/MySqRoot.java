import java.util.Scanner;

public class MySqRoot {

    public static double squareRoot(double num){
        double guess = num / 2;
        while (Math.abs(guess - ((guess + num/guess) / 2)) > 0.0001){
            guess = (guess + num/guess) / 2;
        }
        return guess;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive real number: ");
        if (!in.hasNextDouble()){
            System.err.println("Value must be a positive real number");
        }
        else{
            double input = in.nextDouble();
                if (input < 0){
                    System.err.println("Value must be a positive real number.");
                    return;
                }
            double approx = squareRoot(input);
            System.out.printf("The square root of %f is approximately %.4f", input, approx);
        }

    }
}
