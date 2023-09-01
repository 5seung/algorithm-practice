class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double num = 0;
        for(int i : numbers){
            answer += i;
            num++;
        }
        answer /= num;
        return answer;
    }
}