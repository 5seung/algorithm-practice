import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for(int progress : progresses){
            q.add(progress);
        }
        
        int idx = 0;
        int day = 1;
        int cnt = 0;
        List<Integer> lst = new ArrayList<>();
        while(!q.isEmpty()){
            if(q.peek() + (speeds[idx]*day) >= 100){
                q.poll();
                idx++;
                cnt++;
                if(q.isEmpty()){
                    lst.add(cnt);
                }
            }else{
                if(cnt != 0){
                    lst.add(cnt);
                }
                day++;
                cnt = 0;
            }
        }
        
        
        int[] answer = lst.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}