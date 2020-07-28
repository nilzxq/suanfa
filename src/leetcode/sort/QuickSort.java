package leetcode.sort;

import leetcode.stack.CQueue;

/**
 * @Author nilzxq
 * @Date 2020-07-28 13:11
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] nums={1,6,89,0,23,4,-1};
        quickSort(nums,0,6);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void quickSort(int nums[],int start,int end){
        if(start>=end){
            return;
        }
        int left=start,right=end;
        int pivot=nums[left];
        while(left<right){
            while(left<right&&nums[right]>pivot){
                right--;
            }
            if(left<right){
                nums[left]=nums[right];
            }
            while(left<right&&nums[left]<=pivot){
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
