import java.util.Scanner;

public class MySqRoot {
    public static double squareRoot (double num) {
        double x0 = num / 2;
        double x1 = (x0 + num / x0) / 2;

        while (Math.abs(x1 - x0) >= 0.0001) {
            x0 = x1;
            x1 = (x0 + num / x0) / 2;
        }
        return x1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's approximate the square root of a number!");
        System.out.print("Provide a number: ");
        double num = in.nextDouble();
        System.out.printf("The approximate square root of %.2f is %f.", num, squareRoot(num));
    }
}
