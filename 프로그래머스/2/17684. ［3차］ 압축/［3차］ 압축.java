import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> dict = new HashMap<>();
        for(int i = 'A'; i<='Z'; i++){
            dict.put((char)i+"", i-64);
        }
        
        String w = "";
        String c = "";
        int len = msg.length();
        List<Integer> LZW = new ArrayList<>();
        
        for(int i=0; i<len; ){
            w = msg.charAt(i)+"";
            
            for(int j=i+1; j<len; j++){
                w += msg.charAt(j);
                if(!dict.containsKey(w)){
                    c = msg.substring(j, j+1);
                    w = w.substring(0, w.length()-1);
                    break;
                }
            }
            
            i += w.length();
            LZW.add(dict.get(w));
            
            if(c.length()>0){
                dict.put(w+c, dict.size()+1);
            }
        }
        
        int[] answer = LZW.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}