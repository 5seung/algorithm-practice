class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(String[] user : db){
            if(user[0].equals(id_pw[0])){
                answer = user[1].equals(id_pw[1]) ? "login" : "wrong pw";
            }
        }
        return answer;
    }
}