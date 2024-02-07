class Solution {
    public int solution(int n, int k) {
        String[] str = Integer.toString(n,k).split("0");
        
        int answer = str.length;
        for(String s: str){
            //진수변환시 int 범위 초과할 가능성 존재 > 변수타입 long선언
            long i = !s.equals("") ? Long.parseLong(s) : 1;
            if(i == 1){
                answer--;
                continue;
            }
            
            for(int j = 2; j<=(int)Math.sqrt(i); j++){
                if(i%j==0){
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}