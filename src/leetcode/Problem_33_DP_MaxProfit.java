package leetcode;
/** 
* @author nilzxq
* @version 2019年12月2日 下午9:12:57 
*类说明 
*/
public class Problem_33_DP_MaxProfit {
	
	 public static  int maxProfit(int[] prices) {
//		    if(prices.length==0||prices==null){
//	            return 0;
//	        }
//	        int maxProfit=0;
//	        int minPrice=prices[0];
//	        for(int i=1;i<prices.length;i++){
//	            minPrice=Math.min(minPrice,prices[i]);
//	            maxProfit=Math.max(maxProfit,prices[i]-minPrice);
//	        }
//	        return maxProfit;
	        
	        int minprice = Integer.MAX_VALUE;
	        int maxprofit = 0;
	        for (int i = 0; i < prices.length; i++) {
	            if (prices[i] < minprice)
	                minprice = prices[i];
	            else if (prices[i] - minprice > maxprofit)
	                maxprofit = prices[i] - minprice;
	        }
	        return maxprofit;

	    }
	 
	 public static void main(String[] args) {
		int[] nums= {7,1,5,3,6,4};
		System.out.println(maxProfit(nums));
	}
}
