class Solution {
    public int solution(int n) {
        int sqrt = (int)Math.sqrt(n);
        int answer = (n%sqrt == 0) ? 1 : 2;
        return answer;
    }
}