package BinarySearch;

public class FirstAndLastOccuranceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        for (int s1 : searchRange(arr, target))
            System.out.println(s1);
    }

    public static int[] searchRange(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = findOccurrence(arr, target, true);
        result[1] = findOccurrence(arr, target, false);
        return result;
    }

    private static int findOccurrence(int[] arr, int x, boolean findFirst) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == arr[mid]) {
                result = mid;
                if (findFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}