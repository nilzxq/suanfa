package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年10月26日 下午2:46:29
*类说明
*/
public class Problem_05_Array_SingleNumber {

	public static int singleNumber(int[] nums) {
		int num=0;
		for(int i=0;i<nums.length;i++) {
			num=num^nums[i];
		}
		return num;
	}

	public static void main(String[] args) {
		int[] nums= {2,2,1};
		System.out.println(singleNumber(nums));
	}
}
