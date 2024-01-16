class Solution {
    public int solution(int n) {
        int answer = n+1;
        int a = Integer.toString(n, 2).replace("0", "").length();
        int b = Integer.toString(answer, 2).replace("0", "").length();
        while(a != b){
            answer++;
            b = Integer.toString(answer, 2).replace("0", "").length();
        }
        return answer;
    }
}