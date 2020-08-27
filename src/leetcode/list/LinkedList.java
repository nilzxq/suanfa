package leetcode.list;

/**
 * @Author nilzxq
 * @Date 2020-08-27 18:26
 */
public class LinkedList {
    int length=0;
    class Node{
        int data;
        Node next=null;
        public Node(int data){
            this.data=data;
        }
    }
    //哨兵节点
    Node head=new Node(0);
    //头插法
    public void headInsert(int val){
        //1.构造新结点
        Node newNode=new Node(val);
        //2.新结点指向头结点之后的结点
        newNode.next=head.next;
        //3.头结点指向新结点
        head.next=newNode;
        length++;
    }

    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        int[] arr={1,2,3,4};
        //头插法构造链表
        for(int i=0;i<arr.length;i++){
            linkedList.headInsert(arr[i]);
        }
        Node node=linkedList.head.next;
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }


}
