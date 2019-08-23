package chapter_7_bitoperation;
/** 
* @author nilzxq
* @version 2019年8月23日 下午5:18:33 
*类说明 
*/
public class Problem_05_EvenTimesOddTimes {

	public static void printOddTimesNum1(int[]arr) {
		int e0=0;
		for(int cur:arr) {
			e0^=cur;
		}
		System.out.println(e0);
	}
	
	public static void printOddTimesNum2(int[] arr) {
		int e0=0,e0hasOne=0;
		for(int curNum:arr) {
			e0^=curNum;
		}
		int rightOne=e0&(~e0+1);
		for(int cur:arr) {
			if((cur&rightOne)!=0) {
				e0hasOne^=cur;
			}
		}
		System.out.println(e0hasOne+" "+(e0^e0hasOne));
	}
	
	public static void main(String[] args) {
		int[] arr1 = { 3, 3, 2, 3, 1, 1, 1, 3, 1, 1, 1 };
		printOddTimesNum1(arr1);

		int[] arr2 = { 4, 3, 4, 2, 2, 2, 4, 1, 1, 1, 3, 3, 1, 1, 1, 4, 2, 2 };
		printOddTimesNum2(arr2);

	}
}
