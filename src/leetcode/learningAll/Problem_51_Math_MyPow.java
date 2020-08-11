package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年12月20日 下午9:05:55
*类说明
*/
public class Problem_51_Math_MyPow {

	public static double myPow(double x, int n) {
		double res=1.0;
		for(int i=n;i!=0;i/=2) {
			if(i%2!=0) {
				res*=x;
			}
			x*=x;
		}
		return n<0==true?1/res:res;
	}

	public static void main(String[] args) {
		System.out.println(myPow(2.00000, 10));
	}
}
