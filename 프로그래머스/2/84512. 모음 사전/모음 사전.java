class Solution {
    public int solution(String word) {
        //A E I O U
        int answer = 0;
        int[] count = {781, 156, 31, 6, 1};
        for(int i=0; i<word.length(); i++) {
        	answer++;
        	int Idx = idxChar(word.charAt(i));
        	answer += Idx * count[i];
        }
        
        return answer;
    }
    
    public int idxChar(char a){
        switch (a){
            case 'A' : return 0;
            case 'E' : return 1;
            case 'I' : return 2;
            case 'O' : return 3;
            case 'U' : return 4;
        }
        return 0;
    }
}