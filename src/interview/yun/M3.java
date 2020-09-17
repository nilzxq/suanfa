package interview.yun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-16 21:32
 */
public class M3 {
   static class MinStack{
       int val;
       int min;
   }

   static Deque<MinStack> deque;
    public M3() {
        deque=new LinkedList<>();
    }
    public void push(int x){
        MinStack stack=new MinStack();
        stack.val=x;
        if(deque.isEmpty()||deque.peekFirst().min>x){
            stack.min=x;
        }
        deque.offerFirst(stack);
    }

    public int pop(){
        if(deque.isEmpty()){
            return 0;
        }
        return deque.pollFirst().val;
    }

    public int top(){
        return deque.peekFirst().val;
    }

    public int getMin(){
        if(deque.isEmpty()){
            return 0;
        }
        return deque.peekFirst().min;
    }

    public static void main(String[] args) throws IOException {
        M3 minStack=new M3();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        StringBuilder sb=new StringBuilder(num*4);
        for(int i=0;i<num;i++){
            sc.nextLine();
            String str=sc.next();

            switch (str){
                case "push":
                    int val=sc.nextInt();
                    minStack.push(val);
                    break;
                case "getMin":
                    sb.append(minStack.getMin()).append('\n');
                    break;
                case "pop":
                    minStack.pop();
                    break;
                //sb.append(minStack.pop()).append('\n');
                case "top":
                    sb.append(minStack.top()).append('\n');
                    break;
            }
        }
        System.out.println(sb.toString().trim());
//        StreamTokenizer streamTokenizer=new StreamTokenizer(new
//                BufferedReader((new InputStreamReader(System.in))));
//        streamTokenizer.nextToken();
//        int num=(int)streamTokenizer.nval;
//        StringBuilder sb=new StringBuilder(num*4);
//        while(num-->0){
//            streamTokenizer.nextToken();
//            String str=streamTokenizer.toString();
//            switch (str){
//                case "push":
//                    streamTokenizer.nextToken();
//                    int e=(int)streamTokenizer.nval;
//                    minStack.push(e);
//                    break;
//                case "getMin":
//                    sb.append(minStack.getMin()).append('\n');
//                    break;
//                case "pop":
//                    minStack.pop();
//                    break;
//                    //sb.append(minStack.pop()).append('\n');
//                case "top":
//                    sb.append(minStack.top()).append('\n');
//                    break;
//            }
//        }
//        System.out.println(sb.toString().trim());
    }
}
