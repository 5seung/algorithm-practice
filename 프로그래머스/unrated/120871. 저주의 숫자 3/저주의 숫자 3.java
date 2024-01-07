class Solution {
    // 3의 배수, 숫자 3을 사용하지 않습니다.
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            answer++;
            
            while((answer+"").contains("3") || answer%3 == 0){
                answer++;
            }
        }
        return answer;
    }
}