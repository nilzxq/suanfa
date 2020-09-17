package interview.yun;

import java.util.Stack;

/**
 * 最小栈
 * @Author nilzxq
 * @Date 2020-09-17 9:41
 */
public class M3_1 {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    public M3_1(){
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    public void push(int val){
        if(minStack.isEmpty()||val<=minStack.peek()){
            minStack.push(val);
        }
        stack.push(val);
    }

    public void pop(){
       if(stack.pop().equals(minStack.peek())){
           minStack.pop();
       }
    }

    public int top(){
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}
