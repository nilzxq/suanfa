package interview.shangtang;

/**
 * @Author nilzxq
 * @Date 2020-09-18 21:08
 */
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    private static void sort(int[] arr) {
        heap(arr);
        for(int i = arr.length-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            makeMaxHeap(arr,0,i);
        }
    }

    private static void makeMaxHeap(int arr[],int i,int n){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(left>=n){
            return;
        }
        int max = left;
        if(right>=n){
            max = left;
        }
        else{
            if(arr[left]<arr[right]){
                max = right;
            }
        }
        if(arr[i]>arr[max]){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
        makeMaxHeap(arr,max, n);
    }

    private static void heap(int[] arr) {
        int n = arr.length;
        for(int i = arr.length/2-1;i>=0;i--){
            makeMaxHeap(arr,i,n);
        }
    }
}
