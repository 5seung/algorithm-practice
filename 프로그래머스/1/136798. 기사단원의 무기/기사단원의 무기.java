class Solution {
    public int solution(int number, int limit, int power) {
        // number까지 각 숫자의 약수의 개수 담은 배열 만들기
        int[] num = new int[number];
        for(int i = 1; i<=number; i++){
            int cnt = 0;
            for(int j = 1; j<=Math.sqrt(i); j++){
                if(i%j == 0){
                    cnt++;
                    if(j*j != i){
                        cnt++;
                    }
                }
            }
            num[i-1] = cnt;
        }
        
        // 공격력 제한 수치 확인
        int answer = 0;
        for(int n : num){
            answer += (n > limit) ? power : n;
        }
        
        return answer;
    }
}