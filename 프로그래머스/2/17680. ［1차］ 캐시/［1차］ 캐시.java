import java.util.*;

class Solution {
    public static int solution(int cacheSize, String[] cities) {
        Queue<String> caches = new LinkedList<>();
        int time = 0;
        
        // cache miss일 경우 실행시간은 5
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (String city : cities) {
            // 대소문자 구분을 하지 않는다.
            String cityLowerCase = city.toLowerCase();
            // 이미 존재하면
            if (caches.contains(cityLowerCase)) { 
                caches.remove(cityLowerCase); // 최신화
                caches.offer(cityLowerCase);
                time++;
            // 캐시 미스면
            } else {
                if (caches.size() < cacheSize) { // 여유 공간이 있다면
                    caches.offer(cityLowerCase);
                } else { // 여유 공간이 없다면, 가장 먼저 참조된 페이지 삭제
                    caches.poll();
                    caches.offer(cityLowerCase);
                }
                time += 5;
            }
        }

        return time;
    }
}