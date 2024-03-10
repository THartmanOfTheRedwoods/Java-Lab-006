public class MySqRoot {

    public static double squareRoot(double num) {
        double x0 = num / 2.0; // Initial guess for square root
        double x1 = (x0 + num / x0) / 2.0; // First approximation

        // Iterate until two consecutive estimates differ by less than 0.0001
        while (Math.abs(x1 - x0) >= 0.0001) {
            x0 = x1;
            x1 = (x0 + num / x0) / 2.0;
        }

        return x1;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(16)); // Example usage: should print 4.0
    }
}
