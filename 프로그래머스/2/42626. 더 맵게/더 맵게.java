import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville){
            pq.add(s);
        }
        
        int answer = 0;
        int newScov = 0;
        while(pq.peek() < K && pq.size() > 1){
            newScov = pq.poll();
            newScov += pq.poll()*2;
            pq.add(newScov);
            answer++;
        }
        
        if(pq.peek() < K){
            answer = -1;
        }
        
        
        return answer;
    }
}