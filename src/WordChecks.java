public class WordChecks {
    public static boolean isAbecedarian(String word){
        word = word.toLowerCase();
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;

    }
    public static boolean isPairIsogram(String word){
        word = word.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c) {
                    count++;
                }
            }
            if (count == 2) {
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String word1 = "loss";//the characters are in alphabetical order so return true
        String word2 = "father";//the characters are not in alphabetical order so return false
        System.out.println(word1 + " is abecedarian: " + isAbecedarian(word1));
        System.out.println(word2 + " is abecedarian: " + isAbecedarian(word2));

        String word3 = "Aa";//occurs exactly twice in the word so return false
        String word4 = "fog"; // no letter occurs exactly twice in the word so return true
        System.out.println(word3 + " is a PairIsogram: " + isPairIsogram(word3));
        System.out.println(word4 + " is a PairIsogram: " + isPairIsogram(word4));
    }
}
