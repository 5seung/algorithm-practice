class Solution {
    public int solution(int n, int m, int[] section) {
        int len = section.length;
        //페인트를 칠해야하는 구역의 최대, 최소 값
        int min = section[0];
        int max = section[len-1];
        //페인트칠 횟수
        int answer = 0;
        
        while(max >= min){
            answer++;
            //max에서 한번에 칠하고 남는 구간
            max = max - m;
            //칠해야되는 구간 재확인
            for(int i = len-1; i>=0; i--){
                if(section[i] <= max){
                    max = section[i];
                    break;
                }
            }
        }
        return answer;
    }
}