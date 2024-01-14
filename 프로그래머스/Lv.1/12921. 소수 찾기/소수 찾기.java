class Solution {
    public int solution(int n) {
        int[] prime = new int[n+1];
        // 소수: 0, 소수 아닌수: 1 
        prime[0] = 1; prime[1] = 1; 
        for(int i = 2; i*i <= n; i++){
            for(int j = i; j*i <= n; j++){
                prime[i*j] = 1;
            }
        }
        
        int answer = 0;
        for(int i : prime){
            answer += (i == 0) ? 1 : 0;
        }
        return answer;
    }
}