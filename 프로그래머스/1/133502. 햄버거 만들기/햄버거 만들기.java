import java.util.*;
import java.util.stream.*;

class Solution {
    // 1-빵, 2-야채, 3-고기
    // 1-2-3-1
    public int solution(int[] ingredient) {
        Stack<Integer> h = new Stack<>();
        int answer = 0;
        int size = 0;
        for(int i : ingredient){
            h.push(i);
            size = h.size();
            
            if(size >= 4){
                if(h.get(size-1)==1 && h.get(size-2)==3 
                   && h.get(size-3)==2 && h.get(size-4) == 1){
                    answer++;
                    h.pop();
                    h.pop();
                    h.pop();
                    h.pop();
                }
            }
        }
            
        return answer;
    }
}