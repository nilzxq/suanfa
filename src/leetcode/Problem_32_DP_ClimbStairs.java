package leetcode;
/** 
* @author nilzxq
* @version 2019年11月29日 下午6:54:27 
*类说明 
*/
public class Problem_32_DP_ClimbStairs {

	public static int climbStairs(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return n;
		}
		 return climbStairs(n-1)+climbStairs(n-2);
	}
	
	public static int climbStairs1(int n){
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return n;
		}
		int res=2;
		int pre=1;
		int tmp=0;
		while(n>2) {
			tmp=res;
			res=pre+res;
			pre=tmp;
			n--;
		}
		return res;
	}
		
	
	public static void main(String[] args) {
		System.out.println(climbStairs(4));
		System.out.println(climbStairs1(4));
	}
}
