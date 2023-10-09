import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int max = people.length-1;
        int min = 0;
        int temp = limit;
        while(true){
            temp -= people[max];
            if(temp - people[min] < 0){
                max--;
                answer++;
                temp = limit;
            }else{
                max--;
                min++;
                answer++;
                temp = limit;
            }
            if(max==min){
                answer++;
                break;
            }
                
            if(max<min){
                break;
            }
        }
        

       
        
        return answer;
    }
}