package leetcode.learningAll;

import java.util.Arrays;

/**
* @author nilzxq
* @version 2020年1月20日 上午11:41:34
*类说明
*/
public class Problem_80_Search_SmallestDistancePair {

	public static int smallestDistancePair(int[] nums,int k) {
		Arrays.sort(nums);
		int low=0;
		int high=nums[nums.length-1]-nums[0];
		while(low<high) {
			int mid=(low+high)/2;
			int count=0,left=0;
			for(int right=0;right<nums.length;++right) {
				while(nums[right]-nums[left]>mid) left++;
				count+=right-left;
			}
			//count=numer of pairs with distance<=mid
			if(count>=k) high=mid;
			else low=mid+1;
		}
		return low;
	}

	public static void main(String[] args) {
		int[] nums= {1,3,1};
		int k=1;
		System.out.println(smallestDistancePair(nums,k));
	}
}
