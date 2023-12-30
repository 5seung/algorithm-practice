class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int x = i; x<=j; x++){
            if((x+"").contains(k+"")){
                for(String s : (x+"").split("")){
                    answer += s.equals(k+"") ? 1 : 0;
                }
            }
        }
        return answer;
    }
}