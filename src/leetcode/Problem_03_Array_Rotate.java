package leetcode;
/** 
* @author nilzxq
* @version 2019年10月24日 上午11:20:22 
*类说明 
*/
public class Problem_03_Array_Rotate {

	public static void rotate(int[] nums,int k) {
		int tmp=0;
		for(int i=0;i<k;i++) {
			tmp=nums[nums.length-1];
			for(int j=nums.length-2;j>=0;j--) {
				nums[j+1]=nums[j];
			}
			nums[0]=tmp;
		}
	}
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		rotate(nums,k);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
