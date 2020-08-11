package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年4月23日 下午3:45:42
*类说明
*/
public class Problem_110_List_ReverseList {

	//节点
	public static class Node{
		public int value;
		public Node next;
		public Node(int data) {
			this.value=data;
		}
	}

	//反转链表
	public static Node reverseList(Node head) {
		Node next=null;//指向当前节点的后驱
		Node pre=null;//指向当前节点的前驱
		while(head!=null) {
			next=head.next;
			//当前节点的后驱指向前驱
			head.next=pre;
			pre=head;
			//处理下一个节点
			head=next;
		}
		return pre;
	}

	//递归的方法
	/**
	 * 递归的结束条件就是：当子链表只有一个节点，或者为null时，递归结束
	 */
	public static Node reverseList1(Node head) {
		if(head==null||head.next==null) {
			return head;
		}
		//递归反转链表
		Node newList=reverseList1(head.next);
		head.next.next=head;
		head.next=null;
		return newList;
	}
}
