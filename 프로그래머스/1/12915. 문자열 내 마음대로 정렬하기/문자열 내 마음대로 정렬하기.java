import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
/*
        Map<String, String> word = new HashMap<>();
        List<String> key = new ArrayList<>();
        for(String string : strings){
            String temp = string.charAt(n)+string;
           key.add(temp);
            word.put(temp, string);
        }
        
        Collections.sort(key);
        String[] answer = new String[strings.length];
        int idx = 0;
        for(String s : key){
            answer[idx++] = word.get(s);
        }
        return answer;
*/
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return s1.compareTo(s2);
            }
        });
        return strings;
    }
}