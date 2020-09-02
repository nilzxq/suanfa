package leetcode.stack;

import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2020-09-01 7:47
 */
public class Problem_30_MinStack {
    Stack<Integer> A,B;
    public Problem_30_MinStack(){
        A=new Stack<>();
        B=new Stack<>();
    }

    public void push(int x){
       A.add(x);
       if(B.isEmpty()||B.peek()>=x){
            B.add(x);
       }
    }

    public void pop(){
        if(A.pop().equals(B.peek())){
            B.pop();
        }
    }

    public int top(){
        return A.peek();
    }

    public int min(){
        return B.peek();
    }
}
