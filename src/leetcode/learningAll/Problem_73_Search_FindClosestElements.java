package leetcode.learningAll;

import java.util.ArrayList;
import java.util.List;

/**
* @author nilzxq
* @version 2020年1月12日 上午11:41:25
*类说明
*/
public class Problem_73_Search_FindClosestElements {

	public static List<Integer> findClosestElements(int[] arr,int k,int x ){
		List<Integer> res=new ArrayList<>();
		int start=0;
		int end=arr.length-k;
		while(start<end) {
			int mid=start+(end-start)/2;
			if(Math.abs(arr[mid]-x)>Math.abs(arr[mid+k]-x)) {
				start=mid+1;
			}else {
				end=mid;
			}
		}
		for(int i=start;i<start+k;i++) {
			res.add(arr[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println(findClosestElements(arr,4,3));
	}
}
