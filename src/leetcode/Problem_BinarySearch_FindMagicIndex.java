package leetcode;
/** 
* @author nilzxq
* @version 2020年5月10日 下午9:59:12 
*类说明 
*/
public class Problem_BinarySearch_FindMagicIndex {

	public static int res=-1;
	public static int findMagicIndex(int[] nums) {
		search(nums,0,nums.length-1);
		return res;
	}
	
	public static void search(int[] nums,int low,int high) {
		if(low>high) return;
		int mid=low+(high-low)/2;
		//如果找到，则从左半边继续查找更小的解
		if(nums[mid]==mid) {
			res=mid;
			search(nums,low,mid-1);
		}
		//如果未找到，则先搜索左半边，左半边无解的情况下再搜索右半边
		else {
            search(nums, low, mid - 1);
            if(-1 == res) search(nums, mid + 1, high);
        }
	}
	
	public static void main(String[] args) {
		int[] nums= {0,2,3,4,5};
		System.out.println(findMagicIndex(nums));
	}
}
