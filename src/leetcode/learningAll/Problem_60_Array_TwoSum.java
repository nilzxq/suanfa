package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年12月30日 下午6:28:08
*类说明
*/
public class Problem_60_Array_TwoSum {

	public static int[] twoSum(int[] numbers,int target) {
		int[] result=new int[2];
		int i=0;
		int j=numbers.length-1;
		while(j>i) {
				if(numbers[i]+numbers[j]==target) {
					result[0]=i+1;
					result[1]=j+1;
					return result;
				}else if(numbers[i]+numbers[j]>target){
					j--;
				}else {
					i++;
				}
			}
		return result;
	}

	public static void main(String[] args) {
		int[] nums= {2,7,11,15};
		int[] res=twoSum(nums,27);
		for(int i=0;i<2;i++) {
			System.out.print(res[i]+" ");
		}
	}
}
