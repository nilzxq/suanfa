package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author nilzxq
 * @Date 2020-11-10 20:47
 */
public class Problem_22_GenerateParenthesis {
    /**
     * 做减法
     * @param n
     * @return
     */
    public static List<String> generateParenthesis(int n){
        List<String> res=new ArrayList<>();
        if(n==0){
            return res;
        }
        //执行深度优先遍历，搜索可能的结果
        dfs("",n,n,res);
        return res;
    }

    public static void dfs(String curStr,int left,int right,List<String> res){
        if(left==0&&right==0){
            res.add(curStr);
            return;
        }
        //剪枝：左括号可以使用的个数严格大于右括号可以使用的个数，才剪枝
        if(left>right){
            return;
        }

        if(left>0){
            dfs(curStr+"(",left-1,right,res);
        }

        if(right>0){
            dfs(curStr+")",left,right-1,res);
        }
    }

    public static void main(String[] args) {
        List<String> res=generateParenthesis(2);
        System.out.println(res.toString());
    }
}
