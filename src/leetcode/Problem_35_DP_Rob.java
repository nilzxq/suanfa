package leetcode;
/** 
* @author nilzxq
* @version 2019年12月4日 下午7:36:21 
*类说明 
*/
public class Problem_35_DP_Rob {

	public static int rob(int[] nums) {
		/**
		 * 以下错误 举例：【2，1，1，2】
		 */
//		if(nums== null||nums.length==0) {
//			return 0;
//		}
//		int len=nums.length;
//		int result1=0;
//		int result2=0;
//		for(int i=0;i<nums.length;i=i+2) {
//			result1+=nums[i];
//		}
//		for(int i=1;i<nums.length;i=i+2) {
//			result2+=nums[i];
//		}
//		return result1>result2?result1:result2;
		if(nums== null||nums.length==0) {
			return 0;
		}
		int len=nums.length;
		int[] res=new int[len+1];
		res[0]=0;
		res[1]=nums[0];
		for(int i=2;i<=len;i++) {
			res[i]=Math.max(res[i-1], res[i-2]+nums[i-1]);
		}
		return res[len];
	}
	
	public static void main(String[] args) {
		int[] nums= {2,7,9,3,1};
		System.out.println(rob(nums));
	}
}
