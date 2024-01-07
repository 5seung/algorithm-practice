import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int[][] pairs = {{0,1,2,3}, {0,2,1,3}, {0,3,1,2}};
        int answer = 0;
        for(int[] pair : pairs){
            int x1 = dots[pair[0]][0]-dots[pair[1]][0];
            int y1 = dots[pair[0]][1]-dots[pair[1]][1];
            
            int x2 = dots[pair[2]][0]-dots[pair[3]][0];
            int y2 = dots[pair[2]][1]-dots[pair[3]][1];
                
            if((double)x1/y1 == (double)x2/y2){
                answer = 1;
                break;
            }
        };
        
        return answer;
    }
}