package leetcode.array;

import java.util.PriorityQueue;

/**
 * @Author nilzxq
 * @Date 2020-07-23 12:39
 */
public class Problem_215_FindKthLargest {
    public static void main(String[] args) {
        Solution215 s=new Solution215();
        int[] nums={3,2,1,5,6,4};
        int k=2;
        System.out.println(s.findKthLargest(nums,k));
    }

}
class Solution215{
    public int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> res=new PriorityQueue<>();
        for(int num:nums){
            if(res.size()<k){
                res.add(num);
            }else if(res.peek()<num){
                res.poll();
                res.add(num);
            }
        }
        return res.poll();
    }
}
