package leetcode;
/** 
* @author nilzxq
* @version 2020年1月5日 上午11:49:15 
*类说明 
*/
public class Problem_66_Search_Search {

	public static int search(int[] nums,int target) {
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]>target) {
				right=mid-1;
			}else if(nums[mid]<target){
				left=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		System.out.println(search(nums,target));
	}
}
