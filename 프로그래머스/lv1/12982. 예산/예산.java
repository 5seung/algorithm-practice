import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int totalD = 0;
        Arrays.sort(d);
        for(int i : d){
            totalD += i;
            if(totalD>budget)
                break;            
            answer++;
        }
        return answer;
    }
}