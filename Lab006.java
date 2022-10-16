import java.util.Scanner;
public class Lab006 {
    int n;
    int m;

    public Lab006(int n, int m) {
        this.m = m;
        this.n = n;
    }

    public boolean isDivisible () {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main (String[] args) {

        Scanner numb = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = numb.nextInt();

        System.out.println("Please enter another number");
        int m = numb.nextInt();

        Lab006 lab006 = new Lab006(n, m);
        System.out.println(lab006.isDivisible());
    }
}
