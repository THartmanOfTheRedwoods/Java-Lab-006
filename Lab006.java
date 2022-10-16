import java.util.Scanner;

/**
 * Brennan Duffy
 * 10/5/22
 */
public class Lab006 {
    private int m;
    private int n;

    /**
     * Class designed to check if one int is divisible by another
     * @param m the denominator
     * @param n the numerator
     */
    public Lab006(int m, int n) {
        this.m = m;
        this.n = n;
    }

    /**
     * Determines if n is evenly divisible by m
     * @return whether n is divisible by m
     */
    public boolean isDivisible() {
        return n % m == 0;
    }

    /**
     * Gets ints from user and determines their divisibility
     * @param args defaults args param (unused)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("m: ");
        int m = scanner.nextInt();
        System.out.print("n: ");
        int n = scanner.nextInt();

        Lab006 labInstance = new Lab006(m, n);
        System.out.printf("Is n evenly divisible by m? %s ( %d %% %d = %d)", labInstance.isDivisible() ? "Yes!" : "No!", n, m, n%m);
    }
}
