class Solution {
    //A를 밀어서 B가 될 수 있다면 = A: 원본 문자열
    public int solution(String A, String B) {
        int answer = 0;
        for(int i = 0; i<A.length(); i++){
            if(A.contains(B.substring(i))){
                answer = B.substring(0,i).equals(A.substring(A.length()-i,A.length())) ? i : -1;
                break;
            }
        }
        return answer;
    }
}