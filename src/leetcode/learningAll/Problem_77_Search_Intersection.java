package leetcode.learningAll;

import java.util.HashSet;
import java.util.Set;

/**
* @author nilzxq
* @version 2020年1月16日 下午4:47:04
*类说明
*/
public class Problem_77_Search_Intersection {

	public static int[] intersection(int[] nums1,int[] nums2) {
		Set<Integer> set1=new HashSet<>();
		Set<Integer> set2=new HashSet<>();
		for(Integer num:nums1) {
			set1.add(num);
		}
		for(Integer num:nums2) {
			if(set1.remove(num)) {
				set2.add(num);
			}
		}
		int nums3[] = new int[set2.size ()];
        int n=0;
       for (int num:set2){
           nums3[n]=num;
           n++;
       }
       return nums3;
	}
	//内置函数 https://leetcode-cn.com/problems/intersection-of-two-arrays/solution/liang-ge-shu-zu-de-jiao-ji-by-leetcode/
	//list1 与 list2 存在相同元素，list1集合只保留list2中存在的元素
    //list1.retainAll(list2);
	public static int[] intersection1(int[] nums1,int[] nums2) {
		HashSet<Integer> set1=new HashSet<Integer>();
		for(Integer n:nums1) set1.add(n);
		HashSet<Integer> set2=new HashSet<Integer>();
		for(Integer n:nums2) set2.add(n);
		set1.retainAll(set2);
		int[] output=new int[set1.size()];
		int length=0;
		for(int s:set1) output[length++]=s;
		return output;
	}

	public static void main(String[] args) {
		int[] nums1= {1,2,2,1},nums2= {2,2};
		int[] res=intersection(nums1,nums2);
		int[] res1=intersection1(nums1,nums2);
		for(int i=0;i<res.length;i++)
		System.out.print(res[i]+" ");
		for(int i=0;i<res.length;i++)
			System.out.print(res1[i]+" ");
	}
}
