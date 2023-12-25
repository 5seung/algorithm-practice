class Solution {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[][] answer = new int[len/n][n];
        
        int idx1 = 0;
        int idx2 = 0;
        int[] temp = new int[n];
        for(int num : num_list){
            temp[idx1++] = num;
            
            if(idx1 == n){
                idx1 = 0;
                answer[idx2++] = temp.clone();
            }
        }
        return answer;
    }
}