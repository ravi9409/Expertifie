public class FindSingleElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = { 1,1,2 };
        System.out.println(singleElement(arr));
    }

    public static int singleElement(int[] nums) {
        
        int low = 2;
        int high = nums.length - 1;
        int mid=0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            else if (mid % 2 == 0) {
                if (nums[mid - 1] == nums[mid])
                    high = mid - 2;
                else
                    low = mid + 2;
            } else {
                if (nums[mid - 1] == nums[mid])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return nums[mid];

    }

}