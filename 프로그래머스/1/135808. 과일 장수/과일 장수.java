import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int len = score.length;
        int answer = 0;
        for(int i = 1; i<=len/m; i++){
            answer += score[len - (m*i)]*m;
        }
        return answer;
    }
}