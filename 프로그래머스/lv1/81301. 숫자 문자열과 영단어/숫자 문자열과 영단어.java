import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arrNumStr = {"zero", "one", "two", "three", "four", "five",
                              "six", "seven", "eight", "nine"};

        for(int i=0 ; i<arrNumStr.length ; i++) {
            s = s.replace(arrNumStr[i], String.valueOf(i));
        }

        answer = Integer.parseInt(s);
        
        return answer;
    }
}