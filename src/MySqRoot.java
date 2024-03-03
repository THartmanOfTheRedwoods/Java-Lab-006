public class MySqRoot {
    public static double squareRoot(double num) {
        //Initial guess
        double x0 = num / 2.0;
        //Loops until true
        while (true) {
            // Calculates the program
            double x1 = (x0 + num / x0) / 2.0;
            // Check for convergence
            if (Math.abs(x1 - x0) < 0.0001) {
                return x1; // Returns when the difference is less than 0.0001
            }
            // Update the current approximation
            x0 = x1;
        }
    }
    public static void main(String[] args) {
        double number = 25.0; // This is just for a example
        System.out.println("Square root of " + number + " is approximately: " + squareRoot(number));

    }
}
