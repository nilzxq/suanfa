package chapter_3_binarytreeproblem;
/** 
* @author nilzxq
* @version 2019年6月30日 上午8:57:18 
* 类说明 
*/
public class Problem_20_MaxDistanceInTree {

	public static class Node{
		public int data;
		public Node left;
		public Node right;
		
		public Node(int value) {
			this.data=value;
		}
	}
	
	public static int maxDistance(Node head) {
		int[] record=new int[1];
		return posOrder(head, record);
	}
	
	public static int posOrder(Node head,int[] record) {
		if(head==null) {
			record[0]=0;
			return 0;
		}
		int lMax=posOrder(head.left, record);
		int maxFromLeft=record[0];
		int rMax=posOrder(head.right, record);
		int maxFromRight=record[0];
		int curNodeMax=maxFromLeft+maxFromRight+1;
		record[0]=Math.max(maxFromRight, maxFromLeft)+1;
		return Math.max(Math.max(lMax, rMax),curNodeMax);
	}
	
	public static void main(String[] args) {
		Node head1 = new Node(1);
		head1.left = new Node(2);
		head1.right = new Node(3);
		head1.left.left = new Node(4);
		head1.left.right = new Node(5);
		head1.right.left = new Node(6);
		head1.right.right = new Node(7);
		head1.left.left.left = new Node(8);
		head1.right.left.right = new Node(9);
		System.out.println(maxDistance(head1));

		Node head2 = new Node(1);
		head2.left = new Node(2);
		head2.right = new Node(3);
		head2.right.left = new Node(4);
		head2.right.right = new Node(5);
		head2.right.left.left = new Node(6);
		head2.right.right.right = new Node(7);
		head2.right.left.left.left = new Node(8);
		head2.right.right.right.right = new Node(9);
		System.out.println(maxDistance(head2));

	}
}
