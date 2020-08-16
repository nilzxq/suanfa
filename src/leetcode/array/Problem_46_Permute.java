package leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 * 46.全排列
 * @Author nilzxq
 * @Date 2020-08-16 8:35
 */
public class Problem_46_Permute {

    List<List<Integer>> res=new LinkedList<>();

    /**
     * 主函数，输入一组不重复的数字，返回它们的全排列
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums){
        //记录【路径】
        LinkedList<Integer> track=new LinkedList<>();
        backtrack(nums,track);
        return res;
    }

    /**
     * 路径：记录在track中
     * 选择列表：nums中不存在于track的那些元素
     * 结束条件：nums中的元素全部在track中出现
     * @param nums
     * @param track
     */
    private void backtrack(int[] nums, LinkedList<Integer> track) {
        //触发结束条件
        if(track.size()==nums.length){
            res.add(new LinkedList(track));
            return;
        }

        for(int i=0;i<nums.length;i++){
            //排除不合法的选择
            if(track.contains(nums[i])){
                continue;
            }
            //做选择
            track.add(nums[i]);
            //进入下一层决策树
            backtrack(nums,track);
            //取消选择
            track.removeLast();
        }
    }


}
