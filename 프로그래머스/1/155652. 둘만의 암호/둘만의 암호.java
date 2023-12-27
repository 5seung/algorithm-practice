class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(char c : s.toCharArray()){
            int i = 0;
            // index만큼 뒤의 알파벳 중 skip 문자 포함여부 체크
            while(i < index){
                if(c == 'z'){
                    c = 'a';
                }else{
                    c++;
                }
                
                if(skip.contains(c+"")){
                    i--;
                }
                i++;
            }
            answer += c;
        }
        return answer;
    }
}