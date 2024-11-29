
public class PrimeFactorUsingSqaureRoot {
    public static void main(String[] args) {
        int a = 17;
        System.out.println(isPrime(a));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}