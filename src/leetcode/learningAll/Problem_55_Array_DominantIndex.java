package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年12月25日 下午4:43:56
*类说明
*/

public class Problem_55_Array_DominantIndex {

	public static int dominantIndex(int[] nums) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		int flag=-1;
		//3,6,4,0
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max1) {
				max2=max1;
				max1=nums[i];
				flag=i;
			}else if(nums[i]>max2) {
				max2=nums[i];
			}
		}
		return max1>=max2*2?flag:-1;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int [] nums1 = {3,6,1,0};
		System.out.println(dominantIndex(nums));
		System.out.println(dominantIndex(nums1));
	}
}
