package leetcode;
/** 
* @author nilzxq
* @version 2019年12月3日 下午8:58:58 
*类说明 
*/
public class Problem_33_DP_MaxSubArray {

	public static int maxSubArray(int[] nums) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		int max=Integer.MIN_VALUE;
		int cur=0;
		for(int i=0;i<nums.length;i++) {
			cur+=nums[i];
			max=Math.max(max,cur);
			cur=cur<0?0:cur;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
}
