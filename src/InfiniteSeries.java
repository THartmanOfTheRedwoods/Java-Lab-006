public class InfiniteSeries {

    public static double gauss(double x, int n) {
        double result = 1.0;
        double term = 1.0;

        for (int i = 1; i < n; i++) {
            term *= (-1) * x * x / i;

            result += term;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(gauss(2,4));
    }
}

