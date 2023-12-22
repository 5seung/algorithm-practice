import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : array){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        int answer = 0;
        int count = 0;
        int max = 0;
        for(int key : map.keySet()){
            count= map.get(key);
            if(count>max){
                answer = key;
                max = count;
            }else if(count == max){
                answer = -1;
            }
        }
        
        return answer;
    }
}