package leetcode;

import java.util.HashMap;

/** 
* @author nilzxq
* @version 2020年2月11日 下午6:30:31 
*类说明 
*/
public class Problem_102_HashMap_ContainsNearbyDuplicate {

	public static boolean containsNearbyDuplicate(int[] nums,int k) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				int sub=i-map.get(nums[i]);
				if(sub<=k) return true;
				else map.put(nums[i],i);
			}
			map.put(nums[i], i);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums1= {1,2,3,1};
		int[] nums2= {1,2,1};
		int k1=3,k2=0;
		System.out.println(containsNearbyDuplicate(nums1,k1));
		System.out.println(containsNearbyDuplicate(nums2,k2));
	}
}
