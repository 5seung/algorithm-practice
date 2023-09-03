class Solution {
    public String solution(String[] seoul) {
        int x = 0;
        for(String s : seoul){
            if(s.equals("Kim")){
                break;
            }
            x++;
        }
        String answer = "김서방은 "+x+"에 있다";
        return answer;
    }
}