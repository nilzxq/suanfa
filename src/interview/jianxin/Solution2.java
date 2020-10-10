package interview.jianxin;

/**
 * @Author nilzxq
 * @Date 2020-10-10 19:49
 */
public class Solution2 {
    public int findFriendNum (int[][] M) {
        // write code here
        int row=M.length;
        int col=M[0].length;
        int res=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(M[i][j]==1){
                    dfs(M,i,j);
                    res++;
                }
            }
        }
        return res;
    }

    private void dfs(int[][] m, int row, int col) {
        if(row<0||col<0||row>=m.length||col>=m[0].length||m[row][col]==0){
            return;
        }
        //标记已经访问过
        m[row][col]=0;
        dfs(m,row-1,col);
        dfs(m,row+1,col);
        dfs(m,row,col-1);
        dfs(m,row,col+1);

    }

    boolean helper(int[][] m,int r,int c){
        return 0<=r&&r<m.length&&0<=c&&c<m[0].length;
    }
}
