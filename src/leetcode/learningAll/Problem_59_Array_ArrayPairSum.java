package leetcode.learningAll;

import java.util.Arrays;

/**
* @author nilzxq
* @version 2019年12月29日 下午1:24:06
*类说明
*/
public class Problem_59_Array_ArrayPairSum {

	/**
	 * oj超时
	 * @param args
	 */
//	public static int arrayPairSum(int[] nums) {
//
//			int result=0;
//	      for(int i=0;i<nums.length;i++) {
//	    	  int tmp=0;
//	    	  for(int j=i+1;j<nums.length;j++) {
//	    		  if(nums[i]>nums[j]) {
//	    		      tmp=nums[j];
//	    		  	  nums[j]=nums[i];
//	    		  	  nums[i]=tmp;
//	    		  }
//	    	  }
//	      }
//	      for(int i=0;i<nums.length;i++) {
//	    	  if(i%2==0)
//	    		  result+=nums[i];
//	      }
//	     return result;
//	    }

	public static int arrayPairSum(int[] nums) {
		 int result=0;
	      Arrays.sort(nums);
	      for(int i=0;i<nums.length;i+=2) {
	    		  result+=nums[i];
	      }
	     return result;
	}
	 public static void main(String[] args) {
		int[] nums= {1,4,3,2};
		System.out.println(arrayPairSum(nums));
	}
	}
