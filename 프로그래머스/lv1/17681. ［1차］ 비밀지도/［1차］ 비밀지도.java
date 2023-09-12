class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        char[] tempX = new char[n];
        for(int j = 0; j < n; j++){
            for(int i = 0; i < n; i++){
                tempX[n-i-1] = (arr1[j]%2==1 || arr2[j]%2==1)?'#':' ';
                arr1[j] /= 2;
                arr2[j] /= 2;
            }
            String tempAnswer = "";
            for(char c : tempX){
                tempAnswer += c;
            }
            answer[j] = tempAnswer;
        }
        return answer;
    }
}