
public class PrimeFactorUsingSqaureRoot {
    public static void main(String[] args) {
        int a = 17;
        System.out.println(isPrime(a));
    }

    public static boolean isPrime(int N) {
        for (int i = 2; i <= (int) Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}