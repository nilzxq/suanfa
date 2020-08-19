package leetcode.array;

import java.util.HashMap;

/**
 *  数组中数字出现的次数
 * @Author nilzxq
 * @Date 2020-08-19 21:33
 */
public class Problem_56_SingleNumber {
    /**
     * map的用法
     * @param nums
     * @return
     */
    public static int SingleNumber(int[] nums){
        HashMap<Integer, Integer>  map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //int a=map.get(nums[i])!=0?map.get(nums[i]):0;
            int a = map.getOrDefault(nums[i], 0);
            map.put(nums[i],a+1);
        }
        for(Integer a:map.keySet()){
            if(map.get(a)==1){
                return a;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,2,3,3,3};
        System.out.println(SingleNumber(nums));
    }
}
