// 1 ≤ n ≤ 10^7 : 이차원 배열 만들면 너무 오래 걸림
class Solution {
    public int[] solution(int n, long left, long right) {
        /* 전체 n^2 배열
        int[] arr = new int[n*n];
        
        for(int i = 0; i<n*n; i++){
            int col = i/n;
            int row = i%n;
            arr[i] = Math.max(col+1, row+1);
        }
        */
        
        int[] answer = new int[(int)(right-left+1)];
        int idx = 0;
        for(long i = left; i<right+1; i++){
            long col = i/n;
            long row = i%n;
            answer[idx++] = (int)Math.max(col+1, row+1);
        }
        return answer;
    }
}