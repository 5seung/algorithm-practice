class Solution {
    int[][] sc;
    int solution(int[][] land) {
        int len = land.length;
        sc = new int[len][4];
        
        for(int i = 0; i<len; i++){
            for(int j = 0; j<4; j++){
                if(i==0){
                    sc[i][j] = land[i][j];
                }else{
                    for(int k = 0; k<4 ;k++){
                        if(k != j)
                            sc[i][j] = Math.max(sc[i][j], sc[i-1][k]+land[i][j]);
                    }
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i<4; i++){
            answer = Math.max(answer, sc[len-1][i]);
        }
        
        return answer;
    }   
}