class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        for(String key : keyinput){
            switch(key){
                case "right": x += (Math.abs(x+1) > (board[0]-1)/2) ? 0 : 1 ;
                    break;
                case "left": x -= (Math.abs(x-1) > (board[0]-1)/2) ? 0 : 1 ;
                    break;
                case "up": y += (Math.abs(y+1) > (board[1]-1)/2) ? 0 : 1 ;
                    break;
                case "down": y -= (Math.abs(y-1) > (board[1]-1)/2) ? 0 : 1 ;
                    break;
            }
        }
        
        int[] answer = {x, y};
        return answer;
    }
}