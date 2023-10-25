import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int startX = 0;
        int startY = 0;
        int endX = 0;
        int endY = 0;
        Set<String> visitSpot = new HashSet<>();
        for(char c : dirs.toCharArray()){
            startX = endX;
            startY = endY;
            
            switch (c){
                case 'U' :
                    endY = startY+1 <= 5 ? startY+1 : startY;
                    break;
                case 'D' :
                    endY = startY-1 >= -5 ? startY-1 : startY;
                    break;
                case 'R' :
                    endX = startX+1 <= 5 ? startX+1 : startX;
                    break;
                case 'L' :
                    endX = startX-1 >= -5 ? startX-1 : startX;
                    break;
            }
            if(startX == endX && startY == endY) continue;
            
            visitSpot.add(startX+""+startY+""+endX+""+endY);
            visitSpot.add(endX+""+endY+""+startX+""+startY);
        }
        answer = visitSpot.size()/2;
        return answer;
    }
}