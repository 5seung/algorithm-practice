import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int max = people.length-1;
        int min = 0;
        while(true){
            if(people[min] + people[max] > limit){
                max--;
                answer++;
            }else{
                max--;
                min++;
                answer++;
            }
                
            if(max<min){
                break;
            }
        }
        

       
        
        return answer;
    }
}