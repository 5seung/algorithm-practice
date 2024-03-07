import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        // HEAD 부분을 기준으로 사전 순으로 정렬하기
        // HEAD 모아서 정렬하기
        Set<String> set = new TreeSet<>();
        // HEAD:파일명 _원본파일명 보관을 위한 자료구조
        Map<String, String> map = new HashMap<>();
        //HEAD 모으기
        for(String file : files){
            String HEAD = "";
            for(Character c: file.toCharArray()){
                if(Character.isDigit(c)) break;
                HEAD += c;
            }
            HEAD = HEAD.toLowerCase();
            set.add(HEAD);
            map.put(HEAD, map.getOrDefault(HEAD, "")+file+",");
        }
        
        List<String> list = new ArrayList<>();
        for(String HEAD : set){
            Set<Integer> setNum = new TreeSet<>();
            // NUMBER:파일명 _원본파일명 보관을 위한 자료구조
            Map<Integer, String> mapNum = new HashMap<>();
            // HEAD가 같은 파일 묶음
            String[] file = map.get(HEAD).split(",");
            // 파일 묶음 중간 숫자로 정렬하기
            for(String s : file){
                String intStr = "";
                for (int i = HEAD.length(); i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (48 <= ch && ch <= 57) {
                        intStr += ch;
                    }else{
                        break;
                    }
                }
                int temp = Integer.parseInt(intStr);
                setNum.add(temp);
                mapNum.put(temp, mapNum.getOrDefault(temp, "")+s+",");
            }
            
            String tempFileName = "";
            for(int i : setNum){
                tempFileName += mapNum.get(i);
            }
            
            for(String s : tempFileName.split(",")){
                list.add(s);
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}