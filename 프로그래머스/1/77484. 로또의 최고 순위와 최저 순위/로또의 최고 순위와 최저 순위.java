import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Map<Integer, Integer> tempNum = new HashMap<>();
        for(int i = 0; i<lottos.length; i++){
            tempNum.put(lottos[i], tempNum.getOrDefault(lottos[i], 0)+1);
            tempNum.put(win_nums[i], tempNum.getOrDefault(win_nums[i], 0)+1);
        }
        
        // 일치하는 번호 수 찾기
        int cnt = 0;
        for(int win_num : win_nums){
            cnt += (tempNum.get(win_num) == 2) ? 1 : 0;
        }
        
        int rank = 6;
        switch(cnt){
            case 6 : rank = 1;
                break;
            case 5 : rank = 2;
                break;
            case 4 : rank = 3;
                break;
            case 3 : rank = 4;
                break;
            case 2 : rank = 5;
                break;
        }
        
        int min = rank;
        int max = Math.max(1, rank-tempNum.getOrDefault(0, 0));
        
        int[] answer = {max, min};
        return answer;
    }
}