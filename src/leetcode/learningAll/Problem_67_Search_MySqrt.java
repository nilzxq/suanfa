package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月6日 上午9:52:00
*类说明
*/
public class Problem_67_Search_MySqrt {

	public static int mySqrt(int x) {
		int left=0;
		int right=x/2+1;
		while(left<=right) {
			long mid=left+(right-left)/2;
			if(mid*mid==x) {
				return (int)mid;
			}else if(mid*mid<x) {
				left=(int)(mid+1);
			}else {
				right=(int)(mid-1);
			}
		}
		return right;
	}

	public static void main(String[] args) {
		System.out.println(mySqrt(4));
	}
}
