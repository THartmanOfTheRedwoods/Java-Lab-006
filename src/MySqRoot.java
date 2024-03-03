public class MySqRoot {
    public static double squareRoot(double num){
        double x0 = num / 2;
        double x1 = (x0 - num / x0) / 2;

        while (Math.abs(x1 - x0) >= 0.0001){
            x0 = x1;
            x1 = (x0 + num / x0) / 2;

        }
        return x0;
    }
    public static void main(String[] args) {
        double num = 10;
        System.out.println(squareRoot(num));
    }
}
