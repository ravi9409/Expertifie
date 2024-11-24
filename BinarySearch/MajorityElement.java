package BinarySearch;

public class MajorityElement {
    public static void main (String[] args) {
        int[] nums= {3,3,4};
        System.out.println(majorityElement(nums));
//        System.out.println(Integer.MAX_VALUE);
    }

    public static int majorityElement(int[] nums){
        //based on moore's algorithm
        int candidate=nums[0];
        int vote=1;
        for (int i=0;i<nums.length-1;i++){
            if (vote == 0)
                candidate = nums[i + 1];

            if(candidate==nums[i+1]) {
                ++vote;
            }
            else {
                --vote;
            }
        }
        return candidate;
    }
}