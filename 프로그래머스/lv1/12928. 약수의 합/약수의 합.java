class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1 ; i <= n; i++){
            if(n%i==0){
                answer += i;
            }
        }

        return answer;
    }
}

//약수일때, 바로 answer에 누적해서 더하면되므로 배열까지 선언해서 쓸필요가 없다.
//약수를 좀더 효율적으로 구하는 방법은 없을까? 
