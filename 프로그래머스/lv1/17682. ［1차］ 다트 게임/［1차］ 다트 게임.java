import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] result = dartResult.toCharArray();
        int len = result.length;
        int tempIdx = 0;
        int temp = 0;
        List<Integer> calcuForm = new ArrayList<>();
        for(int i = 0; i<len; i++){
            switch(result[i]){
                case 'S':
                   temp = (tempIdx == i-1) ? result[tempIdx]-'0'
                       : Integer.parseInt(String.copyValueOf(result, tempIdx, 2));
                    calcuForm.add(temp);
                    tempIdx = i+1;
                    break;
                case 'D':
                   temp = (tempIdx == i-1) ? result[tempIdx]-'0'
                       : Integer.parseInt(String.copyValueOf(result, tempIdx, 2));
                    temp = (int)Math.pow(temp,2);
                    calcuForm.add(temp);
                    tempIdx = i+1;
                    break;
                case 'T':
                   temp = (tempIdx == i-1) ? result[tempIdx]-'0'
                       : Integer.parseInt(String.copyValueOf(result, tempIdx, 2));
                    temp = (int)Math.pow(temp,3);
                    calcuForm.add(temp);
                    tempIdx = i+1;
                    break;
                case '*':
                    int star1 = calcuForm.get(calcuForm.size()-1)*2;
                    calcuForm.set(calcuForm.size()-1,(Integer)star1);
                    if(i>3){  
                        int star2 = calcuForm.get(calcuForm.size()-2)*2;
                        calcuForm.set(calcuForm.size()-2,(Integer)star2);
                    }
                    tempIdx = i+1;
                    break;
                case '#':
                    int acha = calcuForm.get(calcuForm.size()-1)*(-1);
                    calcuForm.set(calcuForm.size()-1, acha);
                    tempIdx = i+1;
                    break;
            }
        }
        
        for(int i : calcuForm){
            answer += i;
        }
        
        return answer;
    }
}