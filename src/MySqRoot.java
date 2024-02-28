public class MySqRoot {

    public static void squareRoot(double num) {

        double guess = num/2;
        int exitCounter = 2;
        double threshold = 0.0001;

        do {
           double preguess = guess;
            guess = (preguess + (num/preguess)) / 2;

            double diff = Math.abs(preguess - guess);
            if(diff <= threshold){
                exitCounter--;
            }
            System.out.printf("%f - %f%n", preguess, guess);
        }while(exitCounter > 0);




    }

    public static void main(String[] args){
            squareRoot(81);
    }
}

