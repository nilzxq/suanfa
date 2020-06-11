package leetcode;

/**
 * @Author nilzxq
 * @Date 2020-06-11 22:37
 */
public class Problem_53_Sort_Search {
    public int search(int[] nums,int target){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
            if(nums[i]>target){
                return count;
            }
        }
        return count;
    }

    //二分法 因为参数是整形，可以用二分查找 k-0.5、k+0.5 两数应该插入的位置，相减即次数。
    public int search1(int[] nums,int target){
        return binarySearch(nums,target+0.5)-binarySearch(nums,target-0.5);
    }

    private int binarySearch(int[] nums, double target) {
        if(nums==null){
            return 0;
        }
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)>>1;
            if(nums[mid]>target){
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Problem_53_Sort_Search s=new Problem_53_Sort_Search();
        int[] nums={5,7,7,8,8,10};
        System.out.println(s.search(nums,8));
        System.out.println(s.search1(nums,8));
    }
}
