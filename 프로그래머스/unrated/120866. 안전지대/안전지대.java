class Solution {
    public int solution(int[][] board) {
        int[][] tempBoard = new int[board.length+2][board.length+2];
        int answer = 0;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j]==1){
                    tempBoard[i+1][j+1] = 1;
                    
                    for(int a=0;a<=2;a++){
                        for(int b=0;b<=2;b++){
                            if(a==1 && b==1)
                                continue;
                            
                            tempBoard[i+a][j+b] = 2;
                        }
                    }
                    
                }
            }
        }
        
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(tempBoard[i+1][j+1]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}