/**
 *
 * Shawn Chappelle 10/5/2022
 *
 **/
import java.util.Scanner;
public class Lab006 {
    public int n;
    public int m;
    /**
     * Constructor for Lab006
     * @param: integers n and m
     * @return none for constructor
     **/
    public Lab006(int n, int m){
        int nLab006 = n;
        int mLab006 = m;

    }
    /**
     * Method checks if n is divisible by m
     * @param: integers n and m
     * @return boolean for if statement in main
     **/
    public boolean isDivisible(int n, int m){
        if (n%m==0){
            return true;
        }
        else if (n%m!=0) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Insert one integer, press enter, and repeat: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Lab006 lab006 = new Lab006(n,m);
        if (lab006.isDivisible(n,m) == true){
            System.out.printf(n + " is divisible by " + m );
        }
        else if (lab006.isDivisible(n,m) == false){
            System.out.printf(n + " is not divisible by " + m );
        }
    }
}

