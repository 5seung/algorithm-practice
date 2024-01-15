class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for(String i : arr){
            min = Math.min(Integer.parseInt(i), min);
            max = Math.max(Integer.parseInt(i), max);
        }
        String answer = min+" "+max;
        return answer;
    }
}