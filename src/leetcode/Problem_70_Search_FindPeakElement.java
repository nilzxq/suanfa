package leetcode;
/** 
* @author nilzxq
* @version 2020年1月9日 下午1:17:54 
*类说明 
*/
public class Problem_70_Search_FindPeakElement {

	public static int findPeakElement(int[] nums) {
        if(nums.length==1) {
        	return 0;
        }
        if(nums[0]>nums[1]) {
        	return 0;
        }
        int length=nums.length;
        if(nums[length-1]>nums[length-2]) {
        	return length-1;
        }
        int left=0;
        int right=length-1;
        while(left<right) {
        	int mid=left+(right-left)/2;
        	if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return mid;
        	if(nums[mid]<nums[mid+1]) left=mid+1;
        	else  right=mid;
        }
        if(left == right && nums[left] > nums[left-1])
            return left;
        return -1;
    }
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,1};
		System.out.println(findPeakElement(nums));
	}
}
