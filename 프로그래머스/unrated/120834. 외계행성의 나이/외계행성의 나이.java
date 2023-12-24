class Solution {
    public String solution(int age) {
        char[] alpha = {'a','b','c','d','e','f','g','h','i','j'};
        String answer = "";
        while(age>0){
            answer = alpha[age % 10] + answer;
            age /= 10;
        }
       
        
        return answer;
    }
}