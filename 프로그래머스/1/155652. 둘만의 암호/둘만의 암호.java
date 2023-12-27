class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(char c : s.toCharArray()){
            int i = 0;
            // index만큼 뒤의 알파벳 중 skip 문자 포함여부 체크
            while(i < index){
                c = (c == 'z') ? 'a' : (char)(c + 1);
                
                if(!skip.contains(c+"")){
                    i++;
                }
            }
            answer += c;
        }
        return answer;
    }
}