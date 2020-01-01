package leetcode;
/** 
* @author nilzxq
* @version 2020年1月1日 上午10:44:31 
*类说明 
*/
public class Problem_62_Array_FindMaxConsecutiveOnes {

	public static int findMaxConsecutiveOnes(int[] nums) {
		int tmp=0;
		int length=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=1) {
				tmp=length>tmp?length:tmp;
				length=0;
			}
			if(nums[i]==1) {
				length++;
				tmp=length>tmp?length:tmp;
			}
		}
		return tmp;
	}
	
	public static void main(String[] args) {
		int[] nums= {1,1,0,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
}
