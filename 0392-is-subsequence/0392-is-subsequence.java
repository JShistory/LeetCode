import java.util.*;
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0) {
            return true;
        }
        else if(t.length() == 0) {
            return false;
        }
        else if(t.length() == s.length()) {
            if(s.equals(t)) {
                return true;
            }
            return false;
        }
        StringBuilder sb = new StringBuilder(t);
        int idx = sb.indexOf(String.valueOf(s.charAt(0)));
        System.out.println(idx);
        for(int i=1; i<s.length(); i++) {
            int check = sb.indexOf(String.valueOf(s.charAt(i)), idx);
            System.out.println(check);
            if(check != -1 && idx < check) {
                idx = check;
                sb.setCharAt(idx, ' ');
            }
            else { 
                return false;
            }
        }
        return true;
    }
}