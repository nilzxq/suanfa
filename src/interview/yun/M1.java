package interview.yun;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-16 21:05
 */
public class M1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(helper(n));
    }
    public static int helper(int index){
//        if(index<7){
//            return index;
//        }
        int[] num=new int[index];
        num[0]=1;
        int n2=0,n3=0,n5=0;
        for(int i=1;i<index;i++){
            num[i]=Math.min(num[n2]*2,Math.min(num[n3]*5,num[n5]*5));
            if(num[i]==num[n2]*2){
                n2++;
            }
            if(num[i]==num[n3]*3){
                n3++;
            }
            if(num[i]==num[n5]*5){
                n5++;
            }
        }
        return num[index-1];
    }
    public static int helper1(int index){
        int a=0,b=0,c=0;
        int[] dp=new int[index];
        dp[0]=1;
        for(int i=1;i<index;i++){
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
        return dp[index-1];
    }
}
