class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int harshad = x;
        int temp = 0;
        while(x>0){
            temp += x%10;
            x /= 10;
        }
        if(harshad%temp!=0){
            answer = false;
        }
        return answer;
    }
}