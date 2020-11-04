package leetcode.DFS;

/**
 * 岛屿数量
 * @Author nilzxq
 * @Date 2020-11-04 17:13
 */
public class Problem_200_NumIsIands {
    public static int numIsIands(char[][] grid){
        if(grid.length==0||grid[0].length==0){
            return 0;
        }
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void dfs(char[][] grid,int r,int c){
        if((r<0||c<0||r>=grid.length||c>=grid[0].length||grid[r][c]=='0')){
            return;
        }
        grid[r][c]='0';
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
    }

    public static void main(String[] args) {
        char[][] grid={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIsIands(grid));
    }
}
