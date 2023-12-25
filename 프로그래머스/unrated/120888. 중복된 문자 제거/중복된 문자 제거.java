import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");
        Set<String> set = new LinkedHashSet<>();
        for(String s : str){
            set.add(s);
        }
        
        String answer = "";
        for(String s : set){
            answer += s;
        }
        return answer;
    }
}