package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年12月9日 下午5:47:05
*类说明
*/
public class Problem_40_Math_IsPowerOfThree {

	public static boolean isPowerOfThree(int n) {
		if(n<1) {
			return false;
		}
		while(n%3==0) {
			n/=3;
		}
		return n==1;
	}

	public static void main(String[] args) {
		System.out.println(isPowerOfThree(45));
	}
}
