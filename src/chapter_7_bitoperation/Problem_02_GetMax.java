package chapter_7_bitoperation;
/** 
* @author nilzxq
* @version 2019年8月20日 下午6:00:25 
*类说明 
*/
public class Problem_02_GetMax {

	public static int flip(int n) {
		return n^1;
	}
	
	public static int sign(int n) {
		//System.out.println(n>>31);
		//System.out.println((n>>31)&1);
		return flip((n>>31)&1);
	}
	
	public static int getMax1(int a,int b) {
		int c=a-b;
		int scA=sign(c);
		int scB=flip(scA);
		return a*scA+b*scB;
	}
	
	public static int getMax2(int a,int b) {
		int c=a-b;
		int sa=sign(a);
		int sb=sign(b);
		int sc=sign(c);
		int difSab=sa^sb;
		int sameSab=flip(difSab);
		int returnA=difSab*sa+sameSab*sc;
		int returnB=flip(returnA);
		return a*returnA+b*returnB;
	}
	
	public static void main(String[] args) {
		int a = -16;
		int b = 1;
		System.out.println(getMax1(a, b));
		System.out.println(getMax2(a, b));
		a = 2147483647;
		b = -2147480000;
		System.out.println(getMax1(a, b)); // wrong answer because of overflow
		System.out.println(getMax2(a, b));

	}
}
