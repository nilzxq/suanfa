package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年12月31日 下午5:14:28
*类说明
*/
public class Problem_61_Array_RemoveElement {

	public static int removeElement(int[] nums, int val) {
		int k=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]!=val) {
        		nums[k++]=nums[i];
        	}
        }
        return k;
    }

	public static void main(String[] args) {
		int[] nums= {0,1,2,2,3,0,4,2};
		int val=2;
		System.out.println(removeElement(nums,val));
	}
}
