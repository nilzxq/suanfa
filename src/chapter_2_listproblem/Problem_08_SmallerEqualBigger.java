package chapter_2_listproblem;

/**
 * @author nilzxq
 * @version 2018年9月10日 上午9:17:44 类说明
 */

public class Problem_08_SmallerEqualBigger {

	public static class Node {
		public int value;
		public Node next;

		public Node(int data) {
			this.value = data;
		}
	}

	public static Node listPartition1(Node head,int pivot) {
		if(head==null) {
			return head;
		}
		Node cur=head;
		int i=0;
		while(cur!=null) {
			i++;
			cur=cur.next;
		}
		Node[] nodeArr=new Node[i];
		i=0;
		cur=head;
		for(i=0;i!=nodeArr.length;i++) {
			nodeArr[i]=cur;
			cur=cur.next;
		}
		arrPartition(nodeArr,pivot);
		for(i=1;i!=nodeArr.length;i++) {
			nodeArr[i-1].next=nodeArr[i];
		}
		nodeArr[i-1].next=null;
		return nodeArr[0];
	}

	private static void arrPartition(Node[] nodeArr, int pivot) {
		int small=-1;
		int big=nodeArr.length;
		int index=0;
		while(index!=big) {
			if(nodeArr[index].value<pivot) {
				swap(nodeArr,++small,index++);
			}else if(nodeArr[index].value==pivot) {
				index++;
			}else {
				swap(nodeArr,--big,index);
			}
		}
	}
	
	public  static void swap(Node[] nodeArr,int a,int b) {
		Node tmp=nodeArr[a];
		nodeArr[a]=nodeArr[b];
		nodeArr[b]=tmp;
		
	}
	
	public static void printLinkedList(Node node) {
		System.out.println("Linked List:");
		while(node!=null) {
			System.out.println(node.value+" ");
			node=node.next;
		}
		System.out.println();
	}
	
	public static Node listPartition2(Node head,int pivot) {
		Node sH=null;//小的头
		Node sT=null;//小的尾
		Node eH=null;//相等的头
		Node eT=null;//相等的尾
		Node bH=null;//大的头
		Node bT=null;//大的尾
		Node next=null;//保存下一个节点
		//所有节点分进三个链表中
		while(head!=null) {
			next=head.next;
			head.next=null;
			if(head.value<pivot) {
				if(sH==null) {
					sH=head;
					sT=head;
				}else {
					sT.next=head;
					sT=head;
				}
			}else if(head.value==pivot) {
				if(eH==null) {
					eH=head;
					sH=head;
				}else {
					eT.next=head;
					eT=head;
				}
			}else{
				if(bH==null) {
					bH=head;
					bT=head;
				}else {
					bT.next=head;
					bT=head;
				}
			}
			head=next;
		}
		//小的和相等的重新连接
		if(sT!=null) {
			sT.next=eH;
			eT=eT==null?sT:eT;
		}
		//所有的重新连接
		if(eT!=null) {
			eT.next=bH;
		}
		return sH!=null?sH:eH!=null?eH:bH;
	}
	
	public static void main(String[] args) {
		Node head1=new Node(7);
		head1.next=new Node(9);
		head1.next.next=new Node(1);
		head1.next.next.next=new Node(8);
		head1.next.next.next.next=new Node(5);
		head1.next.next.next.next.next=new Node(2);
		head1.next.next.next.next.next.next=new Node(5);
		printLinkedList(head1);
		//head1=listPartition1(head1, 4);
		head1=listPartition2(head1, 4);
		printLinkedList(head1);
	}
}
