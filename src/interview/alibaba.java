package interview;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-08-26 9:03
 */
public class alibaba {
    public static class Zidian{
        int length;
        String a;
        String b;
//        public Zidian(int length) {
//            this.length = length;
//        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int length=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            Zidian zidian=new Zidian();
            zidian.length=length;
            zidian.a=a;
            zidian.b=b;
            arr[i]=helper(zidian);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    //字典序
    public static int helper(Zidian zidian){
        if((zidian.length==1)&&(compare(zidian.a,zidian.b)!=-1)){
                return 0;
        }
        if(compare(zidian.a,zidian.b)==0){
            return 0;
        }
        //递归
        int length=zidian.length;
        char[] arr1=zidian.a.toCharArray();
        char[] arr2=zidian.b.toCharArray();
        int i=0,j=0;
        int n=0;
        int res=1;
        while(length>=0){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
                length--;
                continue;
            }else {
                if(i<zidian.length-2&&arr1[i+1]!='z'){
                    n=arr2[j]-arr1[i]+1;
                    res=n*res;
                    i++;
                    j++;
                    length--;
                }
                //其它情况
            }

        }
        return res;
    }

    public static int compare(String a,String b){
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        int i=0,j=0,n=arr1.length;
        while(n>=0){
            if(arr1[i]>arr2[j]){
                return 1;
            }else if(arr1[i]<arr2[j]){
                return -1;
            }else{
                i++;
                j++;
                n--;
                continue;
            }
        }
        return 0;
    }


}
