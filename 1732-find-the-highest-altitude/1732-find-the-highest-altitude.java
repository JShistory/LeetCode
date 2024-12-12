import java.util.*;
class Solution {
    public int largestAltitude(int[] gain) {
        int[] sum = new int[gain.length + 1];
        sum[0] = 0;
        int answer = 0;
        for(int i=0; i<gain.length; i++) {
            sum[i+1] = sum[i] + gain[i];
            answer = Math.max(answer, sum[i+1]);
        }
        return answer;
    }
}