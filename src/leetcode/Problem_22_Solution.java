package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nilzxq
 * @version 2020年5月19日 下午3:19:16 类说明
 */
public class Problem_22_Solution {

	private List<String> result;
	public List<String> generateParenthesis(int n) {
		result=new ArrayList<String>();
		generate(0,0,n,"");
		return result;
	}

	private void generate(int left, int right,int n, String s) {
		//terminator
		if(left==n&&right==n) {
			//filter the invalid s 
			//left 随时可以加，只要别超标
			//right 左个数》右个数
			//System.out.println(s);
			result.add(s);
			return;
		}
		//process current logic:left,right
//		String s1=s+"(";
//		String s2=s+")";
		
		//drill down
//		generate(level+1,max,s1);
//		generate(level+1,max,s2);
//		generate(level+1,max,s+"(");
//		generate(level+1,max,s+")");
		if(left<n) generate(left+1,right,n,s+"(");
		if(left>right) generate(left,right+1,n,s+")");
		//reverse states
	}

	public int climbStairs1(int n) {
		if (n == 1 || n == 2) {
			return n;
		}
		return climbStairs1(n - 1) + climbStairs1(n - 2);
	}

	// 爬楼梯 加上记忆搜索
	public int climbStairs(int n) {
		int[] memo = new int[n + 1];
		return helper(memo, n);
	}

	private int helper(int[] memo, int n) {
		if (n == 1 || n == 0) {
			memo[n] = 1;
		} else if (memo[n] == 0) {
			memo[n] = helper(memo, n - 1) + helper(memo, n - 2);
		}
		return memo[n];
	}

	public static void main(String[] args) {
		Problem_22_Solution test = new Problem_22_Solution();
		System.out.println(test.climbStairs(5));
		System.out.println(test.climbStairs1(5));
		System.out.println(test.generateParenthesis(3));

	}
}
