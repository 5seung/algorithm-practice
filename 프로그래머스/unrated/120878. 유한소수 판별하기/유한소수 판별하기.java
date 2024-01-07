class Solution {
    public int solution(int a, int b) {
        // 기약분수 만들기
        for(int i = 2; i<=a; i++){
            while(a%i==0 && b%i == 0){
                a /= i;
                b /= i;
            }
        }
        
        // 분모 확인(유한소수의 분모에는 2와 5만 있어야됨)
        while(true){
            if(b%2 == 0){
                b /= 2;
            }else if(b%5 == 0){
                b /= 5;
            }else{
                break;
            }
        }
        
        int answer = (b == 1) ? 1 : 2;
        
        return answer;
    }
}