//[출처]https://blog.naver.com/zkxkffks123/222612563619
import java.util.*;
 
class Solution {
    public int solution(int[][] maps) {
    	int answer = -1;
    	int n = maps.length;
    	int m = maps[0].length;
    	Queue<Position> queue = new LinkedList<>();
    	
    	queue.add(new Position(0, 0, 1));
    	maps[0][0] = 0;
    	while(!queue.isEmpty()) {
    		Position current = queue.poll();
    		
    		if(current.x == n-1 && current.y == m-1) {
    			answer = current.level;
    			break;
    		}
    		
    		if(current.x > 0 && maps[current.x-1][current.y] == 1) {
    			maps[current.x-1][current.y] = 0;
    			queue.add(new Position(current.x-1, current.y, current.level+1));
    		}
    		
    		if(current.x < n-1 && maps[current.x+1][current.y] == 1) {
    			maps[current.x+1][current.y] = 0;
    			queue.add(new Position(current.x+1, current.y, current.level+1));
    		}
    		
    		if(current.y > 0 && maps[current.x][current.y-1] == 1) {
    			maps[current.x][current.y-1] = 0;
    			queue.add(new Position(current.x, current.y-1, current.level+1));
    		}
    		
    		if(current.y < m-1 && maps[current.x][current.y+1] == 1) {
    			maps[current.x][current.y+1] = 0;
    			queue.add(new Position(current.x, current.y+1, current.level+1));
    		}
    	}
    	
        return answer;
    }
    
    public class Position{
    	public int x;
    	public int y;
    	public int level;
    	
    	public Position(int x, int y, int level) {
    		this.x = x;
    		this.y = y;
    		this.level = level;
    	}
    }
}