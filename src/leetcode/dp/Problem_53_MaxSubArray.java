package leetcode.dp;

/**
 * @Author nilzxq
 * @Date 2020-08-13 8:32
 */
public class Problem_53_MaxSubArray {
    public int maxSubArray(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        int[] dp=new int[nums.length+1];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            dp[i]=i==0?nums[0]:Math.max(dp[i-1]+nums[i],nums[i]);
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
}
