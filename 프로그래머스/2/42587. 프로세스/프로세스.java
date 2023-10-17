import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: priorities){
            priorityQueue.offer(i);
        }
        
        while(!priorityQueue.isEmpty()){        
            for(int i = 0; i<priorities.length; i++){
                if(priorityQueue.peek() == priorities[i]){
                    priorityQueue.poll();
                    answer++;
                    
                    if(i==location){
                        return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}