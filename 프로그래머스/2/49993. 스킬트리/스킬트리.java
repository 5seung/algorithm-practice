class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i = 0; i < skill_trees.length; i++) {
            //선행스킬들만 남도록 변환
            String pre = skill_trees[i].replaceAll("[^" + skill + "]", "");
            //원래 선행 스킬 순서를 앞에서 부터 변환한 선행스킬의 길이만큼 잘라냄
            String need = skill.substring(0, pre.length());

            if(pre.equals(need)) {
                answer++;
            }
        }
        return answer;
    }
}