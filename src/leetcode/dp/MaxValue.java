package leetcode.dp;

/**
 * @Author nilzxq
 * @Date 2020-06-26 22:19
 */
public class MaxValue {
    public static int maxValue(int[][] grid){
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0&&j==0) continue;
                if(i==0) grid[i][j]+=grid[i][j-1];
                else if(j==0) grid[i][j]+=grid[i-1][j];
                else grid[i][j]+=Math.max(grid[i][j-1],grid[i-1][j]);
            }
        }
        return grid[row-1][col-1];
    }

    public static int maxValue2(int[][] grid){
        int row = grid.length;
        int column = grid[0].length;
        //dp[i][j]表示从grid[0][0]到grid[i - 1][j - 1]时的最大价值
        int[][] dp = new int[row + 1][column + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return dp[row][column];
    }

    public static void main(String[] args) {
        int[][] nums={{1,3,1},{1,5,1},{4,2,1}};
        //System.out.println(maxValue(nums));
        System.out.println(maxValue2(nums));
    }
}
