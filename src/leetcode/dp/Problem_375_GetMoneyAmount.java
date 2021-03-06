package leetcode.dp;

/**
 * 猜数字大小
 * @Author nilzxq
 * @Date 2020-08-22 21:19
 */
public class Problem_375_GetMoneyAmount {

    public int cost(int l,int r){
        if(l>=r){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int i=l;i<=r;i++){
            int res=i+Math.max(cost(l,i-1),cost(i+1,r));
            min=Math.min(min,res);
        }
        return min;
    }
    public  int getMoneyAmount(int n){
        return cost(1,n);
    }

    //DP
//    public int getMoneyAmount1(int n){
//        int[][] dp=new int[n+1][n+1];
//        for(int i=1;i<=n;i++){
//
//        }
//    }
}
