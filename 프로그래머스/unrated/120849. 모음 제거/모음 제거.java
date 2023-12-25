class Solution {
    public String solution(String my_string) {
//       String[] gathers = {"a", "e", "i", "o", "u"};
//       String answer = my_string;
//       for(String gather : gathers){
//           answer = answer.replace(gather, "");
//       }
        String answer = my_string.replaceAll("a|e|i|o|u", "");
        return answer;
    }
}