class Solution {
    //A를 밀어서 B가 될 수 있다면 = A: 원본 문자열
    public int solution(String A, String B) {
        int answer = (B+B).indexOf(A);
        return answer;
    }
}