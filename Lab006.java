/**
 * @author Joseph A Freedman
 * @Date 10/5/2022
 *
 * This program checks if the remainder of two numbers is equal to zero or not,
 * and returns a boolean value. A remainder of zero would return true, false if otherwise.
 *
 */


/**
 * This is the list of imports, which is only one.
 */

import java.util.Scanner;


/**
 * This is our Lab006 class, which contains two instance variables,
 * the Lab006 constructor, isDivisible method, and the main method.
 */
public class Lab006 {
    public int n;
    public int m;

    /**
     * This is our class constructor. It takes two integers as parameters.
     * @param n is the first integer
     * @param m is the second integer
     */
    public Lab006 (int n, int m) {
        this.n = n;
        this.m = m;

    }

    /**
     * This is our isDivisible method, and it returns a boolean value.
     * @isDivisible returns true if the remainder is zero, false if otherwise.
     * @return boolean
     */
        public boolean isDivisible () {
            if (n % m == 0) {
                return true;
            } else {
                return false;
            }
    }

    /**
     * @main
     *
     * This is our main method of Lab006.
     * The scanner asks the user for the first integer, and then the second integer.
     *
     * Lastly, we initialize the Lab006 class constructor and print the boolean output.
     *
     * @String String[] args
     */
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int n = scanner.nextInt();

        System.out.println("Enter the second integer: ");
        int m = scanner.nextInt();

        Lab006 lab006 = new Lab006(n, m);
        System.out.println(lab006.isDivisible());
        }
}
