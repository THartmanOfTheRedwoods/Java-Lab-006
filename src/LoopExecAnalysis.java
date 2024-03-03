public class LoopExecAnalysis {
    public static void loop(int n) {
        int i = n;
        while (i > 1) {
            System.out.println(i);
            if (i % 2 == 0) {
                i = i / 2;
            } else {
                i = i + 1;
            }
        }
    }

    public static void main(String[] args) {
        loop(10);
    }
}
//Iteration	Value of i	Value of n
//       1	         10         10
//       2	         5	        10
//       3	 	     6          10
//       4	 	     3          10
//       5	 	     4          10
//       6	 	     2          10
//       7	 	     1          10