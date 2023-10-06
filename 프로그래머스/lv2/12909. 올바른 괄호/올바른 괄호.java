import java.util.*;

class Solution {
    boolean solution(String s) {
        char[] chArr = s.toCharArray();
        int sum = 0;
        
        if(chArr[0]==')'){
             return false;
        }
        
        for(char c : chArr){
            if(c == '('){
                sum++;
            }else{
                sum--;
            }
            
           if(sum < 0 ){
               return false;
           }
            
        }
        
        boolean answer = sum==0 ? true : false;

        return answer;
    }
}