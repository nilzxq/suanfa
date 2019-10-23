package leetcode;
/** 
* @author nilzxq
* @version 2019年10月23日 上午11:38:07 
*类说明 
*/
public class Problem__02_Array_MaxProfit {

	public static int maxProfit(int[] prices) {
		int max=0;
		for(int i=0;i<prices.length-1;i++) {
			if(prices[i]<prices[i+1]) {
				max+=prices[i+1]-prices[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] prices= { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}
}
