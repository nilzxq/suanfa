package newcoder.chapter6;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2021-07-08 9:38
 *
 * 例如：
 *  1 2 4 4 4 6
 *  返回possible 代码有误
 */
public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int seq[]=new int[n];
        for(int i=0;i<n;i++){
            seq[i]=sc.nextInt();
        }
        if(isArithmeticSequece(seq,n)){
            System.out.println("Possible");
        }else{
            System.out.println("Impossible");
        }
        sc.close();
    }

    public static boolean isArithmeticSequece(int[] seq,int n){
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            sum+=seq[i];
            min=Math.min(min,seq[i]);
        }
        if((2*(sum-n*min))%((n-1)*n)==0){
            return true;
        }else{
            return false;
        }
    }
}
