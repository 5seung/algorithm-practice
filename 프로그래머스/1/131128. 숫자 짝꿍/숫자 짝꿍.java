import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] arrX = new int[10];
        int[] arrY = new int[10];

        for(String x : X.split("")){
            arrX[Integer.parseInt(x)]++; 
        }

        for(String y : Y.split("")){
            arrY[Integer.parseInt(y)]++; 
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--){
            if(arrX[i] > 0 && arrY[i] > 0){
                int tmpInt = Math.min(arrX[i], arrY[i]);
                for(int j = 0; j < tmpInt; j++){
                    sb.append(i);
                }
            }
        }

        String answer = "";
        if (sb.length()>0){
            answer = sb.charAt(0)=='0'? "0": sb.toString();
        } else {
            answer = "-1";
        }

        return answer;
    }
}