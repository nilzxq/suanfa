package leetcode.binarySearch;

/**
 * 旋转数组的最小数字
 * @Author nilzxq
 * @Date 2020-09-03 9:24
 */
public class Problem_11_MinArray {
    public int minArray(int[] numbers){
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int mid=(left+right)/2;
            //判断条件都是与numbers[right]做比较
            if(numbers[mid]>numbers[right]) {
                left = mid+1;
            }else if(numbers[mid]<numbers[right]){
                //不是mid-1
                right=mid;
            }else{
                //相等的时候 是right-- 以防跳过最小值
                right--;
            }
        }
        return numbers[left];
    }
}
