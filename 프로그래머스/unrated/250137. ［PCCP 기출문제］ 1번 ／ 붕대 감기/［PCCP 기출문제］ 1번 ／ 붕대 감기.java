class Solution {
    //bandage는 [시전 시간, 초당 회복량, 추가 회복량] 
    //health 최대 체력
    //attacks[i]는 [공격 시간, 피해량]    
    public int solution(int[] bandage, int health, int[][] attacks) {
        //연속성공 시간
        int stime = 0;
        //공격 인덱스
        int idx = 0;
        //현재체력
        int hp = health;
        int temp = 1;
        
        while(idx < attacks.length){
            //공격 당하면 체력 감소
            if(temp==attacks[idx][0]){
                hp-=attacks[idx][1];
                idx++;
                stime = 0;
            }else{ //공격이 없다면 체력 증가
                hp+=bandage[1];
                stime++;
                if(stime == bandage[0]){
                    hp=hp+bandage[2]>health?health:hp+bandage[2];
                    stime = 0;
                }
                if (hp > health) {
                    hp = health;
                }
            }
        
            if(hp<=0){
                return -1;
            }
            
            temp++;
        }
        
        return hp;
    }
}