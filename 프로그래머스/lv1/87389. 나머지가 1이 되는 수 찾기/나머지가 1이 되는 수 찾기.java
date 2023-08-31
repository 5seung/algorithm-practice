class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = 1;
        do{
            if((n-1)%x == 0){
                answer = x;
            }
            x++;
        } while(answer == 1);

        return answer;
    }
}

//1을 뺀 값의 약수 중 1이 아닌 가장 작은 값
//9: 1,3,9
//11: 1, 11