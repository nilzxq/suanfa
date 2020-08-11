package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年10月30日 下午8:30:12
*类说明
*/
public class Problem_08_Array_MoveZeroes {

	public static void moveZeroes(int[] nums) {
		if(nums==null||nums.length==0) {
			return;
		}
		int k=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				nums[k++]=nums[i];
			}
		}
		while(k<nums.length) {
			nums[k]=0;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] nums= {0,1,0,3,12};
		moveZeroes(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
