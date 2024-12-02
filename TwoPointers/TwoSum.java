package TwoPointers;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        int target = 6;
        for (int s1 : twoSum(arr, target))
            System.out.println(s1);
    }
    
    //Using Two pointer
    /*public static int[] twoSum(int[] nums, int target) {
        int[] arr1 = new int[2];
        int low = 0;
        int high = low + 1;
        for (int i = 0; i < nums.length; i++) {
            while (low <= high) {
                if (nums[low] + nums[high] == target) {
                    arr1[0] = low;
                    arr1[1] = high;
                    return arr1;
                } else if (high == nums.length - 1) {
                    ++low;
                    high = low + 1;
                } else {
                    high++;
                }
            }
        }*/
        //Using Brute Force
        /*for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr1[0] = i;
                    arr1[1] = j;
                }
            }
        }*/
        return arr1;
    }
}