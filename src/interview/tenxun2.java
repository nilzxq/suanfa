package interview;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-06 21:46
 */
public class tenxun2 {
    static class Node {
        public int data;
        public Node next;
        public Node(int data) {
            this.data = data;
        }
        //设置下一个节点
        public void setNext(Node next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            int n =reader.nextInt();
            //head1用来标识第一个链表的头节点
            Node head1=null;
            //temp1用来标识第一个链表的临时节点
            Node temp1=null;
            for(int i = 0; i < n; i++) {
                if(i == 0) {
                    //对头节点进行初始化
                    head1 = new Node(reader.nextInt());
                    temp1 = head1;
                    continue;
                }
                //创建新节点
                Node newNode = new Node(reader.nextInt());
                //设置next节点为新节点
                temp1.setNext(newNode);
                //迭代为下一个节点
                temp1 = temp1.next;

            }
            //head2用来标识第二个链表的头节点
            Node head2=null;
            //temp2用来标识第二个链表的临时节点
            Node temp2=null;
            int m =reader.nextInt();
            for(int i = 0; i < m; i++) {
                if(i == 0) {
                    //对头节点进行初始化
                    head2 = new Node(reader.nextInt());
                    temp2 = head2;
                    continue;
                }
                //创建新节点
                Node newNode = new Node(reader.nextInt());
                //设置next节点为新节点
                temp2.setNext(newNode);
                //迭代为下一个节点
                temp2 = temp2.next;
            }
            //同时遍历两个链表
            while(head1 != null && head2!=null) {
                //如果链表1的当前值小于链表2的当前值
                if(head1.data < head2.data) {
                    //链表1指向下一个节点
                    head1 = head1.next;
                    //如果链表2的当前值小于链表1的当前值
                }else if(head1.data > head2.data) {
                    //链表2指向下一个节点
                    head2 = head2.next;
                }else {
                    //两个链表的当前值相等
                    System.out.print(head1.data + " ");
                    //两个链表都指向下一个节点
                    head1 = head1.next;
                    head2 = head2.next;
                }
            }
        }
    }



