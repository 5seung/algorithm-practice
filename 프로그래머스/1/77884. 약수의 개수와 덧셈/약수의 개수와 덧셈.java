class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            int cnt = 0;
            for(int j = 1; j < Math.sqrt(i); j++){
                cnt += (i%j == 0) ? 2 : 0; 
            }
            cnt += (i%Math.sqrt(i) == 0) ? 1 : 0;
            
            answer += (cnt%2 == 0) ? i : -i;
        }
        
        return answer;
    }
}