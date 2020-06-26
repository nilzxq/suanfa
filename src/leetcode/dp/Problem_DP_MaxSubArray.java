package leetcode.dp;

/**
 * @Author nilzxq
 * @Date 2020-06-21 23:42
 */
public class Problem_DP_MaxSubArray {
    public static int maxSubArray(int[] nums){
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]+=Math.max(nums[i-1],0);
            if(nums[i]>res){
                res=nums[i];
            }
        }
        return res;
    }

    public static int maxSubArray2(int[] nums){
        int pre=0;
        int max=nums[0];
        int cur=nums[0];
        for(int num:nums){
            cur=num;
            if(pre>0) cur+=pre;
            if(cur>max) max=cur;
            pre=cur;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
        System.out.println(maxSubArray2(nums));
    }


}
