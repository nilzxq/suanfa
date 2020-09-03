package leetcode.DFS;

/**
 * @Author nilzxq
 * @Date 2020-09-03 9:10
 */
public class Problem_13_MovingCount {
    public int movingCount(int m,int n,int k){
        //深搜
        //记录是否走过
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                return dfs(i,j,m,n,k,vis);
            }
        }
        return 0;
    }

    public int dfs(int x,int y,int m,int n,int k,boolean[][] vis){
        if(x<0||y<0||x>m-1||y>n-1){
            return 0;
        }
        if(x/10+x%10+y/10+y%10>k){
            return 0;
        }
        if(vis[x][y]){
            return 0;
        }
        vis[x][y]=true;
        return dfs(x-1,y,m,n,k,vis)+dfs(x+1,y,m,n,k,vis)+dfs(x,y-1,m,n,k,vis)+
                dfs(x,y+1,m,n,k,vis)+1;
    }
}
