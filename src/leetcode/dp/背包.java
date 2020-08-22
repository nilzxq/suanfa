package leetcode.dp;

/**
 * @Author nilzxq
 * @Date 2020-08-22 17:30
 */
public class 背包 {

    //`dp[i][w]`表示：对于前`i`个物品，当前背包的容量为`w`时，这种情况下可以装下的最大价值是`dp[i][w]`。
    public static int pack(int W,int N,int[] wt,int[] val){
        int[][] dp=new int[N+1][W+1];
        //N 可选择的物品
        for(int i=1;i<=N;i++){
            //背包容量
            for(int w=1;w<=W;w++){
                if(w-wt[i-1]<0){
                    //当前背包装不下，只能选择不装入背包
                   dp[i][w]=dp[i-1][w];
                }else{
                    //第i个物品装入或者不装入背包，择优
                    //第i个物品，对应i-1(从1开始) wt[i-1] val[i-1]
                    dp[i][w]=Math.max(dp[i-1][w-wt[i-1]]+val[i-1],
                    dp[i-1][w]);
                }
            }
        }
        return dp[N][W];
    }

    public static void main(String[] args) {
        //算法返回 6，选择前两件物品装进背包，总重量 3 小于`W`，可以获得最大价值 6。
        System.out.println(pack(4,3,new int[]{2,1,3},new int[]{4,2,3}));
    }
}
