package leetcode.array;

import java.util.HashSet;
import java.util.Set;


/**
 * @Author nilzxq
 * @Date 2020-09-15 15:15
 */
public class Problem_41_FirstMissingPositive {
    public int firstMissingPositive(int[] nums){
        int len=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
           set.add(num);
        }
        for(int i=1;i<len;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return len+1;
    }

    public int firstMissingPositive1(int[] nums){
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]>0&&nums[i]<=len&&nums[nums[i]-1]!=nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }
        for(int i=0;i<len;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return len+1;
    }

    private void swap(int[] nums,int index1,int index2){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }

}
