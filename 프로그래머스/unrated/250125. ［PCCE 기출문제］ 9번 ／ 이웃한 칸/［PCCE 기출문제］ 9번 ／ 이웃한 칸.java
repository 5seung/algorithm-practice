class Solution {
    public int solution(String[][] board, int h, int w) {
        int col = board.length;
        int row = board[0].length;
        String color = board[h][w];
        int answer = 0;
        
        //왼쪽 h, w-1
        if(w-1>=0 && board[h][w-1].equals(color))
            answer++;
        //오른쪽 h, w+1
        if(w+1<row && board[h][w+1].equals(color))
            answer++;
        //위 h-1, w
        if(h-1>=0 && board[h-1][w].equals(color))
            answer++;
        //아래 h+1, w
        if(h+1<col && board[h+1][w].equals(color))
            answer++;
        
        return answer;
    }
}