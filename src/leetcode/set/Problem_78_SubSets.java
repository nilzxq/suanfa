package leetcode.set;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author nilzxq
 * @Date 2020-11-06 8:59
 */
public class Problem_78_SubSets {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,nums,res,new ArrayList<Integer>());
        return res;
    }

    public void backtrack(int i,int [] nums,List<List<Integer>> res,ArrayList<Integer> tmp ){
        res.add(new ArrayList<>(tmp));
        for(int j=i;j<nums.length;j++){
            tmp.add(nums[j]);
            backtrack(j+1,nums,res,tmp);
            tmp.remove(tmp.size()-1);

        }
    }
}
