import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] str = s.substring(2,s.length()-2).split("},\\{");
        Arrays.sort(str, (String s1, String s2) -> s1.length() - s2.length());
        
        int[] answer = new int[str[str.length-1].split(",").length];
        int idx = 0;
        Set<Integer> set = new HashSet<>();
        for(String temp : str){
            for(String i : temp.split(",")){
                int x = Integer.parseInt(i);
                if(!set.contains(x)){
                    answer[idx++] = x;
                    set.add(x);
                }
            }
        }
        return answer;
    }
}