package book_2018_07_24_stack;
/** 
* @author nilzxq
* @version 2018年7月25日 上午10:04:36 
* 类说明 
*/

import java.util.Stack;

import javax.management.RuntimeErrorException;

public class MyStack1 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;
	
	public MyStack1() {
		this.stackData=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	
	public void push(int newNum) {
		if(this.stackMin.isEmpty()) {
			this.stackMin.push(newNum);
		}else if(newNum<=this.getmin()) {
			this.stackMin.push(newNum);
		}
		
		this.stackData.push(newNum);
	}
	
	public int pop() {
		if(this.stackData.isEmpty()) {
			throw new RuntimeException("you stack is empty.");
		}
		int value=this.stackData.pop();
		if(value==this.getmin()) {
			this.stackMin.pop();
		}
		return value;
	}
	
	public int getmin() {
		if(this.stackMin.isEmpty()) {
			throw new RuntimeException("you stack is empty.");
		}
		return this.stackMin.peek();
	}
	
	public static void main(String[] args) {
		MyStack1 myStack1=new MyStack1();
		myStack1.push(3);
		myStack1.push(4);
		myStack1.push(5);
		myStack1.push(1);
		myStack1.push(2);
		myStack1.push(1);
		System.out.println(myStack1.getmin());
	}
}
