import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> data = new ArrayList<>();
        HashMap<Integer, Integer> num1 = new HashMap<>();
        HashMap<Integer, Integer> num2 = new HashMap<>();

        for(int i=0; i<nums1.length; i++) {
            num1.put(nums1[i], 1);
        }

        for(int i=0; i<nums2.length; i++) {
            num2.put(nums2[i], 1);
        }

        List<Integer> answer = new ArrayList<>();
        for(Integer key : num1.keySet()) {
            if(!num2.containsKey(key)) {
                    answer.add(key);
            }
        }
        data.add(answer);
        answer = new ArrayList<>();
        for(Integer key : num2.keySet()) {
            if(!num1.containsKey(key)) {
                answer.add(key);
            }
        }
        data.add(answer);
        return data;

    }
}