package leetcode.array;

/**
 * 57 和为s的两个数字
 * @Author nilzxq
 * @Date 2020-08-18 7:59
 */
public class Problem_57_TwoSum {
    public int[] twoSum(int[] nums,int target){
        int i=0,j=nums.length-1;
        while(i<j){
            int s=nums[i]+nums[j];
            if(s>target){
                j--;
            }else if(s<target){
                i++;
            }else{
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[0];
    }
}
