public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] a = { 3,1};
        int target = 1;
        System.out.println(rotatedSortedArray(a, target));
    }

    public static int rotatedSortedArray(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int target1 = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid])
                return mid;
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
