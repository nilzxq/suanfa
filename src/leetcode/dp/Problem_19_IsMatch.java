package leetcode.dp;

import java.util.Arrays;

/**
 * B站视频
 * 正则表达式匹配
 * @Author nilzxq
 * @Date 2020-08-26 7:43
 */
public class Problem_19_IsMatch {
    int[][] dp;//dp[i][j] s.substring[i]和p.substring[j]是否匹配
    String s;
    String p;
    int n,m;
    public boolean isMatch(String s,String p){
    n=s.length();
    m=p.length();
    this.s=s;
    this.p=p;
    dp=new int[n+1][m+1];
    for(int i=0;i<=n;i++){
        Arrays.fill(dp[i],-1);
    }
    return solve(0,0)==1;
    }

    private int solve(int i, int j) {
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
            //*匹配当前字母s(i)零次 直接跳过当前字母和*
            res=solve(i,j+2);
            //出现多次
            for(int k=i;k<n&&res!=1;k++){
                //&& 逆向思维
                if(s.charAt(k)!=p.charAt(j)&&p.charAt(j)!='.'){
                    break;
                }
                //匹配了k次
                res=solve(k+i,j+2);
            }
        }else if(i!=n){
            //||
            if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'){
                res=solve(i+1,j+1);
            }
        }
        return dp[i][j]=res;
    }
}
