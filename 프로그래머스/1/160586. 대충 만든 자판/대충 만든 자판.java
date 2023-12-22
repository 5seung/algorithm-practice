import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 작성할 수 있는 문자, 해당 문자의 최소 입력 수 맵에 담기
        Map<Character, Integer> keyMap = new HashMap<>();
        int len = 0;
        for(String s : keymap){
            len = s.length();
            for(int i = len-1; i>=0 ; i--){
                if(!keyMap.containsKey(s.charAt(i)) || keyMap.get(s.charAt(i)) > i+1){
                    keyMap.put(s.charAt(i), i+1);
                }
            }
        }
        
        // 입력할 문자 입력 횟수 확인하기
        int[] answer = new int[targets.length];
        int idx = 0;
        int temp = 0;
        for(String target : targets){
            for(char c : target.toCharArray()){
                if(keyMap.containsKey(c)){
                    temp += keyMap.get(c);
                }else{
                    temp = -1;
                    break;
                }
            }
            answer[idx] = temp;
            idx++;
            temp = 0;
        }
        return answer;
    }
}