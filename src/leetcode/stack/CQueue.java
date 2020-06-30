package leetcode.stack;

import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2020-06-30 8:10
 */
public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public CQueue(){
        stack1=new Stack<>();
       stack2=new Stack<>();
    }

    public void appendTail(int value){
        stack1.push(value);
    }

    public int deleteHead(){
        //如何两个队列都为空则抛出异常，说明用户没有push进任何元素
//        if(stack1.empty()&&stack2.empty()){
//            throw new RuntimeException("Queue is empty!");
//        }
        //如果stack2不为空直接对stack2执行pop操作
        if(stack2.empty()){
            while(!stack1.empty()){
                //将stack1的元素按后进先出push进stack2⾥⾯
                stack2.push(stack1.pop());
            }
        }
        if(stack2.empty()){
            return -1;
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        /**
         * Your CQueue object will be instantiated and called as such:
         * CQueue obj = new CQueue();
         * obj.appendTail(value);
         * int param_2 = obj.deleteHead();
         */
        CQueue obj=new CQueue();
        obj.appendTail(2);
        int param_2=obj.deleteHead();
        System.out.println(param_2);
    }

}
