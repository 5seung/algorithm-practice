import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photos) {
        // 인물별 그리움 점수
        Map<String, Integer> sc = new HashMap<>();
        int idx = 0;
        for(String s : name){
            sc.put(s, yearning[idx]);
            idx++;
        }
        
        // 각각의 사진의 인물들 점수 합산하기
        int[] answer = new int[photos.length];
        int tempAns = 0;
        idx = 0;
        for(String[] photo : photos){
            for(String p : photo){
                if(sc.containsKey(p)){
                    tempAns += sc.get(p);
                }
            }
            answer[idx]=tempAns;
            idx++;
            tempAns = 0;
        }
        
        return answer;
    }
}