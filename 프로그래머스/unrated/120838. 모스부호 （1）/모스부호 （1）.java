import java.util.*;

class Solution {
    public String solution(String letter) {
        Map<String, String> morseMap = new HashMap<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int alpha = 97;
        for(String s : morse){
            morseMap.put(s, (char)alpha+"");
            alpha++;
        }
        
        String answer = "";
        String[] let = letter.split(" ");
        for(String s : let){
            answer += morseMap.get(s);
        }
        return answer;
    }
}