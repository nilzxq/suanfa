package leetcode;

import java.util.Random;

/** 
* @author nilzxq
* @version 2019年12月5日 下午9:08:15 
*类说明 
*/
public class Problem_36_Design_Solution {

	public static class Solution{
		private int[] nums;
		private Random random;
		
		public Solution(int[] nums) {
			this.nums=nums;
			random=new Random();
		}
		
		public int[] reset() {
			return nums;
		}
		
		public int[] shuffle() {
			if(nums==null) {
				return null;
			}
			int[] a=nums.clone();
			for(int j=1;j<a.length;j++) {
				/**
				 * 在随机产生一个序列的时候, 遍历每一个元素, 
				 * 并且随机一个从他开始的位置与这个位置交换, 
				 * 这样任意一个元素随机到任意一个位置的概率都是1/n
				 *nextInt 该方法的作用是生成一个随机的int值，
				 * 该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n
				 */
				int i=random.nextInt(j+1);
				swap(a,i,j);
			}
			return a;
		}
		
		private void swap(int[] a,int i,int j) {
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
	}
	
	
}
