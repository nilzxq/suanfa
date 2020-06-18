package leetcode;

/**
 * @Author nilzxq
 * @Date 2020-06-18 23:00
 */
public class Problem_63_DP_UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row=obstacleGrid.length;
        int col=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        obstacleGrid[0][0]=1;
        for(int i=1;i<col;i++){
            obstacleGrid[0][i]=obstacleGrid[0][i]==0&&obstacleGrid[0][i-1]==1?1:0;
        }
        for(int i=1;i<row;i++){
            obstacleGrid[i][0]=obstacleGrid[i][0]==0&&obstacleGrid[i-1][0]==1?1:0;
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(obstacleGrid[i][j]==0){
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }else{
                    obstacleGrid[i][j]=0;
                }
            }
        }
        return obstacleGrid[row-1][col-1];
    }

    public static void main(String[] args) {
        Problem_63_DP_UniquePathsWithObstacles uniquePathsWithObstacles=new Problem_63_DP_UniquePathsWithObstacles();
        int[][] grid={{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles.uniquePathsWithObstacles(grid));
    }
}
