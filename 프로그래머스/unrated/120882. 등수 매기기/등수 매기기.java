class Solution {
    public int[] solution(int[][] score) {
        int len = score.length;
        // 평균 구하기
        double[] avg = new double[len];
        for (int i = 0; i < len; i++) {
            avg[i] = (double)(score[i][0]+score[i][1])/2;
        }
        
        // 등수 구하기
        int[] answer = new int[len];
        for (int i = 0; i < len; i++) {
          int cnt = 1;
          for (int j = 0; j < len; j++) { // j번째 값의 등수 구하기
            if (avg[j] > avg[i]){ // 큰 값이 나올때마다 등수 올려주기
                cnt++;
            }
          }
          answer[i] = cnt; // 등수 저장
        }
        return answer;
    }
}