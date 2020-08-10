package leetcode.dp;

/**
 * @Author nilzxq
 * @Date 2020-08-10 8:09
 *
 * 连续子数组的最大和
 */
public class Problem_42_MaxSubArray {
    public static int maxSubArray(int[] nums){
        int[] dp=new  int[nums.length];
        //dp[0]=nums[0];
        int  max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            //这里注意，如何把dp[0]先前赋值之后，for循环里只比较了max和1到length-1的数的大小 忽略了从一开始就是最大的情况
            if(i==0){
                dp[i]=nums[i];
            }
            //如何加上dp[i-1]+nums[i]  < nums[i] 那就代表以nums[i]要另起炉灶
//            else if(dp[i-1]>0){
//                dp[i]=dp[i-1]+nums[i];
//            }else{
//                dp[i]=nums[i];
//            }
           else {
               dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }

    /**
     * 变形题交替和
     * @param args
     */

    public static void main(String[] args) {
        int[] nums={-1,-2};
        System.out.println(maxSubArray(nums));
    }
}
