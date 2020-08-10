package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-08-08 15:51
 */
public class wangyi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //n 结点数目 m边的个数
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[3][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int max=0;
        if(n==2){
            for(int i=0;i<m;i++){
                max=Math.max(max,arr[i][2]);
            }
            System.out.println(max);
            return;
        }
        //相同边按权值排序
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
               if((arr[i][0]==arr[j][1])&&(arr[i][1]==arr[j][0])){

               }
            }
        }
    }
}
