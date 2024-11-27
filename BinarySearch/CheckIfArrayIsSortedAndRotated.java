public class CheckIfArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] a = { 1, 1, 1 };
        System.out.println(isSortedAndRotated(a));
    }

    public static boolean isSortedAndRotated(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= nums[(i + 1) % nums.length]){
                    count++;
            }
        }
        return count == 1;
    }
}
