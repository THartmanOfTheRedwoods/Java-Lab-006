import java.util.Scanner;
public class Lab006 {
/**Create variables n and m to use for class.*/
    int n;
    int m;
/**Create a constructor that forms an object of Lab006 using variables n and m*/
    public Lab006(int n, int m){
        this.n = n;
        this.m = m;
    }

/**Created a method that returns true if parameter n has no remainders if divided by parameter m*/
    public static boolean isDivisible(int n, int m){
        return 0 == n%m;
    }

    public static void main(String[] args) {
/**Creates a scanner variable to be called upon later.*/
        Scanner scoon = new Scanner(System.in);
        System.out.println("What is the numerator?:");
        int n = scoon.nextInt();
        System.out.println("What is the denominator?:");
        int m = scoon.nextInt();
/**Creates a new Lab006 object using the input of the user*/
        new Lab006(n,m);
/**Prints the result depending on whether or not n is evenly divided by m*/
        if (isDivisible(n,m)){
            System.out.println(n+" is evenly divisible by "+m);
        }else{
            System.out.println(n+" is not evenly divisible by "+m);
        }

    }

}
