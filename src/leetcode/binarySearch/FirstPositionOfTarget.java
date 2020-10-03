package leetcode.binarySearch;

/**
 * 查找第一个与target相同的元素
 * @Author nilzxq
 * @Date 2020-10-03 19:14
 */
public class FirstPositionOfTarget {
    public static void main(String[] args) {
        int[] nums={4,4,4,4,4,5,6};
        System.out.println(binarySearch(nums,4));
        System.out.println(binarySearch2(nums,4));
    }

    public static int binarySearch(int[] nums,int target){
        if(nums==null||nums.length==0){
            return -1;
        }
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                while(mid-1>=left&&nums[mid-1]==target){
                    mid--;
                }
                return mid;
            }
            if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }

    //查找最后一个与target相同的元素
    public static int binarySearch2(int[] nums,int target){
        if(nums==null||nums.length==0){
            return -1;
        }
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(target==nums[mid]){
                while(mid+1<=right&&nums[mid+1]==target){
                    mid++;
                }
                return mid;
            }
            if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}
