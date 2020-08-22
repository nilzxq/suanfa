package leetcode.dp;

import java.util.Arrays;

/**
 * @Author nilzxq
 * @Date 2020-08-22 16:38
 */
public class Problem_416_CanPartition {
    //如果dp[4][9] = true，其含义为：对于容量为 9 的背包，
    // 若只是用前 4 个物品，可以有一种方法把背包恰好装满。
    public boolean canPartition(int[] nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        //和为奇数 不可能划分成两个和相等的集合
        if(sum%2!=0){
            return false;
        }
        int n=nums.length;
        sum=sum/2;
        //创建二维状态数组，行：物品索引，列：容量（包括0）
        boolean[][] dp=new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                dp[i][j]=false;
            }
        }
        //base case
        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(j-nums[i-1]<0){
                    //背包容量不足，不能装入第i个物品
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[n][sum];
    }

    //状态压缩
    public boolean canPartition1(int[] nums){
        int sum=0,n=nums.length;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2!=0){
            return false;
        }
        sum=sum/2;
        boolean[] dp=new boolean[sum+1];
        dp[0]=true;
        for(int i=0;i<n;i++){
            //唯一需要注意的是j应该从后往前反向遍历，
            // 因为每个物品（或者说数字）只能用一次，
            // 以免之前的结果影响其他的结果。
            for(int j=sum;j>=0;j--){
                if (j - nums[i] >= 0) {
                    dp[j] = dp[j] || dp[j - nums[i]];
                }
            }
        }
        return dp[sum];
    }
}
