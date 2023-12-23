class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] myArr = my_string.toCharArray();
        for(int i = myArr.length-1 ; i>=0; i--){
            answer += myArr[i];
        }
        return answer;
    }
}