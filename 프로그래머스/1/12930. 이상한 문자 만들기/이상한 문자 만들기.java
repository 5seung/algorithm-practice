class Solution {
    public String solution(String s) {
        String[] str = s.split(" ",-1);
        int idx = 0;
        String answer = "";
        for(String word : str){
            while(word.length() != idx){
                answer += (idx%2 == 0) ? (word.charAt(idx++)+"").toUpperCase() 
                    : (word.charAt(idx++)+"").toLowerCase();
            }
            
            if(answer.length() != s.length()){
                answer += " ";
                idx = 0;
            }
        }
        return answer;
    }
}