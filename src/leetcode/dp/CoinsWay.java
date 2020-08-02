package leetcode.dp;

import org.junit.Test;

/**
 * @Author nilzxq
 * @Date 2020-08-02 6:56
 */

public class CoinsWay {
    /**
     * 暴力
     * @param arr
     * @return
     */
   public static int coins1(int[] arr,int aim){
       if(arr==null||arr.length==0||aim<0){
           return 0;
       }
       return process1(arr,0,aim);
    }

    public static int process1(int[] arr,int index,int aim){
       int res=0;
       if(index==arr.length){
           res=aim==0?1:0;
       }else{
           for(int i=0;arr[index]*i<=aim;i++){
               res+=process1(arr,index+1,aim-arr[index]*i);
           }
       }
       return res;
    }

    public static int coins2(int[] arr,int aim){
        if(arr==null||arr.length==0||aim<0){
            return 0;
        }
        int[][] dp=new int[arr.length+1][aim+1];
        return process2(arr,0,aim,dp);
    }

    public static int process2(int[] arr,int index,int aim,int[][] dp){
       int res=0;
       if(index==arr.length){
            res=aim==0?1:0;
       }else{
           int dpValue=0;
           for(int i=0;arr[index]*i<=aim;i++){
               //process1(arr,index+1,aim-arr[index]*i)中index+1,aim-arr[index]*i那一部分的结果
               dpValue=dp[index+1][aim-arr[index]*i];
               if(dpValue!=0){
                   res+=dpValue==-1?0:dpValue;
               }else{
                   res+=process2(arr,index+1,aim-arr[index]*i,dp);
               }
           }
       }
       dp[index][aim]=res==0?-1:res;
       return res;
    }

    public static int coins3(int[] arr,int aim){
       if(arr==null||arr.length==0||aim<0){
           return 0;
       }
       int[][] dp=new int[arr.length][aim+1];
        for(int i=0;i<arr.length;i++){
            dp[i][0]=1;
        }
        for(int j=0;arr[0]*j<=aim;j++){
            dp[0][arr[0]*j]=1;
        }
        int num=0;
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<=aim;j++){
                num=0;
                for(int k=0;j-arr[i]*k>=0;k++){
                    /**
                     * 2.对于矩阵dp第一行的值dp[0][.],表示只能使用arr[0]这一种 货币的情况下，组成
                     * 钱的方法数，比如，arr[0]==5 时，能组成的钱数只有0，5，10，15， .。所以，令
                     * dp[0][k*arr[]=l(0<=k*arr[0]<=aim，k为非负整数)。
                     * 3.除第一行和第一.列的其他位置，记为位置(i,j)。dp[i][j]的值 是以下几个值的累加。
                     * 完全不用arr[i]货币，只使用rrp[..i-1]货币时，方法数为dp[i-1][i]。
                     * 用1张arr[i]货币，剩下的钱用rr[..i-1]货币组成时，方法数为dpl[-1]j-r[l]。
                     * 用2张arr[i]货币,剩下的钱用rr[..i-1]货币组成时,方法数为dpl[-1]-2*arr[]]。
                     * 用k张arr[i]货币，剩下的钱用rr[..i-1]货币组成时,方法数为dp[i-1]j-k*arr[]]。
                     * j-k*arr[i]>=0，k为非负整数。
                     * 4.最终dp[N- 1][aim]的值就是最终结果。
                     */
                    num+=dp[i-1][j-arr[i]*k];
                }
                dp[i][j]=num;
            }
        }
        return dp[arr.length-1][aim];
    }

    public static int coins4(int[] arr,int aim){
       if(arr==null||arr.length==0||aim<0){
           return 0;
       }
       int[] dp=new int[aim+1];
       for(int i=0;arr[0]*i<=aim;i++){
           dp[arr[0]*i]=1;
       }
       for(int i=1;i<arr.length;i++){
           for(int j=1;j<=aim;j++){
              // dp[j]=dp[j]+dp[j-arr[i]];
               dp[j]+=j-arr[i]>=0?dp[j-arr[i]]:0;
           }
       }
       return dp[aim];
    }
    public static void main(String[] args) {
        int[] arr={5,10,25,1};
        int aim=15;
        System.out.println(coins1(arr,15));
        System.out.println(coins2(arr,15));
        System.out.println(coins3(arr,15));
        System.out.println(coins4(arr,15));
    }
}
