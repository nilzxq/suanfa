package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月25日 下午6:30:24
*类说明
*/
public class Problem_85_Queue_NumSquares {

	public static int numSquares(int n) {
		int res = n, num = 2;
        while(num*num <= n)
        {
            int a =n/(num*num),b = n%(num*num);
            res = Math.min(res,a+numSquares(b));
            ++num;
        }
        return res;
	}

	public static void main(String[] args) {
		System.out.println(numSquares(13));
	}
}
