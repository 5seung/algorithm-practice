class Solution {
    //약수 갯수 구하기
    public int solution(int n) {
        // 제곱근 구하기
        double sqrt = Math.sqrt(n);
        int answer = 0;

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                answer += (i == sqrt) ? 1 : 2;
            }
        }
        return answer;
    }
}