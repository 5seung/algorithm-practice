import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        List<Double> temp = new ArrayList<>();
        for(int num : numlist){
            if(num-n < 0){
                temp.add(Math.abs(num-n)+0.5);
            }else{
                temp.add(Math.abs(num-n)+0.0);
            }
        }
        Collections.sort(temp);
        
        int[] answer = new int[numlist.length];
        for(int num : numlist){
            int idx = 0;
            if(num-n < 0){
                idx = temp.indexOf(Math.abs(num-n)+0.5);
            }else{
                idx = temp.indexOf(Math.abs(num-n)+0.0);
            }
            answer[idx] = num;
        }
        return answer;
    }
}