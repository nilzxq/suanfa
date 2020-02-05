package leetcode;

import java.util.List;

/** 
* @author nilzxq
* @version 2020年2月5日 上午9:46:54 
*类说明 
*/
public class Problem_96_Queue_CanVisitAllRooms {

	public static boolean canvisitAllRooms(List<List<Integer>> rooms) {
		boolean[] visited=new boolean[rooms.size()];
		visited[0]=true;
		dfs(rooms,0,visited);
		for(boolean res:visited)
			if(!res)
				return false;
		return true;
	}
	
	public static void dfs(List<List<Integer>>rooms,int roomNum,boolean[] visited) {
		for(int next:rooms.get(roomNum)) {
			if(!visited[next]) {
				visited[next]=true;
				dfs(rooms,next,visited);
			}
		}
	}

}
