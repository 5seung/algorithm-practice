class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i<food.length; i++){
            answer += (i+"").repeat(food[i]/2);
        }
        
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        
        answer += "0" + reverse;
        
        return answer;
    }
}