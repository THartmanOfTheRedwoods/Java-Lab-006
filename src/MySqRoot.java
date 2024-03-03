public class MySqRoot {
        public static double squareRoot(double num) {
            double x0 = num / 2;
            double x1;
            do {
                x1 = (x0 + num / x0) / 2;
                if (Math.abs(x1 - x0) < 0.0001) {
                    break;
                }
                x0 = x1;
            } while (true);

            return x1;
        }
        public static void main(String[] args) {
            double num = 64;
            System.out.println("Square root of " + num + " is approximately: " + squareRoot(num));
    }
}