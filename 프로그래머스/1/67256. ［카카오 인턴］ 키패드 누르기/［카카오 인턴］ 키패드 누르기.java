import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String[][] key = {{"1", "2", "3"}, {"4","5","6"}, {"7","8","9"}, {"*","0","#"}};
        Map<String, int[]> keyLocation = new HashMap<>();
        for(int i = 0; i<key.length; i++){
            for(int j = 0; j<key[0].length; j++){
                keyLocation.put(key[i][j], new int[]{i, j});
            }
        }
        
        // 왼손 오른손 위치
        int[] L = {3, 0};
        int[] R = {3, 2};
        
        int distanceL = 0;
        int distanceR = 0;
        
        String answer = "";
        for(int number : numbers){
            int[] temp = keyLocation.get(number+"");
            
            if(number == 1 || number == 4 || number == 7){
                answer += "L";
                L = temp;
            }else if(number == 3 || number == 6 || number == 9){
                answer += "R";
                R = temp;
            }else{
                distanceL  = Math.abs(temp[0]-L[0])+Math.abs(temp[1]-L[1]);
                distanceR  = Math.abs(temp[0]-R[0])+Math.abs(temp[1]-R[1]);
                
                if(distanceL > distanceR){
                    answer += "R";
                    R = temp;
                }else if(distanceL < distanceR){
                    answer += "L";
                    L = temp;
                }else{
                    if(hand.equals("right")){
                        answer += "R";
                        R = temp;
                    }else{
                        answer += "L";
                        L = temp;
                    }
                }
            }
            
        }
        
        return answer;
    }
}