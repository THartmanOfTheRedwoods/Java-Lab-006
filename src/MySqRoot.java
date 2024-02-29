public class MySqRoot {
    public static void main(String[] args) {
        squareRoot(10);
    }

    public static void squareRoot(double num) {
        double x = num / 2;
        double prevX = x;

        while (Math.abs(x * prevX - num) > 0.0001) {
            prevX = x;
            x = (prevX + num / prevX) / 2;
        }
        System.out.println(x);
    }
}
