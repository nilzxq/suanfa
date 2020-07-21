package leetcode.dp;

/**
 * @Author nilzxq
 * @Date 2020-06-28 22:25
 */
public class MaxProfit {
    public static int maxProfit(int[] prices){
        int cost=Integer.MAX_VALUE,profit=0;
        for(int price:prices){
            cost=Math.min(cost,price);
            profit=Math.max(profit,price-cost);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] profit={7,1,5,3,6,4};
        System.out.println(maxProfit(profit));
    }
}
