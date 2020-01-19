package leetcode;

import java.util.HashSet;

/** 
* @author nilzxq
* @version 2020年1月17日 下午12:46:24 
*类说明 
*/
public class Problem_78_Search_FindDuplicate {

	public static int findDuplicate(int[] nums) {
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(set.add(nums[i])!=false)
			set.add(nums[i]);
			else{
				return nums[i];
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums= {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
	
}
