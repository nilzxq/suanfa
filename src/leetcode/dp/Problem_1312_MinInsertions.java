package leetcode.dp;

/**
 * 让字符串成为回文串的最少插入次数
 * @Author nilzxq
 * @Date 2020-09-03 15:31
 */
public class Problem_1312_MinInsertions {
    public int minInsertions(String s){
        int length=s.length();
        //dp[i][j]的定义如下：对字符串s[i..j]，最少需要进行dp[i][j]次插入才能变成回文串。
        int[][] dp=new int[length][length];
        //从下向上遍历
        for(int i=length-2;i>=0;i--){
            //从左向右遍历
            for(int j=i+1;j<length;j++){
                if(s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i][j-1],dp[i+1][j])+1;
                }
            }
        }
        return dp[0][length-1];
    }
}
