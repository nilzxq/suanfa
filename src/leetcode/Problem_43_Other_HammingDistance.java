package leetcode;
/** 
* @author nilzxq
* @version 2019年12月12日 下午5:50:14 
*类说明 
*/
public class Problem_43_Other_HammingDistance {

	public static int hammingDistance(int x,int y) {
		int n=x^y;
		int count=0;
		while(n!=0) {
			count++;
			n=n&(n-1);
		}
		return count;
	}
	public static void main(String[] args) {
		int x=1;
		int y=8;
		System.out.println(hammingDistance(x,y));
	}
}
