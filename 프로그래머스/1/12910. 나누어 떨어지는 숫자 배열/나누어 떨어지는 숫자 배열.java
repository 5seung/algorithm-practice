import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {-1};
        
        List<Integer> lst = new ArrayList<>();
        for(int i : arr){
            if(i%divisor==0)
                lst.add(i);
        }
        
        if(!lst.isEmpty()){
            answer = lst.stream().mapToInt(Integer::intValue).toArray();
            Arrays.sort(answer);
        }
        
        return answer;
    }
}