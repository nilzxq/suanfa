package leetcode.array;

import java.util.Arrays;

/**
 * 把数组排序成最小的数
 * @Author nilzxq
 * @Date 2020-09-01 8:13
 */
public class Problem_45_MinNumber {
    public String minNumber(int[] nums){
        String[] strs=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strs[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(strs,(x,y)->(x+y).compareTo(y+x));
        StringBuilder res=new StringBuilder();
        for(String s:strs){
            res.append(s);
        }
        return res.toString();
    }
}
