package leetcode;
/** 
* @author nilzxq
* @version 2019年12月11日 下午7:40:37 
*类说明 
*/
public class Problem_42_Other_HammingWeight {

	public static int hammingWeight(int n) {
		int count=0;
		while(n!=0) {
			count+=n&1;
			n=n>>>1;
		}
		return count;
	}

}
