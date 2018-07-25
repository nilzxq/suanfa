package book_2018_07_24_stack;
/** 
* @author nilzxq
* @version 2018年7月25日 下午4:56:51 
* 类说明 
*/

import java.util.Stack;

public class TwoStackQueue {

	public Stack<Integer> stackPush;
	public Stack<Integer> stackPop;
	public TwoStackQueue() {
		this.stackPop=new Stack<Integer>();
		this.stackPush=new Stack<Integer>();
	}
	public void add(int pushInt) {
		stackPush.push(pushInt);
	}
	
	public int poll() {
		if(stackPop.empty()&&stackPush.empty()) {
			throw new RuntimeException("Queue is empty!");
		}else if(stackPop.empty()) {
			while(!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.pop();
	}
	
	public int peek() {
		if(stackPop.empty()&&stackPush.empty()) {
			throw new RuntimeException("Queue is empty!");
		}else if(stackPop.empty()) {
			while(!stackPush.empty()) {
				stackPop.push(stackPush.pop());
			}
		}
		return stackPop.peek();
	}
}
