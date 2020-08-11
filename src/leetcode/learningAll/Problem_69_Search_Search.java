package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月8日 上午11:28:11
*类说明
*/
public class Problem_69_Search_Search {

	public static int search(int[] nums,int target) {
		if(nums.length==0||nums==null) return -1;
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(nums[mid]==target) return mid;
			else if(nums[mid]<nums[right]) {
				if(nums[mid]<target&&nums[right]>=target) left=mid+1;
				else right=mid-1;
			}else {
				if(nums[left]<=target&&nums[mid]>target) right=mid-1;
				else left=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums= {4,5,6,7,0,1,2};
		int target=0;
		System.out.println(search(nums,target));
	}
}
