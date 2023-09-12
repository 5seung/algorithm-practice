class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int len = arr.length;
        if(len > 1){
            int temp = arr[0];
            for(int i: arr){
                if(temp>i){
                    temp = i;
                }
            }
            
            answer = new int[len-1];
            int j = 0;
            for(int i = 0; i<len-1; i++){
                answer[i] = arr[j];
                if(arr[j] == temp){
                    i--;
                }
                j++;
            }
        }
        return answer;
    }
}