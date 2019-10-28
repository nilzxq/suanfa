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
	
	//如果给定的数组已经排好序呢？你将如何优化你的算法？
	
	public static int[] intersect2(int nums1[],int nums2[]) {
		int cur1=0,cur2=0;
		List<Integer> tempArray=new ArrayList<>();
		while(cur1<nums1.length&&cur2<nums2.length) {
			int num1=nums1[cur1];
			int num2=nums2[cur2];
			if(num1==num2) {
				tempArray.add(num1);
				cur1++;
				cur2++;
			}else if(num1>num2) {
				cur2++;
			}else {
				cur1++;
			}
		}
		int[] result=new int[tempArray.size()];
		for(int i=0;i<result.length;i++) {
			result[i]=tempArray.get(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums1= {1, 2, 2, 1};
		int[] nums2= {2,2};
		int[] nums3= {1,1,2, 2,};
		int[] nums4= {2,2};
		int[] result1=intersect(nums1,nums2);
		int[] result2=intersect2(nums3,nums4);
		for(int i=0;i<result1.length;i++) {
			System.out.print(result1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<result2.length;i++) {
			System.out.print(result2[i]+" ");
		}
	}
}
