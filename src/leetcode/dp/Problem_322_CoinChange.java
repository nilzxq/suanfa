package leetcode.dp;

/**
 * 零钱兑换
 * @Author nilzxq
 * @Date 2020-08-12 9:53
 */
public class Problem_322_CoinChange {
    public static int coinChange(int[] coins,int amount){
        //要凑出金额n,至少要dp[n]个硬币
        int[] dp=new int[amount+1];
        for(int i=0;i<amount+1;i++){
            dp[i]=i==0?0:amount+1;
            for(int coin:coins){
                if(i>=coin){
                    dp[i]=Math.min(dp[i-coin]+1,dp[i]);
                }
            }

        }
        return dp[amount]==amount+1?-1:dp[amount];
    }

    public static int coinChange1(int[] coins,int amount){
        //要凑出金额n,至少要dp[n]个硬币
        int[] dp=new int[amount+1];
        for(int i=0;i<amount+1;i++){
            dp[i]=i==0?0:Integer.MAX_VALUE;
            for(int coin:coins){
                if(i>=coin){
                    dp[i]=Math.min(dp[i-coin]+1,dp[i]);
                }
            }

        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }

    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=11;
        System.out.println(coinChange1(coins,amount));
    }

}
