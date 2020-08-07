package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-08-07 16:55
 */
public class Problem_59_MaxSlidingWindows {
    public static int[] maxSlidingWindows(int[] nums,int k){
        if(k<=1){
            return nums;
        }
        int[] res=new int[nums.length-k+1];

        for(int i=0;i<nums.length-k+1;i++){
            int left=i,right=i+k-1;
            int tmp=nums[left];
            for(int j=left;j<=right;j++){
                if(nums[j]>tmp){
                    tmp=nums[j];
                }
            }
            res[i]=tmp;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] res=maxSlidingWindows(nums,k);
        for(int i=0;i<6;i++){
            System.out.print(res[i]+" ");
        }
    }
}
