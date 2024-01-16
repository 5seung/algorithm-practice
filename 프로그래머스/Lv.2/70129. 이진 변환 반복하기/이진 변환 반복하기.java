class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int removeZero = 0;
        
        int len = s.length();
        while(len > 1){
            s = s.replace("0", "");
            cnt++;
            removeZero += (len - s.length());
            s = Integer.toString(s.length(), 2);
            len = s.length();
        }
            
        int[] answer = {cnt, removeZero};
        return answer;
    }
}