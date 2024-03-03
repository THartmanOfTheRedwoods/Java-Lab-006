import static java.lang.Math.sqrt;
import java.util.Scanner;
public class MySqRoot {
    public static double squareRoot(double num) {
       double t;
       double squareroot = num / 2;
       do {
           t = squareroot;
           squareroot = (t + (num / t)) / 2;
       }
       while ((t - squareroot)!= 0);
       return squareroot;
    }
    public static void main (String[] args) {
       Double num;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = in.nextDouble();

        System.out.println("Number : " + num);
        System.out.println("Square Root : " + squareRoot(num));
    }
}
