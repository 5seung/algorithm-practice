import java.util.*;
// 순간이동: (현재까지 온 거리) x 2 > 건전지 사용 X
// 점프: K 칸을 앞으로 > 건전지 용량 K 만큼 사용
public class Solution {
    public int solution(int n) {
        int ans = 0;
        while(n != 0){
            if(n%2 == 0){
                n /= 2;
            }else{
                n--;
                ans++;
            }
        }

        return ans;
    }
}