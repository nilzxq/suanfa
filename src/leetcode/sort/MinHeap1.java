package leetcode.sort;

import java.util.Arrays;

/**
 * @Author nilzxq
 * @Date 2020-07-29 20:50
 */
public class MinHeap1 {
    public static void main(String[] args) {
        int []arr = {9,8,7,6,5,4,3,2,1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
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
