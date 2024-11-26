package BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        System.out.println(peakElement(new int[]{1,2,1,3,5,6,4}));
    }

    public static int peakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] > nums[mid+1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;

    }
}