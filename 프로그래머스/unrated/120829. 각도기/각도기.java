class Solution {
    //예각일 때 1, 직각일 때 2, 둔각일 때 3, 평각일 때 4
    public int solution(int angle) {
        int answer = 0;
        if(angle < 90)
            answer = 1;
        else if(angle == 90)
            answer = 2;
        else if(angle < 180)
            answer = 3;
        else
            answer = 4;
        return answer;
    }
}