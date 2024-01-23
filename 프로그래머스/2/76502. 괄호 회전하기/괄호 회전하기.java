import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i<s.length(); i++){
            String strCase = s.substring(i) + s.substring(0,i);
            if(check(strCase)){
                answer++;
            }
        }
        
        return answer;
    }
    
    // 괄호 문자열 올바른지 체크
    public boolean check(String str){
        Stack<String> stack = new Stack<>();
        for(String s : str.split("")){
            if(stack.isEmpty()){
                stack.push(s);
                continue;
            }
            
            if(s.equals(")") && stack.peek().equals("(")){
                stack.pop();
            }else if(s.equals("}") && stack.peek().equals("{")){
                stack.pop();
            }else if(s.equals("]") && stack.peek().equals("[")){
                stack.pop();
            }else{
                stack.push(s);
            }
        }
                
        boolean answer =  (stack.size()==0) ? true : false;
        return answer;
    }
}