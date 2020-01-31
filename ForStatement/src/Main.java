public class Main {

    public static void main(String[] args) {


        /*for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000, i)));
        }

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " +
                    String.format("%.2f", calculateInterest(10000, i)));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (primeNumber(i)) {
                count ++;
                System.out.println(i + " is prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }*/
    }

    /*public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }*/

    public static boolean primeNumber(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

    public static boolean primeNumber(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

