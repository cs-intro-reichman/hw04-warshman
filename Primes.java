public class Primes {
    public static void main(String[] args) {
        int upTo = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + upTo + ":");
        int counter = 0;
        int i = 2;
        while (i <= upTo) {
            // is i prime or not -> if its true up counter 1, if not do nothing
            //outside the loop for i increment i by 1
            int divisible = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    divisible++;
                }
            }
            if (divisible == 0) {
                    counter++;
                    System.out.println(i);
                } else {
                    
                }
            i++;
        }

        int percent = (int) ((counter + 0.0)/upTo * 100);

        System.out.println("There are " + counter+ " primes between 2 and " + upTo + " ("+ percent + "% are primes)");


    }
}