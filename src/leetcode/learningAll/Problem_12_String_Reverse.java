package leetcode.learningAll;

/**
 * @author nilzxq
 * @version 2019年11月5日 下午4:55:50 类说明
 */
public class Problem_12_String_Reverse {

	public static int reverse(int x) {
		/*
		 * long i=0; long t=x; while(t!=0) { i=i*10+t%10; t/=10; }
		 * if(i<Integer.MIN_VALUE||i>Integer.MAX_VALUE) { return 0; } return (int)i;
		 */

		int res = 0;
		while (x != 0) {
			int temp = res * 10 + x % 10;
			if (temp / 10 != res)
				return 0;
			res = temp;
			x /= 10;
		}
		return res;

	}

	public static void main(String[] args) {
		int n1 = 12345;
		int n2 = -120;
		System.out.println(reverse(n1));
		System.out.println(reverse(n2));
	}
}
