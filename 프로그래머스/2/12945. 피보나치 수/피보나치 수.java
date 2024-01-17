class Solution {
    // n은 2 이상 100,000 이하인 자연수
    // n번째 피보나치 수를 1234567으로 나눈 나머지
    int[] fibo;
    public int solution(int n) {
        fibo = new int[100001];
        fibo[1] = 1;
        int answer = fibonacci(n);
        return answer;
    }
    
    public int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        
        if(fibo[n] == 0){
            fibo[n] = fibonacci(n-1) + fibonacci(n-2);
        }
        
        return fibo[n]%1234567;
    }
}