package leetcode;
import java.util.Stack;

/** 
* @author nilzxq
* @version 2019年12月6日 下午9:21:55 
*类说明 
*/
public class Problem_37_Design_MinStack {

	/**
	 * peek()查看栈顶的对象而不移除它
	 */
	public static class MinStack{
		private Stack<Integer> mStack;
		private Stack<Integer> pStack;
		
		public MinStack() {
			pStack=new Stack<>();
			mStack=new Stack<>();
		}
		
		public void push(int x) {
			pStack.push(x);
			if(mStack.isEmpty()||mStack.peek()>=x) {
				mStack.push(x);
			}
		}
		
		public void pop() {
			int x=pStack.pop();
			if(x==mStack.peek()) {
				mStack.pop();
			}
		}
		 public int top() {
			 return pStack.peek();
		 }
		 
		 public int getMin() {
			 return mStack.peek();
		 }
	}

	public static void main(String[] args) {
		 MinStack minStack = new MinStack ();
		 minStack.push (-2); 
		 minStack.push (0); 
		 minStack.push (-3); 
		 System.out.println(minStack.getMin());
		 minStack.pop (); 
		 System.out.println(minStack.top ());
		 System.out.println(minStack.getMin());

	}
}
