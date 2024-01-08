class Solution {
    // 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
    boolean solution(String s) {
        s = s.toLowerCase();
        
        int pCnt = s.length() - s.replace("p", "").length();
        int yCnt = s.length() - s.replace("y", "").length();

        boolean answer = (pCnt == yCnt) ? true : false;

        return answer;
    }
}