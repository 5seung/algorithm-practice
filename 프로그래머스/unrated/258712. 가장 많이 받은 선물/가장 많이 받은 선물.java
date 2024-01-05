import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        // 주고 받은 선물 수 담기
        Map<String, Integer> gtable= new HashMap<>();
        // 선물 지수 담기
        Map<String, Integer> gidx= new HashMap<>();
        
        for(String gift : gifts){
            // 주고 받은 선물 계산하기
            gtable.put(gift,  gtable.getOrDefault(gift, 0)+1);
            
            // 선물 지수 계산하기
            String[] g = gift.split(" ");
            gidx.put(g[0], gidx.getOrDefault(g[0], 0)+1); // 준사람
            gidx.put(g[1], gidx.getOrDefault(g[1], 0)-1); // 받은 사람
        }
        
        // 준 사람 기준으로 다음달 받을 선물 계산
        int answer = 0;
        for(String friend : friends){ // 준 사람
            int cnt = 0;
            for(String f : friends){ // 받은 사람
                if(friend.equals(f)){
                    continue;
                }
                if(gtable.getOrDefault(friend+" "+f, 0) 
                   > gtable.getOrDefault(f+" "+friend, 0)){
                    cnt++;
                }else if(gtable.getOrDefault(friend+" "+f, 0) 
                         == gtable.getOrDefault(f+" "+friend, 0)){
                    cnt += gidx.getOrDefault(friend, 0) > gidx.getOrDefault(f, 0) ? 1 : 0;
                }
            }
            answer = Math.max(answer, cnt);
        }
        
        return answer;
    }
}