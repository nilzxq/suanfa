package interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-07-29 22:06
 *
 * 题目描述：
 * 我们希望一个序列中的元素是各不相同的，但是理想和现实往往是有差距的。现在给出一个序列A，其中难免有些相同的元素，现在提供了一种变化方式，使得经过若干次操作后一定可以得到一个元素各不相同的序列。
 *
 * 这个操作是这样的，令x为序列中最小的有重复的数字，你需要删除序列左数第一个x，并把第二个x替换为2*x。
 *
 * 请你输出最终的序列。
 *
 * 例如原序列是[2,2,1,1,1],一次变换后变为[2,2,2,1]，两次变换后变为[4,2,1]，变换结束
 *
 *
 *
 * 输入描述
 * 输入第一行包含一个正整数n，表示序列的长度为n。(1<=n<=50000)
 *
 * 第二行有n个整数，初始序列中的元素。(1<=a_i<=10^8)
 *
 * 输出描述
 * 输出包含若干个整数，即最终变换之后的结果。
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        scanner.nextLine();
        if(n==1){
            System.out.println(arr[0]);
        }
        quickSort(arr,0,n-1);
        helper(arr);

    }

    public static int[] helper(int[] arr){
        if(arr.length==1){
            return arr;
        }

        return arr;
    }
    public static void quickSort(int nums[],int start,int end){
        if(start>=end){
            return;
        }
        int left=start,right=end;
        int pivot=nums[left];
        while(left<right){
            while(left<right&&nums[right]<pivot){
                right--;
            }
            if(left<right){
                nums[left]=nums[right];
            }
            while(left<right&&nums[left]>=pivot){
                left++;
            }
            if(left<right){
                nums[right]=nums[left];
            }
            if(left>=right){
                nums[left]=pivot;
            }
        }
        quickSort(nums,start,right-1);
        quickSort(nums,right+1,end);
    }


}
