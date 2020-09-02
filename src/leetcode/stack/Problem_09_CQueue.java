package leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author nilzxq
 * @Date 2020-08-31 20:11
 */
public class Problem_09_CQueue {
    LinkedList<Integer> A,B;
    public Problem_09_CQueue(){
        A=new LinkedList<>();
        B=new LinkedList<>();
    }

    public void addTail(int value){
        A.addLast(value);
    }

    public int deleteHead(){
        if(!B.isEmpty()){
            B.removeLast();
        }
        if(A.isEmpty()){
            return -1;
        }
        while(!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}
