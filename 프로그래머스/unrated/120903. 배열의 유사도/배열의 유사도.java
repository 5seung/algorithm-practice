import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> str2 = Arrays.asList(s2);
        int answer = 0;
        for(String s : s1){
            answer += str2.contains(s) ? 1 : 0;
        }
        return answer;
    }
}