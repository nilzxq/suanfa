package leetcode.learningAll;

import java.util.HashMap;
import java.util.Map;

/**
* @author nilzxq
* @version 2019年10月31日 上午10:06:46
*类说明
*/
public class Problem_09_Array_TwoSum {

	public static int[] twoSum(int[] nums,int target) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i],i);
		}
		for(int i=0;i<nums.length;i++) {
			int n=target-nums[i];
			if(map.containsKey(nums[i])&&map.get(n)!=i) {
				return new int[]{i,map.get(n)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		int[] nums= {2,7,11,12};
		int[] result=twoSum(nums,9);
		for(int i=0;i<result.length;i++) {
		System.out.print(result[i]+" ");
		}
	}
}
