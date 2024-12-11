import java.util.*;
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double answer = Integer.MIN_VALUE;
        double max = 0;
        for(int i=0; i<k; i++) {
            max += nums[i];
        }
        double maxSum = max;
        for(int i=0; i<nums.length- k; i++) {
            max -= nums[i];
            max += nums[i + k];

            if (maxSum < max) {
                maxSum = max;
            }
        }
        return maxSum / k;
    }
}