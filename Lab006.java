import java.util.Scanner;
//Ledger Dare, 10/5/2022
public class Lab006 {
    int n;
    int m;

    /**
     * Checks instance variable n to see if it is divisible by instance variable m.
     *
     * @return      boolean value true or false
     */
    public boolean IsDivisible() {
        if(n%m==0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);

        System.out.println("Enter your first integer:");
        int int1 = intput.nextInt();
        System.out.println("Enter your second integer:");
        int int2 = intput.nextInt();

        Lab006 calc = new Lab006(int1, int2);
        boolean result = calc.IsDivisible();

        if (result){
            System.out.println(calc.n + " is divisible by " + calc.m);
        } else {
            System.out.println(calc.n + " is not divisible by " + calc.m);
        }
    }

    /**
     * Constructor for Lab006
     * Sets the first integer as the instance variable n and the second to m.
     *
     * @param n     integer assigned to instance variable n (dividend)
     * @param m     integer assigned to instance variable m (divisor)
     */
    public Lab006 (int n, int m) {
        this.n = n;
        this.m = m;

    }
}
