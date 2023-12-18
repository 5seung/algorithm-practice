import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> rank = new HashMap<>();
        int idx = 0;
        for(String player : players){
            rank.put(player, idx);
            idx++;
        }
        
        for(String s : callings){
            idx = rank.get(s);
            //역전당한 선수 이름
            String temp = players[idx-1];
            players[idx-1]=players[idx];
            players[idx]=temp;
            rank.replace(temp, idx);
            rank.replace(s, idx-1);
        }
        
        return answer;
    }
}