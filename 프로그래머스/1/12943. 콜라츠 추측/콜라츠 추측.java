class Solution {
    public int solution(int num) {
        int answer = -1;
        long Collatz = (long)num;
        int cnt = 0;
        for(int i = 0; i<500; i++){
            if(Collatz == 1){
                answer = cnt;
                break;
            }
            Collatz = (Collatz%2 == 0) ? Collatz/2 : (Collatz*3)+1;
            cnt++;
        }
        
        return answer;
    }
}