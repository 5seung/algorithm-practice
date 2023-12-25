class Solution {
    //소문자, 대문자, 한자리 자연수
    public int solution(String my_string) {
        String[] str = my_string.split("");
        int answer = 0;
        for(char c : my_string.toCharArray()){
            if(c >= '0' && c <= '9'){
                answer += c - '0';
            }
        }
        return answer;
    }
}