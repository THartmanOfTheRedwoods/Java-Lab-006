/*
    Kodiak Drake
    tbh I'm a little confused on what part 3 is asking, but I'm going to try my best
 */

import java.util.Scanner;
public class Lab006 {
    int n = 0;
    int m = 0;


    public Lab006(int nana, int momo) {
        // this method is setting the instance variables of n and m equal to the local variables I pass it when I call the method
        n = nana;
        m = momo;
    }

    public boolean isDivisible() {
        // this method checks if n is divisible by m
        return n%m == 0;
    }

    public static void main (String[] args) {
        // this method is the main, and therefore the brain of the program
        int night = 0;
        int monday = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Input your dividend:");
        night = input.nextInt();
        System.out.println("Input your divisor:");
        monday = input.nextInt();
        Lab006 lab = new Lab006(night, monday);
        if (lab.isDivisible() == true) {
            System.out.printf("%s is indeed divisible by %s!",night,monday);
        } else {
            System.out.printf("%s is NOT divisible by %s!",night,monday);
        }
    }
}