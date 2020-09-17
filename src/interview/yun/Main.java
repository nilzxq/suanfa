package interview.yun;

import netscape.security.UserTarget;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2020-09-16 22:08
 */
public class Main {

        private int min=Integer.MAX_VALUE;
        private Stack<Integer> stack;

    public Main(){
        stack=new Stack<>();
    }

    public void push(int x){
        if(min>=x){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop(){
        if(stack.pop()==min){
            min=stack.pop();
        }
    }

    public int top(){
        return stack.peek();

    }

    public int getMin(){
        return min;
    }

    public static void main(String[] args) {
        Main minStack=new Main();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.top());
//        System.out.println(minStack.getMin());


        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        StringBuilder sb=new StringBuilder();
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
    }
}
