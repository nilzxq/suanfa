package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月13日 下午7:18:49
*类说明
*/
public class Problem_74_Search_IsPerfectSquare {

	public static boolean isPerfectSquare(int num) {
        long left=0;
        long right=num;
        while(left<=right) {
        	long mid=left+(right-left)/2;
        	long res=mid*mid;
        	if(res==num) {
        		return true;
        	}else if(res>num){
        		right=mid-1;
        	}else {
        		left=mid+1;
        	}
        }
        return false;
    }

	//任意完全平方数都可以表示成连续的奇数和
	public static boolean isPerfectSquare1(int num) {
		int i=1;
		while(num>0) {
			num-=i;
			i+=2;
		}
		return num==0;
	}

	public static void main(String[] args) {
	   int num1=16;
	   int num2=14;
	   System.out.println(isPerfectSquare(num1));
	   System.out.println(isPerfectSquare1(num2));
	}
}
