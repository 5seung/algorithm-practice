class Solution {
    public int solution(String t, String p) {
        int tlen = t.length();
        int plen = p.length();
        String temp = "";
        int answer = 0;
        for(int i = 0; i <= tlen-plen; i++){
            temp = t.substring(i, i+plen);
            answer += Long.parseLong(temp) <= Long.parseLong(p) ? 1 : 0;
        }
        
        return answer;
    }
}