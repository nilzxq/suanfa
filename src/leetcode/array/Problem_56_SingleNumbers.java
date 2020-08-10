package leetcode.array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次
 * @Author nilzxq
 * @Date 2020-07-29 14:47
 */
//数组中数字出现的次数

public class Problem_56_SingleNumbers {
    public static void main(String[] args) {
        int[] nums={1,2,5,2};
//        int[] res=singleNumbers(nums);
//        for(int i=0;i<res.length;i++){
//            System.out.print(res[i]+" ");
//        }

        int[] res=singleNumbers1(nums);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }

    public static int[] singleNumbers(int[] nums){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    //位运算

    /**
     * 任何数和本身异或则为0（二级制位 相同为0，不同为1）
     *
     * 两个数字出现一次
     * 分组需要满足的条件
     * 1.两个独特的数字分为不同的组
     * 2.相同的数字分为相同的组
     * 这样每一组的数据进行异或即可得到那两个数字
     *
     * 相同的数异或为0，不同的异或为1。0和任何数异或等于这个数本身。
     *所以，数组里面所有数异或 = 目标两个数异或 。 由于这两个数不同，所以异或结果必然不为0。
     *假设数组异或的二进制结果为10010，那么说明这两个数从右向左数第2位是不同的
     *那么可以根据数组里面所有数的第二位为0或者1将数组划分为2个。
     *这样做可以将目标数必然分散在不同的数组中，而且相同的数必然落在同一个数组中。
     *这两个数组里面的数各自进行异或，得到的结果就是答案
     * @param nums
     * @return
     */
    public static int[] singleNumbers1(int[] nums){
        //所有数字异或的结果
        int res=0;
        int a=0;
        int b=0;
        for(int n:nums){
            res^=n;
        }
        //找到第一位不是0的 也就是该结果的二进制位和1与之后结果不为0的，
        // 如果结果为0，那1就往左移动直到不为0
        int h=1;
        while((res&h)==0){
            h<<=1;
        }
        for(int n:nums){
            //该位为1的分为1组，为0的分为另一组，a,b必然分到了不同的组
            //Q:(n&h)==h  不能是(n&h)==1
            // 因为是一个二进制只有1位是1的数，和它取&的话要么是它本身h,要么是0
            if((h&n)==0){
                a^=n;
            }else{
                b^=n;
            }
        }
        return new int[]{a,b};
    }
}
