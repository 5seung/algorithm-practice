class Solution {
    public String solution(String s) {
        String[] temp = s.toLowerCase().split(" ");
        String answer = "";
        for(String t : temp){
            // 공백문자가 연속해서 나올 경우 처리
            if(t.length() == 0){
                answer += " ";
                continue;
            }
            
            // 0번째 문자는 대문자로
    	    answer += t.substring(0, 1).toUpperCase();
    		// 1번째 문자부터 마지막 문자
    		answer += t.substring(1, t.length());
            
            if(s.length() != answer.length()){
                answer += " ";
            }
        }
        return answer;
    }
}