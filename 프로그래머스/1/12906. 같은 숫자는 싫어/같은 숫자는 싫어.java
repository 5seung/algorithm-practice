import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);
        for(int i : arr){
            if(stack.peek()!=i){
                stack.add(i);
            }
        }
        
        int[] answer = stack.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}