package leetcode;

import java.util.Random;

/** 
* @author nilzxq
* @version 2019年12月5日 下午9:08:15 
*类说明 
*/
public class Problem_36_Design_Solution {
	
	public static class Solution{
		private int[] origin;
		
		public Solution(int[] nums) {
			this.origin = nums;
		}
		
		public int[] reset() {
			return origin;
		}
		
		public int[] shuffle() {
			Random random = new Random();
            int[] nums = origin.clone();
            for(int i=0;i<origin.length;i++){
            	/**nextInt 该方法的作用是生成一个随机的int值，
				 * 该值介于[0,n)的区间，也就是0到n之间的随机int值，包含0而不包含n
				 * 在每次迭代中，生成一个范围在当前下标到数组末尾元素下标之间的随机整数。
				 * 接下来，将当前元素和随机选出的下标所指的元素互相交换 - 这一步模拟了每次从 “帽子” 里面摸一个元素的过程，
				 * 其中选取下标范围的依据在于每个被摸出的元素都不可能再被摸出来了。
				 * 此外还有一个需要注意的细节，当前元素是可以和它本身互相交换的 - 否则生成最后的排列组合的概率就不对了。
				 */
                int seq = random.nextInt(nums.length);
                int tmp = nums[i];
                nums[i] = nums[seq];
                nums[seq] = tmp;
            }
            return nums;
		}
				
	}
	
	public static void main(String[] args) {
		// Init an array with set 1, 2, and 3.
		int[] nums = {1,2,3};
		Solution solution = new Solution(nums);

		// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
		int[] res1=solution.shuffle();
		for(int i=0;i<res1.length;i++) {
			System.out.print(res1[i]+" ");
		}
		System.out.println();
		// Resets the array back to its original configuration [1,2,3].
		solution.reset();

		// Returns the random shuffling of array [1,2,3].
		int[] res2=solution.shuffle();
		for(int i=0;i<res2.length;i++) {
			System.out.print(res2[i]+" ");
		}
	}
	
	
}
