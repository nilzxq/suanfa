package interview;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-08-08 17:56
 */
public class zidianxu {
    /**
     * 新建一个输出数组，要最小字典序列就从1到m开始讨论加入到输出数组里面，
     * 分在不在输入的序列里面讨论，不在直接加入，在的话就把输入序列比当前
     * 的小的那部分全部加入到输出数组
     *  //1.什么是字典序
     *     //2.字典序最小的排列
     *
     *     /**
     *      * 5 3
     *      * 2 1 5
     *      * 2 1 3 4 5
     *      *
     *      * 5 2
     *      * 4 2
     *      * 1 3 4 2 5
     */
    static HashSet<Integer> set;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] nums=new int[m];
        set=new HashSet<>();
        for(int i=0;i<m;++i){
            nums[i]=sc.nextInt();
            set.add(nums[i]);
        }
        int[] res=new int[n];
        helper(res,nums);
        for(int i=0;i<n-1;i++){
            System.out.print(res[i]+" ");
        }
        System.out.print(res[n-1]);
    }
    static void helper(int[] res,int[] nums){
        int index=0;
        int j=0;
        for(int i=1;i<=res.length;++i){
            if(set.contains(i)){
                continue;
            }else{
                while(index<nums.length&&nums[index]<i){
                    res[j++]=nums[index++];
                }
                if(nums[index]==i){
                    res[j++]=i;
                    index++;
                }else{
                    res[j++]=i;
                }
            }
        }
        while(index<nums.length){
            res[j++]=nums[index++];
        }

    }
}
