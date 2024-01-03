class Solution {
    public String solution(String s) {
        int len = s.length();
        String answer = len%2 != 0 ? s.charAt(len/2)+"" : s.charAt(len/2-1) + "" + s.charAt(len/2);
        
        return answer;
    }
}