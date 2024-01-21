class Solution {
    int[] dp;
    public long solution(int n) {
        dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        long answer = fibo(n);
        return answer;
    }
    
    int fibo(int a){
        if(dp[a] == 0){
            dp[a] = fibo(a-1) + fibo(a-2);
        }
        return dp[a]%1234567;
    }
}