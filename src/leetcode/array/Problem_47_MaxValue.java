package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-08-07 16:34
 */
public class Problem_47_MaxValue {
    public static int maxValue(int[][] grid){
        int row=grid.length;
        int col=grid[0].length;
        int[][] dp=new  int[row][col];
        dp[0][0]=grid[0][0];
        for(int i=1;i<col;i++){
            dp[0][i]=dp[0][i-1]+grid[0][i];
        }
        //System.out.println(dp[0][0]+" ");
        for(int i=1;i<row;i++){
            dp[i][0]=dp[i-1][0]+grid[i][0];
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j])+grid[i][j];
                //System.out.println(i+" "+j+" "+dp[i][j]);
            }
        }
        return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        int[][] a= {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(maxValue(a));
    }
}
