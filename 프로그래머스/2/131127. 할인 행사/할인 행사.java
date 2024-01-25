import java.util.*;

// 할인하는 제품은 하루에 하나씩만 구매할 수 있다.
// 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> prod = new HashMap<>();
        for(int i = 0; i<want.length; i++){
            prod.put(want[i], number[i]);
        }
        
        int answer = 0;
        int idx = 0;
        while(idx <= discount.length-10){
            Map<String, Integer> dcProd = new HashMap<>();
            for(int i = idx; i<idx+10; i++){
                dcProd.put(discount[i], dcProd.getOrDefault(discount[i], 0)+1);
            }

            if (isEqual(prod, dcProd)) {
                answer++;
            }
            
            idx++;
        }
        
        return answer;
    }
    
    public boolean isEqual(Map<String, Integer> map1, Map<String, Integer> map2) {
        for (String key : map1.keySet()) {
            if (!map2.containsKey(key) || map1.get(key) != map2.get(key)) {
                return false;
            }
        }

        return true;
    }
}