class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int a = 0; //가로
        int b = 0; //세로
        // a*b-yellow = brown 갯수
        // (a-2)*(b-2)= yellow 갯수
        for(int i = 1 ; i < brown/2; i++){
            a = brown/2 - i + 2;
            b = i;
            if((a-2)*(b-2) == yellow){
                break;
            }
        }
        
        answer[0] = a;
        answer[1] = b;
        
        return answer;
    }
}