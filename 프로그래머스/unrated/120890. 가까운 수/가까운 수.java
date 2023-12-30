import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int cha = 100;
        for(int i : array){
            if(cha > Math.abs(i-n)){
                cha = Math.abs(i-n);
                answer = i;
            }
        }
        return answer;
    }
}