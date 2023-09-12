class Solution {
    public boolean solution(int x) {
        int harshad = x;
        int temp = 0;
        while(x>0){
            temp += x%10;
            x /= 10;
        }

        return (harshad%temp!=0) ? false : true;
    }
}