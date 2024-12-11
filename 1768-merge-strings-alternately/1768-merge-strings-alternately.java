import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        boolean isWord1End = false;
        boolean isWord2End = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<Math.min(word1.length(), word2.length()); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            if(i == word1.length() - 1){
                isWord1End = true;
                break;
            }
            else if (i == word2.length() - 1) {
                isWord2End = true;
                break;
            }
        }
        if(isWord1End) {
            sb.append(word2.substring(Math.min(word1.length(), word2.length()), Math.max(word1.length(), word2.length())));
        }
        else {
            sb.append(word1.substring(Math.min(word1.length(), word2.length()), Math.max(word1.length(), word2.length())));
        }
        return sb.toString();
    }
}