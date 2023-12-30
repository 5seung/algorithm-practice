class Solution {
    public int solution(String before, String after) {
        String[] be = before.split("");
        for(String s : be){
            after = after.replaceFirst(s,"");
        }
        
        int answer = (after.equals("")) ? 1 : 0;
        return answer;
    }
}