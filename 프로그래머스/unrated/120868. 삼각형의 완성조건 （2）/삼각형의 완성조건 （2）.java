class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        int answer = 0;
        // 가장 긴 변이 두 변의 길이가 담긴 배열 중에 하나인 경우
        // answer += (max-min == 1) ? 0 : min;
        // 나머지 한변이 가장 긴 변인 경우
        // answer += (max-min == 1) ? 1 : (min-1);
        answer = min*2-1;
        return answer;
    }
}