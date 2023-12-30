class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int idx = 1;
        for(char c : cipher.toCharArray()){
            if(idx%code == 0){
                answer += c;
            }
            idx++;
        }
        return answer;
    }
}