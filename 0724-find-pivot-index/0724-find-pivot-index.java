import java.util.*;
class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;
        for(int i=0; i<nums.length; i++) {
            rightSum += nums[i];
        }
        int leftSum = 0;
        rightSum -= nums[0];
        if (rightSum == 0) {
            return 0;
        }
        for(int i=1; i<nums.length; i++) {
            leftSum += nums[i-1];
            rightSum -= nums[i];
            if(leftSum == rightSum) {
                return i;
            }
            
        }
        return -1;
    }
}