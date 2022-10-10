/**
 * Prompts the user for two integers, then states if the first integer is evenly divisible by the second.
 * @Author
 * Taro Oshiro
 * @Version
 * 1.0
 * @since
 * 10-05-2022
 */

import java.util.Scanner;
public class Lab006 {
    int n;
    int m;

    /**
     * The constructor for the class Lab006, sets instance variables, this.n and this.m equal to arguments n and m
     * @param n The first integer parameter in constructor
     * @param m The second integer parameter in constructor
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }

    /**
     * Tests if integer 1 is evenly divisible by integer 2
     * @return True if integer 1 is evenly divisible by integer 2, else False
     */
    public boolean isDivisible() {
        return n % m == 0;
    }

    /**
     * The main method of the Lab006 class which makes use of the Lab006 constructor and isDivisible method
     * @param args Unused
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose an integer:");
        int line1 = in.nextInt();
        System.out.println("Choose another integer:");
        int line2 = in.nextInt();
        Lab006 numbers = new Lab006(line1, line2);
        boolean endProduct = numbers.isDivisible();
        System.out.printf("The integer %d is evenly divisible by %d: %b",line1,line2,endProduct);
    }
}
