package leetcode.learningAll;

/**
 * @author nilzxq
 * @version 2019年10月22日 下午3:21:13 类说明
 */
public class Problem_01_Array_RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
		if (nums == null) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[count] != nums[i]) {
				count++;
				nums[count] = nums[i];
			}
		}
		return (count + 1);
	}

	public static void main(String[] args) {
		int[] nums= {0,0,1,1,2,2,3,3,4};
		int len=removeDuplicates(nums);
		for(int i=0;i<len;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
