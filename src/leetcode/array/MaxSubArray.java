package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-07-17 22:14
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]<0?nums[i]:nums[i-1]+nums[i];
            max=Math.max(nums[i],max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
