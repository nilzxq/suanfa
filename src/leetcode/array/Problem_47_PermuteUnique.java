package leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 47 全排序 去重
 * 相对于 46全排序，加了一个数组排序之后和标志位的功能
 * @Author nilzxq
 * @Date 2020-08-16 9:16
 */
public class Problem_47_PermuteUnique {

    List<List<Integer>> res=new LinkedList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        //记录【路径】
        LinkedList<Integer> track=new LinkedList<>();
        Arrays.sort(nums);
        boolean[] used=new boolean[nums.length];
        backtrack(nums,track,used);
        return res;
    }

    private void backtrack(int[] nums, LinkedList<Integer> track,boolean[] used) {
        //触发结束条件
        if(track.size()==nums.length){
            res.add(new LinkedList(track));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            // 剪枝条件：i > 0 是为了保证 nums[i - 1] 有意义
            // 写 !used[i - 1] 是因为 nums[i - 1] 在深度优先遍历的过程中刚刚被撤销选择

            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }
//            //排除不合法的选择
//            if(track.contains(nums[i])){
//                continue;
//            }
            //做选择
            track.add(nums[i]);
            used[i]=true;
            //进入下一层决策树
            backtrack(nums,track,used);
            //取消选择
            used[i]=false;
            track.removeLast();
        }
    }
}
