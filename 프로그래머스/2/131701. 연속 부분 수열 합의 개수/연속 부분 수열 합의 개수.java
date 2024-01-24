import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int len = elements.length;
        int[] copyElements = new int[len*2];
        
        for(int i = 0; i<len*2; i++){
            copyElements[i] = elements[i%len];
        }
        
        Set<Integer> sum = new HashSet<>();
        for(int i = 0; i < len; i++){
            int temp = copyElements[i];
            sum.add(temp);
            for(int j = i+1; j < len+i; j++){
                temp += copyElements[j];
                sum.add(temp);
            }
        }
        
        int answer = sum.size();
        return answer;
    }
}