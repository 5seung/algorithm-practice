import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(citations);
        while(true){
            cnt = 0;
            for(int i : citations){
                if(answer<=i)
                    cnt++;
            }
            if(answer > cnt){
                answer--;
                break;
            }
            answer++;
        }
        return answer;
    }
}