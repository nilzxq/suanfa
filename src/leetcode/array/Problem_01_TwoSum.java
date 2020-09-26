package leetcode.array;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.HashMap;

/**
 * @Author nilzxq
 * @Date 2020-09-24 11:54
 */
public class Problem_01_TwoSum {
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
