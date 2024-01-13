import java.util.Scanner;

public class MySqRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number you wish to find the square root of: ");
        double number = input.nextDouble();
        double sqrt = squareRoot(number);
        System.out.printf("The square root of %.2f is about %.4f\n", number, sqrt);
    }


    public static double squareRoot(double number) {
        double x = number / 2;
        while (Math.abs(x * x - number) > 0.0001) {
            x = (x + number / x) / 2;
        }
        return x;
    }

}
