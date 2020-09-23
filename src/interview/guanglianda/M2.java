package interview.guanglianda;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-23 19:05
 */
public class M2 {
    static final int N=30010;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int[] num=new int[N];
        for(int i=0;i<n;i++){
            double value=sc.nextDouble();
            int happy=sc.nextInt();
            for(int j=c*100;j>=(int)(value*100);j--){
                num[j]=Math.max(num[j],num[j-(int)(value*100)]+happy);
            }

        }
        System.out.println(num[c*100]);
    }
}
