package interview;

import java.util.Stack;

/** 
* @author nilzxq
* @version 2019年7月31日 下午4:11:18 
*类说明 
*/
//问题：如何实现一个高效的单向链表逆序输出？=>利用栈
public class ReverseSingleList {

	public static class Node {
		public int value;
		public Node next;

		public Node(int data) {
			this.value = data;
		}

		public static void reverseSingleList(Node head) {
			Stack<Integer> stack=new Stack<>();
			while(head!=null) {
				stack.push(head.value);
				head=head.next;
			}
			while(!stack.isEmpty()) {
				System.out.println(stack.pop()+"\t");
			}
		}
	}
	
	public static void main(String[] args) {
		Node head =new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		Node.reverseSingleList(head);
	}

}
