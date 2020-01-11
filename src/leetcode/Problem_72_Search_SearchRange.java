package leetcode;
/** 
* @author nilzxq
* @version 2020年1月11日 上午9:34:31 
*类说明 
*/
public class Problem_72_Search_SearchRange {

	public static int[] searchRange(int[] nums,int target) {
		int[] result= {-1,-1};
		result[0]=findLeftIndex(nums,target);
		if(result[0]!=-1) {
			result[1]=findRightIndex(nums,result[0],target);
		}
		return result;

	}
	
	public static int findLeftIndex(int[] nums,int target) {
		int left=0;
		int right=nums.length-1;
		int leftIndex=-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(nums[mid]<target) {
				left=mid+1;
			}else if(nums[mid]>target) {
				right=mid-1;
			}else {
				leftIndex=mid;
				right=mid-1;
			}
		}
		return leftIndex;
	}
	
	public static int findRightIndex(int[] nums,int left,int target) {
		int right=nums.length-1;
		int rightIndex=-1;
		while(left<=right) {
			int mid=left+(right-left)/2;
			if(nums[mid]<target) {
				left=mid+1;
			}else if(nums[mid]>target){
				right=mid-1;
			}else {
				rightIndex=mid;
				left=mid+1;
			}
		}
		return rightIndex;
	}
	
	public static void main(String[] args) {
		int[] nums= {5,7,7,8,8,10};
		int target=8;
		int[] result=searchRange(nums,target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}
