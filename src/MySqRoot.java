import static java.lang.Math.abs;
public class MySqRoot {
    public static double squareRoot(double num) {
        double guess = num / 2;//guess is x1
        int exitCounter=2;
        double threshold = 0.0001;

        do {
            double pguess=guess;//pguess is x0
            guess=(pguess+(num/pguess))/2;

            double diff= abs(pguess-guess);
            if(diff<=threshold){
               exitCounter--;
            }
            System.out.printf("%f: %f%n",pguess,guess);
        }while (exitCounter>0);
            return guess;

    }
    public static void main(String[] args) {
        System.out.println(
                squareRoot(625.0)
        );
    }
}
