package leetcode.string;

import java.util.Arrays;

/**
 * 最长上升子序列
 * @Author nilzxq
 * @Date 2020-08-22 10:50
 */
public class Problem_300_LengthOfLIS {
    public static int lengthOfLIS(int[] nums){
        int[] dp=new int[nums.length];
        //初始值为1
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                //递增
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }

            }
        }
        int res=0;
        for(int a:dp){
            if(a>res){
                res=a;
            }
        }
        return res;
    }

}
