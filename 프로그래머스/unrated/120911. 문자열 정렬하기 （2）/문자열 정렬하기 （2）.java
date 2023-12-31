import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        char[] arr = my_string.toCharArray();
        Arrays.sort(arr);
        
        String answer = new String(arr);
        
        
        return answer;
    }
}