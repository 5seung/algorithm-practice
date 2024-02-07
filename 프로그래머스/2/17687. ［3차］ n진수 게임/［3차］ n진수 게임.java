import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        // 1p > idx = 0m+p-1 0
        // 2p > idx = 1m+p-1 2
        // 3p > idx = 2m+p-1 4
        // tp > idx = (t-1)m+p-1
        String str = "";
        int i = 0;
        while(str.length() < (t-1)*m+p){
            str += Integer.toString(i++,n); 
        }
        
        String answer = "";
        for(i = 0; i<t ; i++){
            answer += str.charAt(i*m+p-1);
        }
        return answer.toUpperCase();
    }
}