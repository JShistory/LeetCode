import java.util.*;
class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int right;
        for(right = 0; right<nums.length; right++) {
            if (nums[right] == 0) {
                k--;
            }

            if (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }
            if (k >= 0) {
                count = Math.max(count, right - left + 1);
            }
        }
        return count;
    }
}