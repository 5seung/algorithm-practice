import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                }
            }
        }
        for(int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if(lost[i]-1==reserve[j] || lost[i]+1==reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                }
            }
        }
        
        List<Integer> loster = new ArrayList<>();
        for(int i: lost){
            if(i != -1){
                loster.add(i);
            }
        }
        
        answer = n - loster.size();
        return answer;
        }
    }
