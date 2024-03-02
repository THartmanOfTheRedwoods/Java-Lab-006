public class MySqRoot {
    public static double squareRoot(double num) {
        // initial guess for the square root
        double x0 = num / 2.0;

        // loop until two consecutive estimates differ by less than 0.0001
        while (true) {
            // calculate the next guess
            double x1 = (x0 + num / x0) / 2.0;

            // check if difference < 0.0001
            if (Math.abs(x1 - x0) < 0.0001) {
                return x1;
            }

            // update
            x0 = x1;
        }
    }

    public static void main(String[] args) {
        double number = 25.0;
        double sqrtApproximation = squareRoot(number);
        System.out.println("Square root approximation of " + number + ": " + sqrtApproximation);
    }
}
