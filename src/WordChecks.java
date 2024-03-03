public class WordChecks {

    public static boolean isAbecedarian(String word) {
        int length = word.length();
        for (int i = 0; i < length - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false;
            }
        }
        return true;
}
public static boolean isPairIsogram(String word) {
    word = word.toLowerCase();
    int [] letterCounts = new int [26];
    for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);
        if (Character.isLetter(c)){
            letterCounts[c - 'a']++;
        }
    }
    for (int count : letterCounts) {
        if (count != 0 && count != 2) {
            return false;
        }
    }
    return true;
}
public static void main (String[] args) {
        System.out.println(isAbecedarian("abcdef"));
        System.out.println(isAbecedarian("greetings"));

        System.out.println(isPairIsogram("aabbcc"));
        System.out.println(isPairIsogram("aabbc"));
    }
}