package book_2018_07_24_stack;
/** 
* @author nilzxq
* @version 2018年7月25日 下午4:08:24 
* 类说明 
*/

import java.util.Stack;


public class MyStack2 {

	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	public MyStack2() {
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	
	public void push(int newNum) {
		if(this.stackMin.isEmpty()) {
			this.stackMin.push(newNum);
		}else if(newNum<this.getmin()) {
			this.stackMin.push(newNum);
		}else {
			int newMin=this.stackMin.peek();
			this.stackMin.push(newMin);
		}
		this.stackData.push(newNum);
	}
	
	public int pop() {
		if(this.stackData.isEmpty()) {
			throw new RuntimeException("you stack is empty.");
		}
		this.stackMin.pop();
		return this.stackData.pop();
	}
	
	public int getmin() {
		if(this.stackMin.isEmpty()) {
			throw new RuntimeException("you stack is empty.");
		}
		return this.stackMin.peek();
	}
}
