package leetcode;

import java.util.Stack;

/** 
* @author nilzxq
* @version 2020年1月26日 下午3:17:57 
*类说明 
*/
public class Problem_86_Stack_DailyTemperatures {

	public static int[] dailyTemperatures(int[] T) {
		int[] res=new int[T.length];
		Stack<Integer> stack=new Stack<>();
		for(int i=T.length-1;i>=0;i--) {
			while(!stack.isEmpty()&&T[i]>=T[stack.peek()])
				stack.pop();
			if(stack.isEmpty())
				res[i]=0;
			else
				res[i]=stack.peek()-i;
			stack.push(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] T= {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res=dailyTemperatures(T);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
	}
}
