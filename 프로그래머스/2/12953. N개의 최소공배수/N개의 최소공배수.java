class Solution {
    public int solution(int[] arr) {
        int answer = 1;

        for(int i=0;i<arr.length;i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }
    
    // 최소공배수 : 두 수를 곱해 최대공약수로 나누면 최소공배수가 된다. 
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // 최대공약수 : '유클리드 호제법'
    // 1. 큰수를 작은수로 나눈다.
    // 2. 나누는 수를 나머지로 나눈다 > 나머지가 0이될때, 나눈수가 최대공약수
    static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

}