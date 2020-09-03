package leetcode.math;

/**
 * @Author nilzxq
 * @Date 2020-09-02 21:43
 */
public class Problem_60_TwoSum {
    public double[] twoSum(int n){
        int[][] dp=new int[n+1][6*n+1];//dp[骰子的个数][所有可能的值]
        for(int i=1;i<=6;i++){
            dp[1][i]=1;
        }
        //i代表当前骰子的个数
        for(int i=2;i<=n;i++){
            //j代表当前值的和
            for(int j=i;j<=6*n;j++){
                //k<=j!!!
                for(int k=1;k<=6&&k<=j;k++){//k代表当前骰子的值
                    dp[i][j]+=dp[i-1][j-k];
                }
            }
        }
        //总次数
        final double total=Math.pow(6,n);
        //6n-n+1=5n+1 和为【n,6n】
        double[] ans=new double[5*n+1];
        for(int i=n;i<=6*n;i++){
            ans[i-n]=dp[n][i]/total;
        }
        return ans;
    }
}
