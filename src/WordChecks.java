public class WordChecks {
    public static boolean isAbecedarian(String abc) {
        //int index = 0;
        int index = 1;


        while (index < abc.length()) {
            if (abc.charAt(index - 1) > abc.charAt(index)) {
                return false;
            }
            //int i = index + 1;
            index ++;
        }
        return true;
    }

    public static boolean isPairIsogram(String aabb) {
//couldn't figure it out
        for (int a = 1; a < aabb.length(); a++ ) {
            char c = aabb.charAt(a - 1);
            if (aabb.indexOf(c) != aabb.lastIndexOf(c)){
                return false;
            }

        }
        return true;

    }
    public static void main(String[] args) {

        String abc = "aabb";
        System.out.println(isAbecedarian(abc));
        System.out.println(isPairIsogram(abc));


    }
}
