class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++){
            if(i%2==1){
                answer += "박";
                continue;
            }
            answer += "수";
        }
        return answer;
    }
}