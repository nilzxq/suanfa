package interview.vmware;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2
 * 5
 * 1 2 3 4 5
 * 1 1 3 3 5
 * 10
 * 10 2 9 8 3 6 7 1 4 5
 * 2 8 6 6 6 6 5 5 5 5
 *
 * 油漆工文文接到了任务。在艺术展上一共有n面墙需要他刷成对应的颜色，从左到右分别标号为1,2...,n。每一面墙在最开始的时候都有一个独一无二的颜色。所有墙的颜色会使用一个长度为n的全排列p表示。
 *
 * 由于艺术家们非常苛刻，所以刷墙只能从某一面墙上取色，取完色之后，为了防止颜色变化，只能用来刷与这面墙相邻的墙，并且被刷的墙一定会全部被刷成另外一种颜色。
 *
 * 给出开始的墙上颜色，请问文文能不能把墙刷成要求的样子呢？
 * @Author nilzxq
 * @Date 2020-09-21 21:34
 */
public class M2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[n];
            for(int j=0;j<n;j++){
                arr1[j]=sc.nextInt();
            }
            sc.nextLine();
            for(int k=0;k<n;k++){
                arr2[k]=sc.nextInt();
            }
            boolean res=helper(arr1,arr2,n);
            String str=res==true?"Yes":"No";
            System.out.println(str);
        }
    }

    public static boolean helper(int[] arr1,int[] arr2,int n){
        ArrayList<Integer> arr=new ArrayList<>();
        int temp=arr2[0];
        arr.add(arr2[0]);
        for(int i=1;i<n;i++){
            if(arr2[i]!=temp){
                temp=arr2[i];
                arr.add(arr2[i]);
            }
        }
        int i=0,j=0;
        while(i<n){
            if(j>=arr.size()){
                break;
            }
            if(arr1[i]==arr.get(j)){
                if(j==arr.size()-1){
                    return true;
                }
                i++;
                j++;
            }else{
                i++;
            }
        }
        return false;
    }

}
