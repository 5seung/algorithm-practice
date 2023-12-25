class Solution {
    public int solution(int n) {

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