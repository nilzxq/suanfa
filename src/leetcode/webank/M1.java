package leetcode.webank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-27 19:46
 */
public class M1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        //int res=Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            int num=sc.nextInt();
            helper(arr,n,num);
        }

    }

    public static void helper(int[] arr,int n,int num){
        if(num>=arr[n-1]){
            System.out.println(arr[n-1]);
            return;
        }
        if(num<=arr[0]){
            System.out.println(arr[0]);
            return;
        }
        int res = Integer.MAX_VALUE;
        for(int k=1;k<n;k++){
                if(num==arr[k]){
                    System.out.println(num);
                    return;
                }else if(num<arr[k]){
                    res=Math.min(res,Math.abs(num-arr[k-1])>Math.abs(num-arr[k])?arr[k]:arr[k-1]);
                }
            }
           if(res!=Integer.MAX_VALUE){
               System.out.println(res);
               return;
           }

    }
}
