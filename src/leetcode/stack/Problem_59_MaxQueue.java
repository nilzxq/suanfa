package leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列中的最大值
 * @Author nilzxq
 * @Date 2020-09-03 9:48
 */
public class Problem_59_MaxQueue {
    Queue<Integer> queue;
    LinkedList<Integer> max;
    public Problem_59_MaxQueue(){
        queue = new LinkedList<>();
        max = new LinkedList<>();//LinkedList是双端链表

    }

    public int max_value(){
        return max.size()==0?-1:max.getFirst();
    }

    public void push_back(int value){
        queue.add(value);
        while(max.size()!=0&&max.getLast()<value){//注意：这里第二个判断条件不能带等号，即max中对于当前queue中的具有相同值的元素会全部存储，而不是存储最近的那个。
            max.removeLast();
        }
        max.add(value);
    }

    public int pop_front() {
        //Integer类型的值的比较不能直接使用==
        if(max.size()!=0&&queue.peek().equals(max.getFirst())){
            max.removeFirst();
        }
        return queue.size()==0?-1:queue.poll();
    }
}
