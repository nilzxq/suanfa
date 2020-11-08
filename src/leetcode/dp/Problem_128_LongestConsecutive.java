package leetcode.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * 最长连续序列
 * @Author nilzxq
 * @Date 2020-11-08 17:26
 */
public class Problem_128_LongestConsecutive {
    public int longestConsecutive(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                continue;
            }
            int left=map.getOrDefault(nums[i]-1,0);
            int right=map.getOrDefault(nums[i]+1,0);
            //画图理解
            int len=right+left+1;
            max=Math.max(max,len);
            map.put(nums[i],len);
            map.put(nums[i]-1,len);
            map.put(nums[i]+1,len);
        }
        return max;
    }
}
