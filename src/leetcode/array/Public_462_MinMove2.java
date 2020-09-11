package leetcode.array;

import java.util.Arrays;

/**
 * @Author nilzxq
 * @Date 2020-09-11 19:36
 */
public class Public_462_MinMove2 {
    public int minMove2(int[] nums){
        Arrays.sort(nums);
        int sum=0;
        int i=0,j=nums.length-1;
        while(i<j){
            sum+=nums[j--]-nums[i++];
        }
        return sum;
    }
}
