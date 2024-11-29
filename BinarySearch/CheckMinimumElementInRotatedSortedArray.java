public class CheckMinimumElementInRotatedSortedArray {
    public static void main(String[] args) {
        int[] a = { 5, 6, 7, 1, 2, 3, 4 };
        System.out.println(isSortedAndRotated(a));
    }

    public static int isSortedAndRotated(int[] nums) {
        if (nums[0] < nums[nums.length - 1])
            return nums[0];
        else {
            int low = 0;
            int high = nums.length - 1;
            int mid = 0;
            while (low <= high) {
                mid = (low + high) / 2;
                if (nums[mid - 1] > nums[mid]) {
                    return mid;
                } else if (nums[mid] > nums[high]) {
                    low = mid + 1;
                } else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
