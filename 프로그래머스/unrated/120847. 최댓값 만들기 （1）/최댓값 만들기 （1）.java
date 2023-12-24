import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int len = numbers.length;
        int answer = numbers[len-1]*numbers[len-2];
        return answer;
    }
}