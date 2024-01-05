class Solution {
    // "aya", "ye", "woo", "ma" 
    // 연속해서 같은 발음을 하는 것은 어려워
    public int solution(String[] babbling) {
        String[] can = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String s : babbling){
            // 연속 발음 제거
            s = s.replace("ayaaya","*").replace("yeye","*").replace("woowoo","*")
                .replace("mama","*");
            if(s.contains("*")){
                continue;
            }
            // 발음 가능 여부 체크
            for(String c : can){
                s = s.replace(c,"-");
            }
            s = s.replace("-", "");
            answer += (s.equals("")) ? 1 : 0;
        }
        return answer;
    }
}