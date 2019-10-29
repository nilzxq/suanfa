package leetcode;
/** 
* @author nilzxq
* @version 2019年10月29日 上午11:47:48 
*类说明 
*/
public class Problem_07_Array_PlusOne {

	public static int[] plusOne(int[] digits) {
		for(int i=digits.length-1;i>=0;i--) {
			//非9加1
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			//逢9置0
			digits[i]=0;
		}
		//全部为9，则数组扩充1位
		int[] result=new int[digits.length+1];
		result[0]=1;
		return result;
	}
	
	public static void main(String[] args) {
		int[] digits= {9,9,9};
		int[] result=plusOne(digits);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
