import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        for(int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                continue;                
            }
            for(int j=i; j<nums.length - 1; j++) {
                int temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}