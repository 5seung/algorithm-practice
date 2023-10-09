import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int tangSize = tangerine[tangerine.length-1];
        int[] tangCnt = new int[tangSize+1];
        for(int i : tangerine){
            tangCnt[i] += 1;
        }
        Arrays.sort(tangCnt);
        while(k>0){
            k-=tangCnt[tangSize];
            tangSize--;
            answer++;
        }
        
        return answer;
    }
}