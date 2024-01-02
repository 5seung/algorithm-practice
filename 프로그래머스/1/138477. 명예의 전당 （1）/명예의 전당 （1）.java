import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int low = score[0];
        // 명예의 전당 점수
        int[] rank = new int[k];
        for(int i = 0; i<score.length; i++){
            // 명예 전당 최저점보다 높으면 명예 전당 등록
            if(score[i] >= rank[0]){
                rank[0] = score[i];
                //오름차순 정렬 : 낮은 점수 ~ 높은 점수
                Arrays.sort(rank);
            }
            low = (i < k) ? rank[k-i-1] : rank[0];
            answer[i] = low;
        }
        return answer;
    }
}