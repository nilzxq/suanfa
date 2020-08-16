package leetcode.dp;

/**
 * 343 整数拆分
 * @Author nilzxq
 * @Date 2020-08-16 6:52
 */
public class Problem_343_IntegerBreak {
    public static int integerBreak(int n){
        //长度为n的最大值
        int[] dp=new int[n+1];
        if(n<2){
            return 1;
        }
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        //>=4时 2，3不划分
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        for(int i=4;i<=n;i++){
            for(int j=1;j<=(i/2);j++){
                dp[i]=Math.max(dp[i],dp[j]*dp[j-i]);
            }
        }
        return dp[n];
    }
}
