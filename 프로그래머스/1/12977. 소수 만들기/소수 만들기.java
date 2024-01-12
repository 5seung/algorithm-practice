class Solution {
    public int solution(int[] nums) {
        
        // nums 원소 : 1 이상 1,000 이하 자연수, 중복된 숫자 없음
        // -> 최대로 만들 수 있는 수는 2997
        
        // 대략 2999까지 소수인 수 찾기 (에라토스테네스 체 활용)
        boolean[] prime = new boolean[3000];
        
        for(int i = 2; i * i < 3000; i++){
            for(int j = i; i * j < 3000; j++){
                prime[i * j] = true;
            }
        }
        
        // 조합할 숫자 3가지 결과 확인
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                for(int k = j + 1; k < nums.length; k++){
                    if (!prime[nums[i] + nums[j] + nums[k]]) answer++;
                }
            }
        }

        return answer;
    }
}