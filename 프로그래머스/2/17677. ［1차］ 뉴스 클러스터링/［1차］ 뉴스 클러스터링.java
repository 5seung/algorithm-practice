import java.util.*;
import java.lang.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        String temp = null;
        //A집합 만들기
        str1 = str1.toLowerCase();
        Map<String, Integer> A = new HashMap<>();
        for(int i = 0; i<str1.length()-1; i++){
            temp = str1.substring(i, i+2);
            if(temp.matches("^[a-zA-Z]*$"))
                A.put(temp, A.getOrDefault(temp, 0)+1);
        }
        
        //B집합 만들기
        str2 = str2.toLowerCase();
        Map<String, Integer> B = new HashMap<>();
        for(int i = 0; i<str2.length()-1; i++){
            temp = str2.substring(i, i+2);
            if(temp.matches("^[a-zA-Z]*$"))
                B.put(temp, B.getOrDefault(temp, 0)+1);
        }
        
        Set<String> tempSet = new HashSet<>();
        Iterator<String> iterator = A.keySet().iterator();
        while (iterator.hasNext()){
            tempSet.add(iterator.next());
        }
        Iterator<String> iter = B.keySet().iterator();
        while (iter.hasNext()){
            tempSet.add(iter.next());
        }
        
        String[] keyArr = tempSet.toArray(new String[0]);
        
        //교집합 합집합 수 구하기
        int interNum = 0;
        int unionNum = 0;
        for(String key : keyArr){
            interNum += Math.min(A.getOrDefault(key, 0), B.getOrDefault(key, 0));
            unionNum += Math.max(A.getOrDefault(key, 0), B.getOrDefault(key, 0));
        }
        
        answer = unionNum!=0?interNum*65536/unionNum:1*65536;
        
        return answer;
    }
}
