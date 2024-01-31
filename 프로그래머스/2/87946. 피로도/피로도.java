// k : 현재 피로도
// dungeons의 각 행은 각 던전의 ["최소 필요 피로도", "소모 피로도"]
class Solution {
    // 정수의 최소값을 표현
    int answer = Integer.MIN_VALUE;
    
    public int solution(int k, int[][] dungeons) {
        // 방문 여부 체크
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited);

        return answer;
    }

    public void dfs(int k, int[][] dungeons, boolean[] visited) {
        int count = 0;
        for(int i = 0; i<visited.length; i++) {
            if(visited[i]) {
                count++;
            }
        }
        if(count > answer) {
            answer = count;
        }


        for(int i = 0; i<dungeons.length; i++) {
            if(!visited[i]) {
                if(dungeons[i][0] <= k) {
                    visited[i] = true;
                    k -= dungeons[i][1];
                    dfs(k, dungeons, visited);
                    k += dungeons[i][1];
                    visited[i] = false;
                }
            }
        }
    }
}