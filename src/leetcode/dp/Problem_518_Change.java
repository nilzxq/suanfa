package leetcode.dp;

/**
 *零钱兑换
 * @Author nilzxq
 * @Date 2020-08-22 18:33
 */
public class Problem_518_Change {
    //若只使用 coins 中的前 i 个硬币的面值，若想凑出金额 j，有 dp[i][j] 种凑法。
    public static int change(int amount,int[] coins){
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        //base case
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(j-coins[i-1]>=0){
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }

    public int change1(int amount,int[] coins){
        int n=coins.length;
        int[][] dp=new int[n+1][amount+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                if(j>=coins[i-1]){
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][amount];
    }
}
