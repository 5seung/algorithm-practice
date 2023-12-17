class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int[] answer = new int[len];
        int temp = 0;
        
        for(int i = 0; i < len; i++){
            // 기본은 -1
            answer[i] = -1;
            // 자신보다 앞에 나왔는지 확인
            temp = i-1;
            while(temp >= 0){
                if(s.charAt(i)==s.charAt(temp)){
                    answer[i] = i - temp;
                    break;
                }
                temp--;
            }
        }
        
        return answer;
    }
}