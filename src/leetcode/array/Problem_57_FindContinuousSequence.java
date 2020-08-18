package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * 和为s的连续正数序列
 * @Author nilzxq
 * @Date 2020-08-18 7:20
 */
public class Problem_57_FindContinuousSequence {
    public static int[][] findContinuousSequence(int target){
        int i=1;
        int j=1;
        int sum=0;
        List<int[]> res=new ArrayList<>();
        while(i<=target/2){
            if(sum>target){
                //左边界向右移动
                sum-=i;
                i++;
            }else if(sum<target){
                //右边界向左移动
                sum+=j;
                j++;
            }else{
                //记录结果
                int[] arr=new int[j-i];
                for(int k=i;k<j;k++){
                    arr[k-i]=k;
                }
                res.add(arr);
                //左边界向右移
                sum-=i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] res=findContinuousSequence(9);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
        }
    }
}
