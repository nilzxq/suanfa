package leetcode.array;

/**
 * 删除已排序数组中的重复的数字
 * @Author nilzxq
 * @Date 2020-09-21 12:36
 */
public class RemoveDuplicatesElem {
    public static void main(String[] args) {
        int[] nums={1,1,2,3};
        System.out.println(helper(nums));
    }

    public static int helper(int[] nums){
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[count]){
                //从0开始
                nums[++count]=nums[i];
            }
        }
        return count+1;
    }
}
