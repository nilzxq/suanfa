package leetcode.array;

import java.util.Arrays;

/**
 * 最小的K个数
 * @Author nilzxq
 * @Date 2020-08-18 8:21
 */
public class Problem_40_GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr,int k){
        Arrays.sort(arr);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i];
        }
        return res;
    }
}
