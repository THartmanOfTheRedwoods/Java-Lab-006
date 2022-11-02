import java.util.Scanner;
public class Lab006 {
    int n;
    int m;
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;
    }
    public boolean isDivisible() {
        return n % m == 0;
    }
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