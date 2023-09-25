class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = 50;
        int luy = 50;
        int rdx = 0;
        int rdy = 0;
        int len =  wallpaper[0].length();
        for(int i = 0; i< wallpaper.length; i++){
            for(int j = 0; j < len ;j++){
                if(wallpaper[i].charAt(j) == '#'){
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i+1);
                    rdy = Math.max(rdy, j+1);       
                }
            }
        }
                
        int[] answer = {lux, luy, rdx, rdy};
        return answer;
    }
}