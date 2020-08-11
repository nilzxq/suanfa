package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月10日 下午5:43:17
*类说明
*/
public class Problem_71_Search_FindMin {

	 public static int findMin(int[] nums) {
	    if(nums.length==0||nums==null) {
	    	return -1;
	    }
	    if(nums.length==1) {
	    	return nums[0];
	    }
	    int left=0;
	    int right=nums.length-1;
	    while(left<right) {
	    	int mid=left+(right-left)/2;
	    	if(nums[mid]>nums[right]) {
	    		left=mid+1;
	    	}else if(nums[mid]<nums[right]) {
	    		right=mid;
	    	}else {
	    		right=right-1;
	    	}
	    }
	    return nums[left];
	 }

	 public static void main(String[] args) {
		int[] nums= {3,4,5,1,2};
		System.out.println(findMin(nums));
	}
}
