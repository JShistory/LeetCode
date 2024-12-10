import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=split.length-1; i>=0; i--) {
            if(split[i].trim().isEmpty()) {
                continue;
            }
            sb.append(split[i]).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}