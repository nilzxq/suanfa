package interview.laohu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-20 17:00
 */
public class M3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<n-1;i+=2){
            helper(arr,i,i+1);
        }
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[n-1]);
    }

    private static void helper(int[] arr, int left, int right) {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
