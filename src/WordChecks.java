import java.util.Scanner;

public class WordChecks {

    public static boolean isAbecedarian(String myString){
        boolean isAbecedarian = true;
        int length = myString.length();
        for (int i=0; i<length - 1; i++){
            String sub1 = myString.substring(i,i+1);
            String sub2 = myString.substring(i+1, i+2);
            int diff = sub1.compareTo(sub2);
            if (diff > 0){
                isAbecedarian = false;
                break;
            }
        }
        return isAbecedarian;
    }

    public static boolean isIsogram(String myString){
        boolean isIsogram = true;
        int length = myString.length();
        for (int i=0; i<length; i++){
            char letter = myString.charAt(i);
            int count = 0;
            for (int n=0; n<length; n++){
                if (myString.charAt(n) == letter){
                    count++;
                }
            }
            if (count < 2){
                isIsogram = false;
                break;
            }
        }
        return isIsogram;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input;
        System.out.println("Please enter a string of characters: ");
        input = in.nextLine();
        System.out.println("Abecedarian: " + isAbecedarian(input));
        System.out.println("Pair Isogram: " + isIsogram(input));
    }

}
