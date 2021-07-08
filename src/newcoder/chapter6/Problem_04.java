package newcoder.chapter6;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2021-07-08 10:46
 */
public class Problem_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            Deque<Integer> deque=new LinkedList<>();
            boolean convert=false;
            for(int i=0;i<n;i++){
                if(convert){
                    deque.addLast(sc.nextInt());
                }else{
                    deque.addFirst(sc.nextInt());
                }
                convert=!convert;
            }
            if(convert){
                while(deque.size()!=1){
                    System.out.print(deque.pollFirst()+" ");
                }
                System.out.println(deque.pollFirst());
            }else{
                while(deque.size()!=1){
                    System.out.print(deque.pollLast()+" ");
                }
                System.out.println(deque.pollLast());
            }
        }
        sc.close();
    }
}
