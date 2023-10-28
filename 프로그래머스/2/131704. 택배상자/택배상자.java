import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 1;
        int boxNum = order.length;
        Stack<Integer> convey1 = new Stack<>();
        Stack<Integer> convey2 = new Stack<>();
        //첫번째 상자 처리
        int order1 = order[0];
        for(int i = boxNum; i>order1; i--){
            convey1.push(i);
        }
        for(int i = 1; i<order1; i++){
            convey2.push(i);
        }
        //1번 이후 상자 처리
        int orderNum = 1;
        while(true){
            if(!convey2.isEmpty()&&order[orderNum]==convey2.peek()){
                convey2.pop();
                orderNum++;
                answer++;
            }else if(!convey1.isEmpty()&&order[orderNum]==convey1.peek()){
                convey1.pop();
                orderNum++;
                answer++;
            }else{
                int temp = convey1.pop();
                convey2.push(temp);
            }
            
            if(convey1.isEmpty()&&
               (convey2.isEmpty()||convey2.peek()!=order[orderNum])){
                break;
            }
        }   
        return answer;
    }
}