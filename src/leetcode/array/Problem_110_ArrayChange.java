package leetcode.array;

import java.util.Arrays;

/**
 * @Author nilzxq
 * @Date 2020-08-07 13:43
 *
 * 110.数组变换
 * https://developer.aliyun.com/coding/110
 */
public class Problem_110_ArrayChange {
    public static int solution(int n,int d,int[] a){
        int temp=a[0]%d;
        for(int arr:a){
            if(arr%d!=temp){
                return -1;
            }
        }
        Arrays.sort(a);
        int left=0;
        int right=0;
        //int[] dp=new int[n];
        //保留数组中每个数都变成该数的次数，最后取最小的
            for(int i=0;i<n;i++){
                if(i<n/2){
                    left+=a[i];
                }
                if(i>n/2){
                    right+=a[i];
                }
            }
            return (a[n/2]*(n/2)-left)/d+Math.abs((a[n/2]*(n-n/2-1)-right))/d;

    }

    public static void main(String[] args) {
        int[] a={3,5,7,1,9};
        int d=2;
        System.out.println(solution(5,2,a));
    }
}
