package leetcode.webank;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-27 20:29
 * 给你一个长度为n的序列A，你需要算出有多少个三元组(Ai,Aj,Ak)满足i<j<k且Ai≤Aj≤Ak。
 * 第一行一个整数n，表示序列A的长度。
 *
 * 接下来一行n个整数，第i个数表示Ai的值。
 * 一个整数x，表示满足要求的三元组数量。
 *
 * 6
 * 2 3 5 4 3 3
 * 6
 *
 */

public class M3 {
    public static final int MAXN=100010;
    public static class Node{
        int[] num=new int[MAXN];
        int len;
    }
    //int a[]=new int[MAXN];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node f[][]=new Node[MAXN][MAXN];
        int n=sc.nextInt();
        int m=3;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=m;j++){
                if(j==1){
                    f[i][j].num[0]=1;
                    f[i][j].len=1;
                }else{
                    f[i][j].len=0;
                }
            }
        }
        for(int i=m-1;i<n;i++){
           // helper(arr,f[i][m].num,len,);
        }
        dp(n,m,arr,f);
    }

//    public void helper(int[] a,int[] b)
    public static void dp(int n,int m,int[] arr,Node[][] f){
        for(int i=1;i<n;i++){
            for(int j=2;j<=Math.min(i+1,m);j++){
                for(int k=j-2;k<i;k++){
                    if(arr[i]>=arr[k]){
                        helper(f[i][j].num,f[k][j-1].num,f[i][j].len,f[k][j-1].len);
                    }
                }
            }
        }
    }

    private static void helper(int[] num, int[] num1, int len, int len1) {
        int length=Math.max(len,len1);
        int[] temp=new int[MAXN];
        for(int p=0;p<length;p++){
            temp[p]+=num[p]+num1[p];
            temp[p+1]=temp[p]/10;
            temp[p]=temp[p]%10;
        }
        if(temp[length]>0){
            length++;
        }
        len=length;
        for(int p=0;p<length;p++){
            num[p]=temp[p];
        }
    }

//    public static void print(int m,Node){
//        int[] ans=new int[MAXN];
//        int lans=0;
//        for(int i=)
//    }

}
