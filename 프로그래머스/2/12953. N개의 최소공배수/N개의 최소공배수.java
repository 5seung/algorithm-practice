import java.util.*;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = arr[arr.length-1];
        int temp = 1;
        Boolean bool = true;
        while(bool){
            for(int i : arr){
                if(answer%i != 0){
                    bool = true;
                    temp++;
                    break;
                }else{
                    bool = false;
                }
            }
            answer = arr[arr.length-1]*temp;
        }
            
        return answer;
    }
}