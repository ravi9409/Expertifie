package BinarySearch;

public class FirstOccuranceOfElementInSortedArray {
    public static void main(String[] args) {
        System.out.println(FirstOccuranceOfElementInSortedArray.search(new int[]{2, 4, 10,10,10, 18, 20}, 10));
    }

    public static int search(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (x == arr[mid]) {
                result = mid;
                //this is the statement which drives the whole part.
                high = mid - 1;
                //low = mid + 1;
            } else if (x < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;

    }
}