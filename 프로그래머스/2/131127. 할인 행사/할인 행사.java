import java.util.*;

// 할인하는 제품은 하루에 하나씩만 구매할 수 있다.
// 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        for(int i = 0; i < discount.length-9; i++) {
            // 10일간 할인 품목 map에 넣기
            Map<String, Integer> dc = new HashMap<>();
            for(int j = i; j < i+10; j++) {
                dc.put(discount[j], dc.getOrDefault(discount[j], 0) + 1);
            }
            
            // number와 map의 값을 비교 
            boolean flag = true;
            for(int j = 0; j < want.length; j++) {
                // map에 want 물품이 없거나, want 값이 크면 탐색 종료
                if(dc.get(want[j]) == null || number[j] > dc.get(want[j])) {
                    flag = false;
                    break;
                }
            }
        
            if(flag) {
                answer++;
            }
            
        }
        return answer;
    }
}