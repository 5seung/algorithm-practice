class Solution {
    public int[] solution(int n, int m) {
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        // 최대 공약수
        int gcd = min;
        while(n%gcd != 0 || m%gcd != 0){
            gcd--;
        }
        
        // 최소 공배수
        int temp = 1;
        while((max*temp)%min != 0){
            temp++;
        }
        int[] answer = {gcd, max*temp};
        
        return answer;
    }
}