import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> lst = new ArrayList<>();
        for(int i : numlist){
            if(i%n==0){
                lst.add(i);
            }
        }
        
        int[] answer = lst.stream()
                          .mapToInt(i -> i)
                          .toArray();
        return answer;
    }
}