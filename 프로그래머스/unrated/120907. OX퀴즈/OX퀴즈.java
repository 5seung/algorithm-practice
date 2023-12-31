class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int j = 0; j < quiz.length; j++){
            String[] s = quiz[j].split(" ");
            int temp = 0;
            for(int i = 0; i < s.length; i++){
                if(s[i].equals("+")){
                    temp += Integer.parseInt(s[++i]);
                }else if(s[i].equals("-")){
                    temp -= Integer.parseInt(s[++i]);
                }else if(s[i].equals("=")){
                    answer[j] = (Integer.parseInt(s[i+1]) == temp) ? "O" : "X";
                    break;
                }else{
                    temp += Integer.parseInt(s[i]); 
                }
            }
        }
        return answer;
    }
}