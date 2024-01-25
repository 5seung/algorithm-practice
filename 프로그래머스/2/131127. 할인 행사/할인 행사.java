import java.util.*;

// 할인하는 제품은 하루에 하나씩만 구매할 수 있다.
// 원하는 제품을 모두 할인 받을 수 있는 회원등록 날짜의 총 일수
// 슬라이딩 윈도우 알고리즘을 활용하면 더 효율적으로 구현가능
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int leftIdx = 0;
        int rightIdx = 9;
        Map<String, Integer> dc = new HashMap<>();
        // 1~10일 할인 물품 목록
        for(int i = 0; i < 10; i++){
            dc.put(discount[i], dc.getOrDefault(discount[i],0)+1);
        } 
        
        while(rightIdx < discount.length){
            // 가원가입 가능 여부 체크
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

            // 다음 가입일 할인 물품 map 셋팅
            rightIdx++;
            if(rightIdx < discount.length){
                dc.put(discount[rightIdx], dc.getOrDefault(discount[rightIdx],0)+1);
                dc.put(discount[leftIdx], dc.get(discount[leftIdx])-1);
                leftIdx++;
            }
        }

        return answer;
    }
}