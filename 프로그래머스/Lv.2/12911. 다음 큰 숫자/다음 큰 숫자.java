class Solution {
    public int solution(int n) {
        int answer = n+1;
        // int a = Integer.toString(n, 2).replace("0", "").length();
        // int b = Integer.toString(answer, 2).replace("0", "").length();
        // > Integer.bitCount()를 통해 간단히 1의 개수를 찾을 수 있다.
        // : 주어진 정수에서 true bit의 개수를 찾는 함수
        int a = Integer.bitCount(n);
        int b = Integer.bitCount(answer);
        while(a != b){
            answer++;
            b = Integer.bitCount(answer);
        }
        return answer;
    }
}