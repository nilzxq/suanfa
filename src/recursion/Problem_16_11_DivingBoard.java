package recursion;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 跳水板
 * @Author nilzxq
 * @Date 2020-08-10 16:22
 *
 */
public class Problem_16_11_DivingBoard {
    /**
     * 错误，忽略了题目说的结果升序，且没有找到应该返回的数组长度 以及两种特殊情况
     * @param shorter
     * @param longer
     * @param k
     * @return
     */
    public static int[] divingBoard(int shorter,int longer,int k){
        HashSet<Integer> array=new HashSet<>();
        for(int i=0;i<=k;i++){
            int res=shorter*i+longer*(k-i);
            array.add(res);
        }
        return array.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] divingBoard1(int shorter,int longer,int k){
        if(k==0){
            return new int[0];
        }
        //注意特殊情况
        if(shorter==longer){
            return new int[]{shorter*k};
        }
        //找规律 且为什么会有这么多种不同那？ leetcode题解中有证明可以回顾下
        int[] arr=new int[k+1];
        for(int i=0;i<=k;i++){
            //降序
            arr[i]=shorter*(k-i)+longer*i;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr=divingBoard1(1,2,3);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
