package leetcode;

import java.util.Deque;
import java.util.LinkedList;


/**
 * @Author nilzxq
 * @Date 2020-06-14 22:53
 */
public class Problem_59_MaxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums,int k){
        int n=nums.length;
        if(n==0) return nums;
        int[] res=new int[n-k+1];
        //dq里面存的是数组的index,不是数组的值
        Deque<Integer> dq=new LinkedList<>();
        //1：头，移除头部，保证窗口的长度范围
        for(int i=0;i<n;i++){
            if(!dq.isEmpty()&&dq.getFirst()<(i-k+1)){
                dq.removeFirst();//poll();
            }
            //2:尾，移除尾部小于当前值得元素
            while(!dq.isEmpty()&&nums[i]>=nums[dq.getLast()]){
                dq.removeLast();
            }
            //3:尾部加入，滑动窗口向右扩充
            dq.addLast(i);
            //4:头，从头部返回极大值
            if(i>=k-1){
                res[i-k+1]=nums[dq.getFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Problem_59_MaxSlidingWindow maxSlidingWindow=new Problem_59_MaxSlidingWindow();
        int[] nums={1,3,-1,-3,5,3,6,7};
        int[] res=maxSlidingWindow.maxSlidingWindow(nums,3);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
