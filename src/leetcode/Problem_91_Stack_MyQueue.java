package leetcode;

import java.util.ArrayList;

/** 
* @author nilzxq
* @version 2020年1月31日 下午6:32:05 
*类说明 
*/
public class Problem_91_Stack_MyQueue {

	public static class MyQueue{
		private ArrayList<Integer> in;
		private ArrayList<Integer> out;
		
		public MyQueue() {
			in=new ArrayList<Integer>();
			out=new ArrayList<Integer>();
		}
		
		public void push(int x) {
			in.add(x);
		}
		
		public int pop() {
			if(out.isEmpty()) {
				int size=in.size();
				for(int i=0;i<size;i++) {
					int v=in.remove(in.size()-1);
					out.add(v);
				}
			}
			return out.remove(out.size()-1);
		}
		
		public int peek() {
	        if (out.isEmpty()) {
	            int size = in.size();
	            for (int i = 0; i < size; i++) {
	                int v = in.remove(in.size() - 1);
	                out.add(v);
	            }
	        }

	        return out.get(out.size() - 1);
	    }

	    public boolean empty() {
	        return in.isEmpty() && out.isEmpty();
	    }
	    
	    public static void main(String[] args) {
	    	MyQueue obj = new MyQueue();
	        obj.push(1);
	        obj.push(2);
	    	int param_2 = obj.pop();
	    	int param_3 = obj.peek();
	    	boolean param_4 = obj.empty();
	    	System.out.println(param_2);
	    	System.out.println(param_3);
	    	System.out.println(param_4);
		}
	}
	 
}
