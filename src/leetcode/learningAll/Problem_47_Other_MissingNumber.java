package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年12月16日 下午6:20:17
*类说明
*/
public class Problem_47_Other_MissingNumber {

	 public static int missingNumber(int[] nums) {
		 int res=nums.length;
		 for(int i=0;i<nums.length;i++) {
			 res+=(i-nums[i]);
		 }
		 return res;
	 }

}
