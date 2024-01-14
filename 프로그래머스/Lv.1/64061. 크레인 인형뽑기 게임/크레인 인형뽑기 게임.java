import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> basket = new Stack<>();
        int answer = 0;
        
        for(int move : moves){
            int temp = 0;
            for(int i = 0; i < board.length; i++){
                if(board[i][move-1] != 0){
                    temp = board[i][move-1];
                    board[i][move-1] = 0;
                    break;
                }
            }
            if(temp != 0){
                if(!basket.isEmpty() && basket.peek() == temp){
                    basket.pop();
                    answer += 2;
                }else{
                    basket.push(temp);
                }
            }
        }
        
        return answer;
    }
}