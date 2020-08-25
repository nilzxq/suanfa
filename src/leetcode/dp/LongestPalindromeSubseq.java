package leetcode.dp;

/**
 * @Author nilzxq
 * @Date 2020-08-25 6:51
 */
public class LongestPalindromeSubseq {
    public int longestPalindromeSubseq(String s){
        int n=s.length();
        //dp
        int[][] dp=new int[n][n];
        //base case
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        char[] arr=s.toCharArray();
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        //整个s的最长回文子序列长度
        return dp[0][n-1];
    }
}
