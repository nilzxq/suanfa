package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-07-29 21:31
 *
 * 题目描述：
 * 杰夫非常喜欢种草，他自己有一片草地，为了方便起见，我们把这片草地看成一行从左到右，并且第 i 个位置的草的高度是hi。
 *
 * 杰夫在商店中购买了m瓶魔法药剂，每瓶魔法药剂可以让一株草长高x，杰夫希望每次都能有针对性的使用药剂，也就是让当前长得最矮的小草尽量高，现在杰夫想请你告诉他在使用了m瓶魔法药剂之后，最矮的小草在这种情况下最高能到多少。
 *
 *
 *
 * 输入描述
 * 第一行三个整数n, m, x分别表示小草的个数，魔法药剂的个数以及每瓶魔法药剂让小草长高的高度。(1≤n,m,x≤1e5)
 *
 * 第二行n个整数分别表示第i株小草的高度ai。(1≤ai≤1e9)
 *
 * 输出描述
 * 使用了m瓶药剂之后最矮的小草的最高高度。
 *
 *
 * 样例输入
 * 3 1 1
 * 1 2 3
 * 样例输出
 * 2
 */
public class Main1 {
    public static int n,m,x;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] arr=null;
        if(scanner.hasNext()){
           n=scanner.nextInt();
           m=scanner.nextInt();
           x=scanner.nextInt();
            scanner.nextLine();
            arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            scanner.nextLine();
        }
//        Arrays.sort(arr);
//        System.out.println(arr[0]);
//        System.out.println(x);
        int min=arr[0];
        int start=0;
        while(m!=0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]<=min){
                    min=arr[i];
                    start=i;
                }
            }
            arr[start]=min+x;
            m--;
        }
        System.out.println(arr[start]);
       // System.out.println(helper(arr));

    }

    public static int helper(int[] arr){
        heapSort(arr);
        return arr[n-1]+m*x;
    }
    public static void heapSort(int[] arr){
        for(int i=arr.length/2-1;i>=0;i--){
            heaphelper(arr,i,arr.length);
        }
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);
            heaphelper(arr,0,j);
        }
    }

    public static void heaphelper(int[] arr,int start,int end){
        int temp=arr[start];
        for(int i=2*start+1;i<end;i=i*2+1){
            if(i+1<end&&arr[i]>arr[i+1]){
                i++;
            }
            if(arr[i]>temp){
                break;
            }
            arr[start]=arr[i];
            arr[i]=temp;
            start=i;
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
