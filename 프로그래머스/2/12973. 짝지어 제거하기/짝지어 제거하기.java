import java.util.*;

class Solution{
    public int solution(String s){
        Stack<String> str = new Stack<>();
        for(String temp : s.split("")){
            if(str.size() > 0 && str.peek().equals(temp)){
                str.pop();
            }else{
                str.push(temp);
            }
        }
            
        int answer = (str.size() == 0) ? 1 : 0;

        return answer;
    }
}