package leetcode.string;

/**
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
 * 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author nilzxq
 * @Date 2020-07-12 23:08
 */
public class MissingNumber {
    // 对于有序数组, 大小为i的数应当处于下标为i的位置上, 如果不在, 说明在该数字之前发生了错位

    public static int missingNumber(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<=right){//二分查找，第一个nums值大于index的位置
            // 防溢出的写法，位运算提速，这里注意位运算的优先级问题，需要用括号括起来
            int mid=left+((right-left)>>1);
            if(nums[mid]==mid){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums={0,1,3};
        System.out.println(missingNumber(nums));
    }
}
