package interview;

/**
 * @Author nilzxq
 * @Date 2020-08-07 19:12
 *
 * 1->2->4
 * 1->3->4
 * 1->1->2->3->4->4
 */
public class genshuixue1 {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

        public static Node mergeTwoLists(Node n1,Node n2){
            if(n1==null){
                return n2;
            }
            if(n2==null){
                return n1;
            }
            if(n1.data<=n2.data){
                n1.next=mergeTwoLists(n1.next,n2);
                return n1;
            }else{
                n2.next=mergeTwoLists(n1,n2.next);
                return n2;
            }

    }

    //反转每对匹配括号中的字符串

//    public static String reverseParentheses(String s){
//        if(s==null){
//            return s;
//        }
//        char[] arr=s.toCharArray();
////        int num=0;
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]=='('){
////                num++;
////            }
////        }
////        int tmp=0;
////        int length=arr.length;
////        int num=0;
////        StringBuilder str=new StringBuilder();
////        int left=0;
////        int right=length-1;
////        while(left!=right){
////            if(arr[left]=='('&&num%2==0&&arr[right]==')'){
////
////            }
////            while(arr[left]!='('){
////                left++;
////            }
////            while(arr[right]!=')'){
////                right++;
////            }
////            String str1=s.substring(left+1,right);
////
////            left++;
////            right++;
////        }
//    }


    /**
     * 1->2->4
     *  * 1->3->4
     *  * 1->1->2->3->4->4
     * @param args
     */
    public static void main(String[] args) {
//        Node node1=new Node(1);
//        node1.next=new Node(2);
//        node1.next.next=new Node(4);
//        Node node2=new Node(1);
//        node2.next=new Node(3);
//        node2.next.next=new Node(4);
//       Node res=mergeTwoLists(node1,node2);
//       while(res!=null){
//           System.out.print(res.data);
//           res=res.next;
//       }
        Integer a=100;
        Integer b=100;
        System.out.println(a==b);
    }
}
