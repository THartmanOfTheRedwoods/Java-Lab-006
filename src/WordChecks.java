public class WordChecks {
    public static void main(String[] args) {
        System.out.println(isAbecedarian("biopsy"));
        System.out.println(isPairIsogram("abba"));
    }

    public static boolean isAbecedarian(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPairIsogram(String word) {
        word = word.toLowerCase();

        int[] counts = new int[26];

        for (int count : counts) {
            if (count != 0 && count != 2) {
                return false;
            }
        }
        return true;
    }
}
