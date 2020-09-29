package leetcode.webank;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-27 20:44
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int q=sc.nextInt();
        while((q--)>0){
            int x_0=sc.nextInt();
            int y_0=sc.nextInt();
            for(int i=0;i<x;i++){
                int x_1=x_0;
                int y_1=y_0;
                x_0=y_1;
                y_0=n+1-x_1;
                int temp=n;
                n=m;
                m=temp;
            }
            for(int i=0;i<y;i++){
                int x_1=x_0;
                int y_1=y_0;
                x_0=x_1;
                y_0=m+1-y_1;

            }

            for(int i=0;i<z;i++){
                int x_1=x_0;
                int y_1=y_0;
                x_0=m+1-y_1;
                y_0=x_1;
                int temp=n;
                n=m;
                m=temp;
            }
            System.out.println(x_0+" "+y_0);
        }
    }
}
