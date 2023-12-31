class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] c = my_string.toCharArray();
        c[num1] = my_string.charAt(num2);
        c[num2] = my_string.charAt(num1);
        String answer = new String(c);
        return answer;
    }
}