import java.util.Scanner;

/**
 * @author Bridget Acosta
 * Date : 10/5/2022
 * created class Lab006
 */

public class Lab006 {

    /**
     * instance variable Created two integers for class Lab006 called n and m
     */
    public int n;
    public int m;

    /**
    * constructor method Lab006
     * @param n and m
     * instance variable assigned to Lab006
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    /**
     * method isDivisble references n and m
     * @return boolean true if n divisible by m
     * label and result if true
     * label and result if false
     * false if n isn't divisible by m
     */
    public Boolean isDivisible() {

        if (this.n % this.m == 0) {
            System.out.print("The first integer is divisible by the second integer. Result = "+true);
            return true;
        } else {
            System.out.print("The first integer is NOT divisible by the second integer. Result = " +false);
            return false;
        }
    }

    /**
     *
     * @param args static main method
     * s.out prompts user for two integers and stores them in local variables
     * created local variables as the arguments to the Lab006 constructor when creating a new Lab006 object
     *
     * Call isDivisible using a Lab006 object, and be sure to have code that "handles" the returned value from isDivisible
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int n = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter another integer: ");
        int m = scanner2.nextInt(); //

        Lab006 lab006 = new Lab006(n,m);
        lab006.isDivisible();

    }
}

