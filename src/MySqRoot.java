public class MySqRoot {

    public static double squareRoot(double num) {
        double x0 = num / 2; // Initial guess for square root
        double x1; // Next guess for square root

        do {
            x1 = (x0 + num / x0) / 2;
            if (Math.abs(x1 - x0) < 0.0001) {
                break; // If the difference is less than 0.0001, exit the loop
            }
            x0 = x1; // Update the previous guess with the new guess
        } while (true);

        return x1; // Return the approximation of the square root
    }

    public static void main(String[] args) {
        double num = 16; // Example number
        System.out.println("Square root of " + num + " is approximately: " + squareRoot(num));
    }
}