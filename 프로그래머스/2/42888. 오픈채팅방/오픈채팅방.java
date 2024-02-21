import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String[]> list = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();

        for(String str: record) {
            String cmd = str.split(" ")[0];
            String id = str.split(" ")[1];

            if(cmd.equals("Leave")) {
                list.add(new String[]{id, "님이 나갔습니다."});
            } else {
                String name = str.split(" ")[2];
                hm.put(id, name);

                if(cmd.equals("Enter")) {
                    list.add(new String[]{id, "님이 들어왔습니다."});
                }
            }
        }

        String[] answer = new String[list.size()];
        int idx=0;
        for(String[] now: list) {
            answer[idx++] = (hm.get(now[0]) + now[1]);
        }
    
        return answer;
    }
}