package leetcode.dp;

/**
 * 编辑距离
 * @Author nilzxq
 * @Date 2020-08-23 11:52
 */
public class Problem_72_MinDistance {
    //dp[i][j]返回 s1[0..i] 和 s2[0..j] 的最小编辑距离
    public int minDistance(String word1,String word2){
        int length1=word1.length();
        int length2=word2.length();
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();
        int[][] dp=new int[length1+1][length2+1];
        //base case
        for(int i=1;i<=length1;i++){
            dp[i][0]=i;
        }
        for(int j=1;j<=length2;j++){
            dp[0][j]=j;
        }
        for(int i=1;i<=length1;i++){
            for(int j=1;j<=length2;j++){
                //跳过
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    //dp[i-1][j-1]替换
                    //dp[i-1][j]插入
                    //dp[i][j-1]删除
                    dp[i][j]=Math.min(dp[i-1][j-1]+1,Math.min(dp[i][j-1]+1,dp[i-1][j]+1));
                }
            }
        }
        return dp[length1][length2];
    }
}
