package leetcode;

import java.util.LinkedList;

/** 
* @author nilzxq
* @version 2020年2月1日 下午5:07:03 
*类说明 
*/
public class Problem_92_Queue_MyStack {

	public static class MyStack{
		
		private LinkedList<Integer> queue;
		
		public MyStack() {
			queue=new LinkedList<>();
		}
		
		public void push(int x) {
			queue.addLast(x);
		}
		
		public int pop() {
			int size=queue.size();
			for(int i=0;i<size-1;i++) {
				int v=queue.pollFirst();
				queue.addLast(v);
			}
			return queue.pollFirst();
		}
		
		public int top() {
			int size=queue.size();
			for(int i=0;i<size-1;i++) {
				int v=queue.pollFirst();
				queue.addLast(v);
			}
			int v=queue.pollFirst();
			queue.addLast(v);
			return v;
		}
		
		public boolean empty() {
			return queue.isEmpty();
		}
		
		public static void main(String[] args) {
			MyStack stack = new MyStack();

			stack.push(1);
			stack.push(2);  
			System.out.println(stack.top());   // returns 2
			System.out.println(stack.pop());  // returns 2
			System.out.println(stack.empty()); // returns false
		}
	}
}
