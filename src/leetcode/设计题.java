package leetcode;

import java.util.LinkedList;

/**
 * @Author nilzxq
 * @Date 2020-09-10 15:43
 */
public class 设计题 {
    LinkedList<Integer> res,max;
    public 设计题(){
        res=new LinkedList<>();
        max=new LinkedList<>();
    }
    public int max_value(){
        if(!max.isEmpty()){
            return -1;
        }
        return max.peekFirst();
    }

    public void push_back(int value){
        res.addLast(value);
        while(!max.isEmpty()&&max.peekLast()<value){
            max.removeLast();
        }
        max.addLast(value);
    }

    public int pop_front(){
        if(res.isEmpty()){
            return -1;
        }
        int temp=res.peekFirst();
        if(temp==max.peekFirst()){
            max.removeFirst();
        }
        res.removeFirst();
        return temp;
    }
}
