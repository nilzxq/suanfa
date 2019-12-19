package leetcode;
/** 
* @author nilzxq
* @version 2019年12月19日 下午6:34:21 
*类说明 
*/
public class Problem_50_Recursion_Fib {

	public static int fib(int n) {
		if(n<1) {
			return 0;
		}else if(n==1||n==2){
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}
	
	public static int fib1(int n) {
		if(n<0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
		int first=0;
		int second=1;
		int result=0;
		while(n>1) {
			result=first+second;
			first=second;
			second=result;
			n--;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int n=4;
		System.out.println(fib(n));
		System.out.println(fib1(n));
	}
}
