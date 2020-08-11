package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月23日 上午11:50:55
*类说明
*/
public class Problem_83_Queue_NumIslands {

	public static int numIsIands(char[][] grid) {
		int n=grid.length,m=grid[0].length;
		if(n==0||m==0) return 0;
		boolean[][] visited=new boolean[n][m];
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(grid[i][j]=='1'&&!visited[i][j]) {
					numIslandsDFS(grid,visited,i,j);
					count++;
				}
			}
		}
		return count;
	}

	public static void numIslandsDFS(char[][] grid,boolean[][] visited,int x,int y) {
		if(x<0||x>=grid.length) return;
		if(y<0||y>=grid[0].length) return;
		if(grid[x][y]!='1'||visited[x][y]) return;
		visited[x][y]=true;
		numIslandsDFS(grid, visited, x - 1, y);
        numIslandsDFS(grid, visited, x + 1, y);
        numIslandsDFS(grid, visited, x, y - 1);
        numIslandsDFS(grid, visited, x, y + 1);
	}

	public static void main(String[] args) {
		char[][] grid= {{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
		};
		System.out.println(numIsIands(grid));
	}
}
