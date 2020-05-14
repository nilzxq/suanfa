package leetcode;
/** 
* @author nilzxq
* @version 2020年5月14日 下午9:44:33 
*类说明 
*/
public class Problem_26_RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
		if(nums==null||nums.length==0) {
			return 0;
		}
		int i=0,j=1;
		while(j<nums.length) {
			if(nums[i]!=nums[j]) {
				nums[++i]=nums[j];
			}
			j++;
		}
		return i+1;
	}
	
	
	public static void main(String[] args) {
		int[] nums= {1,1,2};
		System.out.println(removeDuplicates(nums));
	}
}
