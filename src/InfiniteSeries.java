public class InfiniteSeries {
    public static double gauss(double x, int n) {
        double result = 1.0;

        double term = 1.0;
        for(int i = 1;i < n; i++) {
            term *= (-1.0 * x * x) / i;
            result += term;
        }
        return result;
    }
    public static void main(String[] args) {
        double x= 0.5;
        int n = 5;

        double result= gauss(x, n);
        System.out.println("The sum of the first " + n + " terms of the series is: " + result);
    }
}
