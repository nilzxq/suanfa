package leetcode.dp;

import java.util.Arrays;

/**
 * @Author nilzxq
 * @Date 2020-07-22 23:14
 */
public class Problem_19_DP_IsMatch {
    public static void main(String[] args) {

    }
}
class Solution1{
    int[][] dp;
    String s;
    String p;
    int n,m;
    public boolean isMatch(String s, String p) {
        //字符串匹配
        this.s=s;
        this.p=p;
        n=s.length();
        m=s.length();
        dp=new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0)==1;
    }

    private int solve(int i,int j) {
        if(i==n&&j==m){
            return 1;
        }
        if(j==m){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int res=0;
        if(j+1<m&&p.charAt(j+1)=='*'){
            res=solve(i,j+2);
            for(int k=i;k<n&&res!=1;k++){
                if(s.charAt(k)!=p.charAt(j)&&p.charAt(j)!='.'){
                    break;
                }
                res=solve(k+1,j+2);
            }
            }else if(i!=m){
            if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
                res=solve(i+1,j+1);
            }
        }
        return dp[i][j]=res;
    }


}
