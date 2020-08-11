package leetcode.learningAll;

import java.util.Arrays;

/**
* @author nilzxq
* @version 2019年10月25日 上午10:53:47
*类说明
*/
public class Problem_04_Array_ContainsDuplicate {

	public static boolean containsDuplicate(int[] nums) {
		if(nums.length==1) {
			return false;
		}
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==nums[i+1]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums= {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}
}
