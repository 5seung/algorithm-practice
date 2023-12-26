import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]","");
        
        int[] answer = new int[my_string.length()];
        int idx = 0;
        for(char c : my_string.toCharArray()){
            answer[idx++] = c-'0';
        }
        
        Arrays.sort(answer);
        return answer;
    }
}