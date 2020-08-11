package leetcode.learningAll;

import java.util.Arrays;
import java.util.List;

/**
* @author nilzxq
* @version 2019年12月18日 下午7:32:41
*类说明
*/
public class Problem_49_Recurrence_GetRow {

	public static List<Integer> getRow(int rowIndex){
		Integer[] nums=new Integer[rowIndex+1];
		Arrays.fill(nums,0);
		nums[0]=1;
		for(int i=1;i<=rowIndex;i++) {
			for(int j=i;j>0;j--) {
				nums[j]=nums[j]+nums[j-1];
			}
		}
		return Arrays.asList(nums);
	}

	public static void main(String[] args) {
		System.out.println(getRow(3));
	}
}
