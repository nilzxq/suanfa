package leetcode.string;

/**
 * @Author nilzxq
 * @Date 2020-09-22 17:57
 */
public class Problem_674_FindLengthOfLCIS {
    public static int findLengthOfLCIS(int[] nums){
        if(nums.length<=1){
            return nums.length;
        }
        int count=1;
        int res=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>nums[i]){
                count++;
            }else{
                count=1;
            }
            res=count>res?count:res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
}
