package leetcode.learningAll;

import java.util.Stack;

/**
* @author nilzxq
* @version 2020年1月27日 下午4:48:30
*类说明
*/
public class Problem_87_Stack_EvalRPN {

	public static int evalRPN(String[] tokens) {
		Stack<Integer> stack=new Stack<>();
		if(tokens.length==0) return 0;
		for(int i=0;i<tokens.length;i++) {
			if(tokens[i].equals("+")||tokens[i].equals("-")
					||tokens[i].equals("*")||tokens[i].equals("/")) {
				if(tokens[i].equals("+")) {
					int num1=stack.peek();
					stack.pop();
					int num2=stack.peek();
					stack.pop();
					stack.push(num1+num2);
				}

				if(tokens[i].equals("-")) {
					int num1=stack.peek();
					stack.pop();
					int num2=stack.peek();
					stack.pop();
					stack.push(num2-num1);
				}

				if(tokens[i].equals("*")) {
					int num1=stack.peek();
					stack.pop();
					int num2=stack.peek();
					stack.pop();
					stack.push(num2*num1);
				}

				if(tokens[i].equals("/")) {
					int num1=stack.peek();
					stack.pop();
					int num2=stack.peek();
					stack.pop();
					stack.push(num2/num1);
				}
			}else
				stack.push(Integer.parseInt(tokens[i]));
		}
		return stack.peek();
	}

	public static void main(String[] args) {
		String[] nums= {"2","1","+", "3", "*"};
		System.out.println(evalRPN(nums));
	}
}
