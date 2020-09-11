package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-09-10 16:05
 */
public class Problem_51_reversePairs{
    public static int reversePairs(int[] nums){
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={7,5,6,4};
        System.out.println(reversePairs(nums));
    }

}
