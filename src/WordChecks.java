public class WordChecks {

    public static boolean isPairIsogram(String word) {
        word = word.toLowerCase();
        int[] letterCounts = new int[26];
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                letterCounts[index]++;
            }
        }
        for (int count : letterCounts) {
            if (count != 0 && count != 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPairIsogram("abba"));
        System.out.println(isPairIsogram("hello"));
    }
}
