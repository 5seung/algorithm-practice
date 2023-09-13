import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int size = sizes.length;
        //가로(큰값 저장)
        int[] x = new int[size];
        //세로(작은값 저장)
        int[] y = new int[size];
        for(int i = 0; i < size; i++){
            if(sizes[i][0]>sizes[i][1]){
                x[i] = sizes[i][0];
                y[i] = sizes[i][1];
            }else{
                x[i] = sizes[i][1];
                y[i] = sizes[i][0];
            }
        }
        
        Arrays.sort(x);
        Arrays.sort(y);
        
        answer = x[size-1] * y[size-1];
        return answer;
    }
}