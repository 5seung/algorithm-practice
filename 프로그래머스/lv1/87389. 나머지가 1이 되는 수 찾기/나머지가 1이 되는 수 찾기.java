class Solution {
    public int solution(int n) {
       int answer = 1;

        while(true) {
            if (n % answer == 1)
                break;
            answer++;
        }

        return answer;
    }
}

// 나머지 값을 구해주는 연산자가 있으니 해당 연산자로 나머지가 1인 값을 바로 찾으면됨
