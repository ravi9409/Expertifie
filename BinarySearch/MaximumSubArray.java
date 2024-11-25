package BinarySearch;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
//        System.out.println(Integer.MAX_VALUE);
    }

    public static int maxSubArray(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maxSum = Math.max(maxSum, currentSum);
            //Below is very imp factor for Kadane's algo if value goes to negetive then initialize to 0
            //maxium subarray is obtained based on this condition only.
            if(currentSum<0)
                currentSum=0;
        }
        return maxSum;
    }
}