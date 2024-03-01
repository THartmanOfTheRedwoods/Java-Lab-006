// Written By: Austin Barnett
// Date: 2/29/1024
// Version 1.0

import java.util.Scanner;

public class WordChecks {
    public static boolean isAbecedarian(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            char current = word.charAt(i);
            char next = word.charAt(i + 1);
            if (current > next) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPairIsogram(String word) {
        int[] letterCounts = new int[26];
        String lowerCaseWord = word.toLowerCase();


        for (int i = 0; i < lowerCaseWord.length(); i++) {
            char letter = lowerCaseWord.charAt(i);
            int index = letter - 'a';
            letterCounts[index]++;
        }


        for (int i = 0; i < letterCounts.length; i++) {
            if (letterCounts[i] != 0 && letterCounts[i] != 2) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("Is the word abecedarian? " + isAbecedarian(word));
        System.out.println("Is the word a pair isogram? " + isPairIsogram(word));
        scanner.close();
    }
}
