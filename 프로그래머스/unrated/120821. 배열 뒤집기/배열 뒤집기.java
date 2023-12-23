class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        for(int num : num_list){
            answer[len-1] = num;
            len--;
        }
        return answer;
    }
}