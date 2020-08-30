package leetcode.list;

import java.util.ArrayList;

/**
 * @Author nilzxq
 * @Date 2020-08-30 6:12
 */
public class Problem_36_TreeToDoublyList {
   static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

   static public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }
        ArrayList<Node> arr=new ArrayList<>();
        inOrder(root,arr);
        Node head=arr.get(0);

       /*头与尾相连*/
       Node tail=arr.get(arr.size()-1);
       tail.right=head;
        head.left=tail;
        Node ptr=head;



        for(int i=1;i<arr.size();i++){
            ptr.right=arr.get(i);
            arr.get(i).left=ptr;
            ptr=ptr.right;
        }
        return head;
    }

    public static void inOrder(Node root, ArrayList<Node> arr){
        if(root==null){
            return;
        }
        inOrder(root.left,arr);
        arr.add(root);
        inOrder(root.right,arr);

    }

    public static void main(String[] args) {
       Node root=new Node(1);
        treeToDoublyList(root);
    }
}
