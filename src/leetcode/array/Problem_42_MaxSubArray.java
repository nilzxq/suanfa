package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-08-17 21:18
 */
public class Problem_42_MaxSubArray {

    public int maxSubArray(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
            res=Math.max(dp[i],res);
        }
        return res;
    }
}
