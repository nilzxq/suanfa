package leetcode;

import java.util.Stack;

/** 
* @author nilzxq
* @version 2020年5月12日 下午11:26:18 
*类说明 
*/
public class Problem_155_MinStack {
/**
 * https://leetcode-cn.com/problems/min-stack/comments/3253
 */
	    Stack<Integer> stack;
	    /** initialize your data structure here. */
	    public Problem_155_MinStack() {
	       stack=new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	        if(stack.isEmpty()){
	            stack.push(x);
	            stack.push(x);
	        }else{
	            int tmp=stack.peek();
	            stack.push(x);
	            if(tmp<x){
	                stack.push(tmp);
	            }else{
	                stack.push(x);
	            }
	        }
	    }
	    
	    public void pop() {
	        stack.pop();
	        stack.pop();
	    }
	    
	    public int top() {
	        return stack.get(stack.size()-2);
	    }
	    
	    public int getMin() {
	        return stack.peek();
	    }
	    /**
		 * Your MinStack object will be instantiated and called as such:
		 * MinStack obj = new MinStack();
		 * obj.push(x);
		 * obj.pop();
		 * int param_3 = obj.top();
		 * int param_4 = obj.getMin();
		 */
	   
	}

	
