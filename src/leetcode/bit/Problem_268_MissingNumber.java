package leetcode.bit;

/**
 * 缺失数字
 * 位运算
 * 异或交换律和结合律
 * 3 0 1
 * 3^(3^0)^(0^1)^(1^2)=2
 * @Author nilzxq
 * @Date 2020-08-10 14:04
 */
public class Problem_268_MissingNumber {
    public int missingNumber(int[] nums){
        int res=nums.length;
        for(int i=0;i<nums.length;i++){
            res^=nums[i]^i;
        }
        return res;
    }
}
