import java.util.*;
class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int answer = 0;
        int maxCount = 0;
        Set<Character> vowels = Set.of('a','e','i','o','u');
        for(int i=0; i<k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count++;
            }
        }
        maxCount = count;
        for(int i=0; i<s.length() - k; i++) {
            if (vowels.contains(s.charAt(i))) {
                count--;
            }
            if (vowels.contains(s.charAt(i+k))) {
                count++;
            }

            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}