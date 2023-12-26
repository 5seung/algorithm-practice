import java.util.Arrays;

class Solution {
    //n이하의 합성수의 개수 = n - (소수의 개수+1)
    // >> 소수 개수 구하기
    public int solution(int N) {
        boolean[] eratos = eratosthenes(N);
        int answer = N-1;
        for(boolean b : eratos){
            if(b){
                answer--;
            }
        }
        return answer;
    }

    public static boolean[] eratosthenes(int N){
        // 소수를 체크할 배열
        boolean[] isPrime = new boolean[N+1];
        // 소수인 index = true, 소수가 아닌 index = false
        Arrays.fill(isPrime , true);

        // 0, 1은 소수가 아니므로 false
        isPrime [0] = false;
        isPrime [1] = false;

        for(int i=2; i <= Math.sqrt(N); i++){
            if(isPrime[i]){
                // i 의 배수들도 소수가 아니므로 false 로 만든다.
                for(int j=i*i; j <= N; j+=i) {
                    isPrime[j] = false;                
                }
            }        
        }   
        return isPrime;
    }
}