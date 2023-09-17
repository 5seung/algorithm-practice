import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        answer = (set.size() <= nums.length/2) ? set.size() : nums.length/2;
        return answer;
    }
}