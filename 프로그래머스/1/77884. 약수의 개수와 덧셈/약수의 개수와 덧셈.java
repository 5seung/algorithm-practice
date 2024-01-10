class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++){
            // int cnt = 0;
            // 제곱수를 기준으로 약수의 개수는 무조건 짝수
            // for(int j = 1; j < Math.sqrt(i); j++){
            //     cnt += (i%j == 0) ? 2 : 0; 
            // }
            
            // 따라서 제곱수가 자연수면 약수 개수는 무조건 홀수
            // cnt += (i%Math.sqrt(i) == 0) ? 1 : 0;
            
            // answer += (cnt%2 == 0) ? i : -i;
            
            answer += (i%Math.sqrt(i) != 0) ? i : -i;
        }
        
        return answer;
    }
}