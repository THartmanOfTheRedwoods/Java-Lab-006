
import java.util.Arrays;

public class WordChecks {
    public static void isAbecedarian(String x) {
       int length=x.length();
        int i=0;
       while (i>=0){
           if (x.charAt(i)< x.charAt(i+1)){
               i++;
               if (i==(length-1)){
                  System.out.println("True. It is Abecedarian!");
                   break;
               }
               else {
                   continue;
               }
           }
           else {
               System.out.println("False. It is not Abecedarian.");
               break;
           }
       }


    }
    public static void isPairIsogram(String x) {
        String s = x.toLowerCase();
        char[] str = s.toCharArray();
        Arrays.sort(str);
        String newString = new String(str);

        int i = 0;
        while (i < newString.length()) {
            try {
                if (newString.charAt(i) == newString.charAt(i + 1)) {
                    i = i + 2;
                    if (i == newString.length()) {
                        System.out.println("The String is an Isogram");
                        break;
                    }
                } else if (newString.charAt(i) != newString.charAt(i + 1)) {
                    System.out.println("The string is not an Isogram");
                    break;
                }
            } catch (StringIndexOutOfBoundsException ignored) {
                System.out.println("The string is not an Isogram");
                break;
            }

        }
    }
    public static void main(String[] args) {
        isAbecedarian("abcdef");
        isPairIsogram("ABBA");
    }
}
