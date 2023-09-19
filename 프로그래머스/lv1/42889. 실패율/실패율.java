import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int users = stages.length;
        double[] failureRate = new double[N];
        Map<Integer, Integer> temp = new HashMap<>();
        for(int i : stages){
            if(temp.containsKey(i)){
                int val = temp.get(i);
                temp.put(i, ++val);
            }else{
                temp.put(i, 1);
            }
        }
        int failUsers = 0;
        for(int i = 1; i <= N; i++){
            if(temp.containsKey(i)){
                failureRate[i-1] = (double)temp.get(i)/(users-failUsers);
                failUsers += temp.get(i);
            }
        }
        
        int[] answer = new int[N];
        for(int j = 0; j < N; j++){
            double max = 0;
            for(double i : failureRate){
                if(max<i){
                    max = i;
                }
            }
            for(int i = 0; i < N; i++){
                if(failureRate[i]==max){
                    answer[j]=i+1;
                    failureRate[i]=-1;
                    break;
                }
            }
        }
        return answer;
    }
}