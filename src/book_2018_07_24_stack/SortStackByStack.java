package book_2018_07_24_stack;
/** 
* @author nilzxq
* @version 2018年7月26日 下午7:30:28 
* 类说明 
*/

import java.util.Stack;

public class SortStackByStack {

	public static void sortStackByStack(Stack<Integer> stack) {
		Stack<Integer> help=new Stack<Integer>();
		while(!stack.isEmpty()) {
			int cur=stack.pop();
			while(!help.isEmpty()&&help.peek()<cur) {
				stack.push(help.pop());
			}
			help.push(cur);
		}
		while(!help.isEmpty()) {
			stack.push(help.pop());
		}
	}
	
}
