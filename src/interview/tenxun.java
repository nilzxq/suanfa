package interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-06 20:04
 */
public class tenxun {

    public static class List {
        int value;
        List next;

        public List(int value) {
            this.value = value;
        }

        public void setNext(List next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List head1 = new List(sc.nextInt());
        List list1 = head1;
        for (int i = 1; i < n; i++) {
            list1.next = new List(sc.nextInt());
            list1 = list1.next;
        }
        int m = sc.nextInt();
        List head2 = new List(sc.nextInt());
        List list2 = head2;
        for (int i = 1; i < m; i++) {
            list2.next = new List(sc.nextInt());
            list2 = list2.next;
        }
        ArrayList<Integer> res=helper1(head1,n,head2,m);
        for(int i=0;i<res.size()-1;i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println(res.get(res.size()-1));
    }

    public static ArrayList helper1(List l1,int n,List l2,int m){
        List longest=l1,shortest=l2;
        List ans=new List(0);
        List temp=ans;
        ArrayList<Integer>  res= new ArrayList<>();
        while(longest!=null){
            if(longest.value==shortest.value){
                res.add(longest.value);
                longest=longest.next;
                shortest=shortest.next;
            }else if(longest.value>shortest.value){
                longest=longest.next;
            }else{
                shortest=shortest.next;
            }
        }
        return res;
    }



}




