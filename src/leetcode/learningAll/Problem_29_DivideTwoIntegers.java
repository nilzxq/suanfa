package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年5月8日 下午3:48:56
*类说明
*/
public class Problem_29_DivideTwoIntegers {

	public static int divide(int dividend,int divisor) {
		if(dividend==0) {
			return 0;
		}
		/**
		 * 假设我们的环境只能存储 32 位有符号整数，
		 * 其数值范围是 [−2^31,  2^31 − 1]。本题中，如果除法结果溢出，则返回 2^31 − 1。
		 */
		if(dividend==Integer.MIN_VALUE&&divisor<0) {
			return Integer.MAX_VALUE;
		}
		boolean negative;
		negative=(dividend^divisor)<0;
		long t=Math.abs((long)dividend);
		long d=Math.abs((long)divisor);
		int result=0;
		for(int i=31;i>=0;i--) {
			if((t>>i)>=d) {
				result+=1<<i;
				t-=d<<i;
			}
		}
		return negative?-result:result;
	}

	public static void main(String[] args) {
		int dividend=100,divisor=3;
		System.out.println(divide(dividend,divisor));
	}
}
