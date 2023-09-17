import java.util.*;
class Solution {
    public List<Integer> solution(int[] answers) {
        int[] answer = {0,0,0};
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == p1[i%5]) answer[0] += 1;
            if(answers[i] == p2[i%8]) answer[1] += 1;
            if(answers[i] == p3[i%10]) answer[2] += 1;
        }
        int max = 0;
        for(int i : answer){
            max = Math.max(max, i);
        }
        int p = 1;
        List<Integer> lst = new ArrayList<>();
        for(int i : answer){    
            if(i==max){
                lst.add(p);
            }
            p++;    
        }
        return lst;
    }
}