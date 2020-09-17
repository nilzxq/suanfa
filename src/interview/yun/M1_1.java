package interview.yun;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-17 10:49
 */
public class M1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n];
        int a=0,b=0,c=0;
        dp[0]=1;
        for(int i=1;i<n;i++){
            int n2=dp[a]*2,n3=dp[b]*3,n5=dp[c]*5;
            dp[i]=Math.min(Math.min(n2,n3),n5);
            if(dp[i]==n2){
                a++;
            }
            if(dp[i]==n3){
                b++;
            }
            if(dp[i]==n5){
                c++;
            }

        }
        System.out.println(dp[n-1]);
    }
}
