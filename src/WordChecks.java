public class WordChecks {
    public static boolean isPairIsogram(String word) {
        // Convert the word to lowercase for case-insensitive comparison
        word = word.toLowerCase();

        // Create an array to count occurrences of each character
        int[] count = new int[26]; // Assuming only lowercase letters are present

        // Iterate through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                // Increment the count for the corresponding character
                count[ch - 'a']++;
            }
        }

        // Check if every letter occurs exactly twice
        for (int c : count) {
            if (c != 0 && c != 2) {
                return false;
            }
        }

        // If all letters occur exactly twice, return true
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        String word = "apple";
        System.out.println(word + " is a pair isogram? " + isPairIsogram(word));
    }
}