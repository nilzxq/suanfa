package leetcode.array;

import java.util.Arrays;

/**
 * 最小移动次数使数组元素相等
 * n-1个元素增加1 等价于1个元素减少1
 * @Author nilzxq
 * @Date 2020-09-11 19:09
 */
public class Problem_453_minMoves {
    public int minMoves(int[] nums){
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]-nums[0];
        }
        return sum;
    }
}
