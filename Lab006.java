import java.util.Scanner;

public class Lab006 {
    //What happens if you invoke a value method and don't do anything with the returned result;
    //that is, if you don't assign the returned result to a variable or use it as part of a larger expression?
    //Nothing. nothing happens, we simply don't store the result of the method.

    /*
    public static int Converter (int i1) {
        return i1 + 2;
    }*/

    /**
     * Lab006 takes two parameters and creates integers with them
     * it is a useless constructor
     */

    int n;
    int m;

    public Lab006(int i1, int i2) {
        n = i1;
        m = i2;
    }
    public static boolean isDivisible (int i1, int i2) {
        return i1%i2 == 0;
    }

    public static void main(String[] args) {
        //these lines are for checking what happens if you do nothing with a returned value.
        //Converter(5);
        System.out.println("ding!"); // the ding! is here to make sure the code runs. it does.

        Lab006 MyObj = new Lab006(0,0);
        Scanner scan = new Scanner(System.in); //create scanner so we can get user input
        System.out.println("Give me a number: "); //ask for number
        MyObj.n = scan.nextInt(); //get number
        System.out.println("Check if it is divisible by: "); //ask for divisor
        MyObj.m = scan.nextInt(); //get divisor
        System.out.println(isDivisible(MyObj.n,MyObj.m)); //check if divisible and tell user
    }

}
