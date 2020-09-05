package leetcode.dp;

import java.util.Scanner;

/**
 * 牛牛回到家要走恰好n个台阶。
 * 由于牛牛步伐不太大，故单步只能跨最多m个台阶，最少跨一个台阶。
 * 牛牛有一个奇怪的习惯，他要求每步和之前两步走的台阶数目不能相同。
 * 7 3
 * 2
 * @Author nilzxq
 * @Date 2020-09-04 7:52
 */
public class 变态台阶 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //最多m步
        int m=sc.nextInt();
        int mod=1000000007;
        //dp(i,k,j)表示现在走k步，之前走j步
        int[][][] dp=new int[n+1][m+1][m+1];
        dp[0][0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                for(int k=1;k<=m;k++){
                    if(k==j){
                        continue;
                    }
                    for(int l=0;l<=m;l++){
                        if(i-k==0&&j==0){
                            dp[i][k][j]=1;
                            continue;
                        }
                        if(l==k||i-k<=0){
                            continue;
                        }
                        dp[i][k][j]+=dp[i-k][j][l];
                        dp[i][k][j]%=mod;
                    }
                }
            }
        }
        int sum=0;
        for(int i=1;i<=m;i++){
            for(int j=0;j<=m;j++){
                sum+=dp[n][i][j];
                sum%=mod;
            }
        }
        System.out.println(sum);
    }
}
