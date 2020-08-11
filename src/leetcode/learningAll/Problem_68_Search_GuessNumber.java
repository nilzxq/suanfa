package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月7日 下午4:48:04
*类说明
*/
public class Problem_68_Search_GuessNumber {

	/* The guess API is defined in the parent class GuessGame.
	   @param num, your guess
	   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
	      int guess(int num); */
	public static int guess(int num) {
		//just test!!!!
		return 0;
	}

	public static int guessNumber(int n) {
		int low=1;
		int high=n;
		while(low<=high) {
			int mid=(high-low)/2+low;
			int g=guess(mid);
			if(g==1) {
				low=mid+1;
			}else if(g==-1) {
				high=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
    }
}
