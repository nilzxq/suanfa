package leetcode.sort;

import java.util.Arrays;

/**
 * @Author nilzxq
 * @Date 2020-07-29 19:54
 */
public class MinHeap {
    public static void main(String[] args) {
        int a[]={5,3,6,4,1,11,9,21,4,5,-5};
        heapSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void heapSort(int[] arr){
        if(arr==null||arr.length==0){
            return;
        }
        for(int i=arr.length/2-1;i>=0;i--){
            heapAdjust(arr,i,arr.length);
        }
        System.out.println(arr[0]);
        for(int j=arr.length-1;j>0;j--){
            //将堆顶元素与末尾元素进行交换
            swap(arr,0,j);
            //重新对堆进行调整
            heapAdjust(arr,0,j);
        }
    }

    /**
     * 调整小顶堆
     * @param arr
     * @param start
     * @param end
     */
    private static void heapAdjust(int[] arr, int start, int end) {
        //取出当前元素start
        int temp=arr[start];
        //System.out.print(temp+" ");
        for(int i=2*start+1;i<end;i=i*2+1){
            //System.out.print(i+" ");
            if(i+1<end&&arr[i]>arr[i+1]){
                //如果左子结点小于右子结点，i指向右子结点
                i++;
            }
            if(temp<=arr[i]){
                //如果子节点的大于父节点，将跳出循环
                break;
            }
            //如果子节点小于父节点，将子节点赋值给父节点
            arr[start]=arr[i];
            arr[i]=temp;
            start=i;
        }
    }

    public static void swap(int arr[],int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
