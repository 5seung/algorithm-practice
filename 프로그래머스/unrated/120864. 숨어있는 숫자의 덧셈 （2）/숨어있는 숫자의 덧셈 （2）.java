class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "+");
        String[] str = my_string.split("\\+");
        for(String s : str){
            if(!s.equals("")){
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }
}