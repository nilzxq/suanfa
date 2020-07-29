package leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author nilzxq
 * @Date 2020-07-29 14:47
 */
//待做
public class Problem_56_SingleNumbers {
    public static void main(String[] args) {

    }

    public int[] singleNumbers(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            set.add(nums[i]);
        }
        return new int[0];
    }
}
