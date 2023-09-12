import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Map<String, String> key = new HashMap<>();
        key.put("zero","0");
        key.put("one","1");
        key.put("two","2");
        key.put("three","3");
        key.put("four","4");
        key.put("five","5");
        key.put("six","6");
        key.put("seven","7");
        key.put("eight","8");
        key.put("nine","9");
        Set<String> keys = key.keySet();
        for(String str : keys){
            s = s.replaceAll(str, key.get(str));
        }
            
        answer = Integer.parseInt(s);
        
        return answer;
    }
}