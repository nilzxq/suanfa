package leetcode;
/** 
* @author nilzxq
* @version 2020年1月2日 下午7:01:51 
*类说明 
*/
public class Problem_63_Array_MinSubArrayLen {

	public static int minSubArrayLen(int s,int[] nums) {
		int left=0;
		int right=-1;
		int sum=0;
		int len=nums.length+1;
		while(left<nums.length) {
			if(right+1<nums.length&&sum<s) {
				right++;
				sum+=nums[right];
			}else {
				sum-=nums[left];
				left++;
			}
			if(sum>=s) {
				len=Math.min(len,right-left+1);
			}
		}
		if(len==nums.length+1) {
			return 0;
		}else {
			return len;
		}
	}
	
	public static void main(String[] args) {
		int s=7;
		int[] nums= {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(s,nums));
	}
}
