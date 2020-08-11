package leetcode.learningAll;

import java.util.Stack;

/**
* @author nilzxq
* @version 2019年12月15日 上午11:35:42
*类说明
*/
public class Problem_46_Other_IsValid {

	public static boolean isValid(String s) {
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='('||ch=='['||ch=='{') {
				stack.add(ch);
			}else {
				if(stack.isEmpty()) return false;
				if(ch==')'&&stack.peek()!='(') return false;
				if(ch==']'&&stack.peek()!='[') return false;
				if(ch=='}'&&stack.peek()!='{') return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String s="(}";
		System.out.println(isValid(s));
	}
}
