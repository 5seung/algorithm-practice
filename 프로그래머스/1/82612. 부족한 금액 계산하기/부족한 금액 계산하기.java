class Solution {
    public long solution(int price, int money, int count) {
        long total = (long)price*(1+count)*(count)/2;
        long answer = total > money ? total-money : 0;

        return answer;
    }
}