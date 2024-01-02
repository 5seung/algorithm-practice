class Solution {
    public int solution(String s) {
        int answer = 0;
        while(s.length()>0){
            char[] c = s.toCharArray();
            int x = 0;
            int count = 0;
            for(int i = 0; i<c.length; i++){
                if(c[0] != c[i]){
                    count++;
                }else{
                    x++;
                }

                if(x == count){
                    s = s.substring(x+count);
                    answer++;
                    break;
                }
            }
            
            if(x != count){
                answer++;
                break;
            }
        }
        return answer;
    }
}