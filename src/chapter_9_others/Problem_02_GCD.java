package chapter_9_others;
/** 
* @author nilzxq
* @version 2019年9月23日 下午8:40:47 
*类说明 
*/
public class Problem_02_GCD {

	public static int gcd(int m,int n) {
		return n==0?m:gcd(n,m%n);
	}
	
	public static void main(String[] args) {

		System.out.println(gcd(18, 27));

	}
}
