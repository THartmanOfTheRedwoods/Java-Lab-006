/**
 * @author Trevor Hartman
 * @date 3-2-24
 * @version 1.0
 */
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
