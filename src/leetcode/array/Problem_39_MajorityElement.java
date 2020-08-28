package leetcode.array;


import java.util.HashMap;

/**
 *
 * @Author nilzxq
 * @Date 2020-08-28 8:22
 */
public class Problem_39_MajorityElement {
    public static int majorityElement(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])>=nums.length/2+1){
                    return nums[i];
                }
            }else{
                map.put(nums[i],1);
            }

        }
        return -1;
    }

    public static int majorityElement1(int[] nums){
        int x=nums[0],vector=0;
        for(int num:nums){
            if(vector==0){
                x=num;
            }
            vector+=num==x?1:-1;
        }
        return x;
    }
}
