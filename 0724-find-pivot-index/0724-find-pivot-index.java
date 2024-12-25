import java.util.*;
class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int leftSum = 0;
            for(int left=0; left<i; left++) {
                leftSum += nums[left];
            }
            int rightSum = 0;
            for(int right=nums.length-1; right > i; right--) {
                rightSum += nums[right];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}