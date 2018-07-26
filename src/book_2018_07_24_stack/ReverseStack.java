package book_2018_07_24_stack;

import java.util.Stack;

/** 
* @author nilzxq
* @version 2018年7月26日 上午9:51:40 
* 类说明 
*/
public class ReverseStack {

	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result=stack.pop();
		if(stack.isEmpty()) {
			return result;
		}else {
			int last=getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}
	}
	
	public static void reverse(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		int i=getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
}
