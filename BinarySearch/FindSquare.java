package BinarySearch;

public class FindSquare {
    public static void main(String[] args) {
        System.out.println(square(50));
    }

    public static int square(int x) {
        int low = 0;
        int high = x;
        int result = 0;
        int mid = 0;
        for (int i = 0; i < x; i++)
            while (low <= high) {
                mid = (low + high) / 2;
                if (mid * mid <= x && ((mid + 1) * (mid + 1)) > x) {
                    result = mid;
                    break;
                }else if(mid*mid>x)
                    high=mid-1;
                else if(mid*mid<x)
                    low=mid+1;

            }
        return result;
    }
}