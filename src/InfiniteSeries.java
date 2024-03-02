public class InfiniteSeries {

    public static double gauss(double x, int n) {
        double result = 1.0;
        double term = 1.0;

        for (int i = 1; i < n; i++) {

            term *= -x * x / i;

            result += term;

        }

        return result;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 5;

        double result = gauss(x, n);
        System.out.println("Result for x = " + x + " and n = " + n + ": " + result);
    }
}