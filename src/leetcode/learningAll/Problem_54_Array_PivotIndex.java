package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年12月24日 下午6:19:24
*类说明
*/
public class Problem_54_Array_PivotIndex {

	public static int pivotIndex(int[] nums) {
//		int resL=0;
//		int resR=0;
//		int i=0;
//		int j=nums.length-1;
//        while(i!=j) {
//        		if(resL>resR) {
//        			resR+=nums[j];
//        			j--;
//        		}else if(resL<resR) {
//        			resL+=nums[i];
//        			i++;
//        		}else if(resL==resR&&j-i==2) {
//            		return i+1;
//            	}
//        	}
//       return -1;

		int sum=0;
		for(int num:nums) {
			sum+=num;
		}
		int sumL=0;
		for(int p=0;p<nums.length;p++) {
			if(p!=0) {
				sumL+=nums[p-1];
			}
			int sumR=sum-nums[p]-sumL;
			if(sumL==sumR) {
				return p;
			}
		}
		return -1;
    }

	public static void main(String[] args) {
		int[] nums= {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(nums));
	}
}
