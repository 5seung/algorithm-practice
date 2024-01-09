import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 중복 신고 제거
        Set<String> reportSet = new HashSet<>();
        for(String r : report){
            reportSet.add(r);
        }
        
        // id_list idx담기
        Map<String, Integer> idIdx = new HashMap<>();
        int idx = 0;
        // 아이디별 신고횟수 담기
        Map<String, Integer> reportCnt = new HashMap<>();
        // 해당 아이디 신고한 사람 담기
        Map<String, String> reporter = new HashMap<>();
        
        for(String id : id_list){
            idIdx.put(id, idx++);
            reportCnt.put(id, 0);
            reporter.put(id, "");
        }
        
        for(String r : reportSet){
            String[] temp = r.split(" ");
            reportCnt.put(temp[1], reportCnt.get(temp[1])+1);
            reporter.put(temp[1], reporter.get(temp[1])+temp[0]+" ");
        }
        
        // 정지할 아이디 신고한 사람 확인
        int[] answer = new int[id_list.length];
        for(String id : id_list){
            if(reportCnt.get(id) >= k){
                String[]  reporters = reporter.get(id).split(" ");
                for(String s : reporters){
                    answer[idIdx.get(s)]++;
                }
            }
        }
        
        return answer;
    }
}