public class FindGCDOfANumber {
    public static void main(String[] args) {
        System.out.println(findGCDUsingEuclid(12, 30));
    }

    /*
     * public static int findGCD(int num1, int num2) {
     * int ans = 0;
     * for (int i = 2; i < Math.min(num1, num2); i++) {
     * if (num1 % i == 0 && num2 % i == 0)
     * ans = i;
     * }
     * return ans;
     * }
     */

    public static int findGCDUsingEuclid(int num1, int num2) {
        if (num2 == 0)
            return num1;
        return findGCDUsingEuclid(num2, num1 % num2);
    }
}
