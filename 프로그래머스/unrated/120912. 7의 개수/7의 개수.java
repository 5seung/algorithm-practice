class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i : array){
            if((i+"").contains("7")){
                while(i>0){
                    answer += (i%10 == 7) ? 1 : 0;
                    i = i/10;
                }
            }
        }
        return answer;
    }
}