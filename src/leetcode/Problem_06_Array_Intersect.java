package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** 
* @author nilzxq
* @version 2019年10月28日 上午10:40:23 
*类说明 
*/
public class Problem_06_Array_Intersect {

	public static int[] intersect(int[] nums1,int[] nums2) {
		Map<Integer,Integer> counter=new HashMap<>();
		for(int i=0;i<nums1.length;i++) {
			int num=nums1[i];
			if(counter.containsKey(num)) {
				counter.put(num,counter.get(num)+1);
			}else {
				counter.put(num,1);
			}
		}
		List<Integer> tempList=new ArrayList<>();
		for(int i=0;i<nums2.length;i++) {
			int num=nums2[i];
			if(counter.containsKey(num)&&counter.get(num)>0) {
				counter.put(num,counter.get(num)-1);
				tempList.add(num);
			}
		}
		int[] result=new int[tempList.size()];
		for(int i=0;i<result.length;i++) {
			result[i]=tempList.get(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums1= {1, 2, 2, 1};
		int[] nums2= {2,2};
		int[] result=intersect(nums1,nums2);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
