import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> typeCnt = new HashMap<>();
        
        for(int i = 0; i<survey.length; i++){
            if(choices[i]<4){
                typeCnt.put(survey[i].charAt(0), typeCnt.getOrDefault(survey[i].charAt(0) ,0) + 4-choices[i]);
            }else if(choices[i]>4){
                typeCnt.put(survey[i].charAt(1), typeCnt.getOrDefault(survey[i].charAt(1) ,0) + choices[i]-4);
            }
        }
        
        char[][] type = {{'R','T'},{'C','F'},{'J','M'},{'A','N'}};
        String answer = "";
        for(char[] t : type){
            answer += (typeCnt.getOrDefault(t[0],0) < typeCnt.getOrDefault(t[1],0)) ? t[1] : t[0];
        }
        
        return answer;
    }
}
