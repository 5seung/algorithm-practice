import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int length = (int)(Math.log10(n)+2);
        
        for(int i = 0 ; i<= length; i++){
            answer += (n % 10);
            n /= 10;
        }
        
        return answer;
    }
}