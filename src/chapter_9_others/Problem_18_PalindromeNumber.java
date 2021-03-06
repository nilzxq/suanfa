package chapter_9_others;
/** 
* @author nilzxq
* @version 2019年10月12日 上午11:00:25 
*类说明 
*/
public class Problem_18_PalindromeNumber {

	public static boolean isPalindrome(int n) {
		if(n==Integer.MIN_VALUE) {
			return false;
		}
		n=Math.abs(n);
		int help=1;
		while(n/help>=10) {//防止help溢出
			help*=10;
		}
		while(n!=0) {
			if(n/help!=n%10) {
				return false;
			}
			n=(n%help)/10;
			help/=100;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int test = -10001;
		System.out.println(isPalindrome(test));
	}

}
