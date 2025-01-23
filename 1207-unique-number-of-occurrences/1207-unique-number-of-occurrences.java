import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> sets = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        List<Integer> lists = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> checkDuplicateNumbers = new ArrayList<>();
        for(Integer number : sets) {
            int check = Collections.frequency(lists, number);
            if(checkDuplicateNumbers.contains(check)) {
                return false;
            }
            if(check != -1) {
                checkDuplicateNumbers.add(check);
            }
        }
        return true;
    }
}