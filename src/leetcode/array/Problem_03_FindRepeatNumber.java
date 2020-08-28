package leetcode.array;

import java.util.HashMap;

/**
 * @Author nilzxq
 * @Date 2020-08-28 8:13
 */
public class Problem_03_FindRepeatNumber {
    public static int findRepeatNumber(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        for(int a:map.keySet()){
            if(map.get(a)>1){
                return a;
            }
        }
        return -1;
    }
}
