class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = 0;
        for(int i = 0; i<str.length; i++){
            if(str[i].equals("+")){
                answer += Integer.parseInt(str[i+1]);
                i++;
            }else if(str[i].equals("-")){
                answer -= Integer.parseInt(str[i+1]);
                i++;
            }else{
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}