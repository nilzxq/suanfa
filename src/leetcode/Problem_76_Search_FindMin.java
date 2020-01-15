package leetcode;
/** 
* @author nilzxq
* @version 2020年1月15日 上午11:11:46 
*类说明 
*/
public class Problem_76_Search_FindMin {

	public static int findMin(int[] nums) {
		int left=0;
		int right=nums.length-1;
		while(left<right) {
			int mid=left+(right-left)/2;
			if(nums[right]<nums[mid]) {
				left=mid+1;
			}else if(nums[left]>nums[mid]) {
				right=mid;
			}else {
				right--;
			}
		}
		return nums[left];
	}
	
	public static void main(String[] args) {
		int[] nums= {2,2,2,0,1};
		System.out.println(findMin(nums));
	}
}
