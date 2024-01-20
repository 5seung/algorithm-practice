import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int len = words.length;
        List<String> temp = new ArrayList<>();
        temp.add(words[0]);
        
        // 단어 재사용, 끝말이 이어지는지 동시에 확인해야됨
        for(int i = 1; i<len; i++){
            if(words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)
              || temp.contains(words[i])){
                answer[0]= (i%n)+1;
                answer[1]= (i/n)+1;
                break;
            }
            
            temp.add(words[i]);
        }
        
        return answer;
    }
}